package glowredman.darkerer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import com.gtnewhorizon.gtnhlib.eventbus.EventBusSubscriber;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.relauncher.Side;

@EventBusSubscriber(side = Side.CLIENT)
public class ClientEffectsHandler {

    private static final int NIGHT_VISION_DURATION = 300; // 15 seconds in ticks
    private static final int NIGHT_VISION_REFRESH_THRESHOLD = 220; // Refresh when below 11 seconds

    @SubscribeEvent
    public static void onClientTick(ClientTickEvent event) {
        if (event.phase == Phase.START) {
            return;
        }

        Minecraft mc = Minecraft.getMinecraft();
        EntityPlayer player = mc.thePlayer;

        if (player == null || mc.theWorld == null) {
            return;
        }

        // Apply custom gamma
        applyCustomGamma(mc.gameSettings);

        // Apply night vision effect
        applyNightVision(player);
    }

    private static void applyCustomGamma(GameSettings settings) {
        if (DarkererConfig.customGamma > 0.0) {
            // Override gamma with custom value
            settings.gammaSetting = (float) DarkererConfig.customGamma;
        }
        // If customGamma is 0, don't touch gamma (use vanilla setting)
    }

    private static void applyNightVision(EntityPlayer player) {
        if (!DarkererConfig.enableNightVision) {
            return;
        }

        PotionEffect currentEffect = player.getActivePotionEffect(Potion.nightVision);

        // Add or refresh night vision effect
        if (currentEffect == null || currentEffect.getDuration() < NIGHT_VISION_REFRESH_THRESHOLD) {
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, NIGHT_VISION_DURATION, 0));
        }
    }
}
