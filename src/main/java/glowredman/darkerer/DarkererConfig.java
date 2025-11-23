package glowredman.darkerer;

import com.gtnewhorizon.gtnhlib.config.Config;

@Config(modid = Darkerer.MODID)
public class DarkererConfig {

    @Config.Comment("CLIENT-SIDE ONLY: Enable or disable all darkness effects. When disabled, you get normal vanilla lighting while staying compatible with servers that require Darkerer")
    @Config.DefaultBoolean(false)
    @Config.RequiresMcRestart
    public static boolean enableDarknessEffects;

    @Config.Comment("CLIENT-SIDE ONLY: Enable permanent night vision effect. Works independently of darkness effects")
    @Config.DefaultBoolean(false)
    public static boolean enableNightVision;

    @Config.Comment("CLIENT-SIDE ONLY: Custom gamma/brightness value. Range: 0.0 to 10000.0. Vanilla default is 1.0, set to 10000 for fullbright. Set to 0 to use vanilla gamma setting")
    @Config.DefaultDouble(0.0)
    @Config.RangeDouble(min = 0.0, max = 10000.0)
    public static double customGamma;

    @Config.Comment("""
        How Darkerer should behave
         EVERYWHERE: complete darkness at night, except near block light sources (torches, lava, etc.)
         ONLY_INSIDE: a small amount of light remains at the surface, even during the night
         MOON_PHASE: like ONLY_INSIDE but the remaining light depends on the moon phase""")
    @Config.DefaultEnum("EVERYWHERE")
    @Config.Sync
    public static Mode mode;

    @Config.Comment("Whether or not the Nether should be dark")
    @Config.DefaultBoolean(true)
    @Config.Sync
    public static boolean darkNether;

    @Config.Comment("Whether or not the End should be dark")
    @Config.DefaultBoolean(false)
    @Config.Sync
    public static boolean darkEnd;

    @Config.Comment("Whether or not the Twilight Forest should be dark")
    @Config.DefaultBoolean(false)
    @Config.Sync
    public static boolean darkTwilightForest;

    @Config.Comment("Attempts to remove the blue sky light that occurs when using mode NO_MIN_BLOCK_LIGHT or MOON_PHASE")
    @Config.DefaultBoolean(true)
    @Config.Sync
    public static boolean removeBlueSkyLight;

    @Config.Comment("A list of dimension ids in which Darkerer will be completely disabled")
    @Config.DefaultIntList({})
    @Config.Sync
    public static int[] dimBlocklist;
}
