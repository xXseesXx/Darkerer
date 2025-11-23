# NotSoDarkerer Configuration Guide

## Quick Start

By default, NotSoDarkerer has darkness effects **DISABLED**. You can play with normal vanilla lighting while staying compatible with servers that require Darkerer.

## Config Location

After running Minecraft once with the mod installed, the config file will be created at:
```
config/darkerer.cfg
```

## Client-Side Settings

NotSoDarkerer adds three powerful client-side settings that give you full control over your lighting experience:

### 1. enableDarknessEffects

Controls whether Darkerer's darkness effects are applied:

```
# CLIENT-SIDE ONLY: Enable or disable all darkness effects. When disabled, you get normal vanilla lighting while staying compatible with servers that require Darkerer
# [default: false]
B:enableDarknessEffects=false
```

**Options:**
- `false` (default) - Normal vanilla lighting, no darkness effects
- `true` - Enable Darkerer's hardcore darkness effects

**Important Notes:**
- ✅ This setting is **CLIENT-SIDE ONLY** - servers cannot override it
- ⚠️ Requires a **Minecraft restart** to take effect
- 🔒 All other Darkerer settings (mode, darkNether, etc.) are still synced from servers

### 2. enableNightVision

Applies a permanent night vision potion effect:

```
# CLIENT-SIDE ONLY: Enable permanent night vision effect. Works independently of darkness effects
# [default: false]
B:enableNightVision=false
```

**Options:**
- `false` (default) - No night vision effect
- `true` - Permanent night vision (refreshes automatically)

**Important Notes:**
- ✅ Takes effect **immediately** (no restart required)
- 🌙 Works even when `enableDarknessEffects=true`
- 💡 Great for exploring caves and dark areas

### 3. customGamma

Override the game's brightness/gamma setting:

```
# CLIENT-SIDE ONLY: Custom gamma/brightness value. Range: 0.0 to 10000.0. Vanilla default is 1.0, set to 10000 for fullbright. Set to 0 to use vanilla gamma setting
# [default: 0.0]
D:customGamma=0.0
```

**Options:**
- `0.0` (default) - Use vanilla gamma setting (no override)
- `1.0` - Vanilla default brightness
- `100.0` - Very bright
- `1000.0` - Extremely bright
- `10000.0` - Maximum fullbright mode

**Important Notes:**
- ✅ Takes effect **immediately** (no restart required)
- 🔆 Overrides the vanilla brightness slider when > 0
- 🌟 Set to 10000 for true fullbright experience
- 🎮 Set to 0 to use your normal brightness slider

## Other Settings

When `enableDarknessEffects=true`, these server-synced settings control the darkness behavior:

### mode
How darkness behaves:
- `EVERYWHERE` - Complete darkness everywhere at night
- `ONLY_INSIDE` - Small amount of light remains at surface
- `MOON_PHASE` - Light level depends on moon phase

### Dimension Settings
- `darkNether` - Whether Nether is dark (default: true)
- `darkEnd` - Whether End is dark (default: false)
- `darkTwilightForest` - Whether Twilight Forest is dark (default: false)

### dimBlocklist
List of dimension IDs where Darkerer is completely disabled
```
I:dimBlocklist <
 >
```

## Example Configurations

### Normal Lighting (Default)
```
B:enableDarknessEffects=false
B:enableNightVision=false
D:customGamma=0.0
```
Perfect for players who want vanilla lighting while staying compatible with servers.

### Fullbright Mode (Recommended)
```
B:enableDarknessEffects=false
B:enableNightVision=false
D:customGamma=10000.0
```
Maximum brightness everywhere - see everything clearly without any darkness.

### Night Vision Only
```
B:enableDarknessEffects=false
B:enableNightVision=true
D:customGamma=0.0
```
Normal brightness with night vision effect for better visibility in dark areas.

### Extreme Visibility (Night Vision + Fullbright)
```
B:enableDarknessEffects=false
B:enableNightVision=true
D:customGamma=10000.0
```
Combine both effects for absolute maximum visibility.

### Full Darkness Experience
```
B:enableDarknessEffects=true
B:enableNightVision=false
D:customGamma=0.0
```
Enable Darkerer's hardcore darkness (all other settings controlled by server).

## Troubleshooting

**Q: I changed the config but nothing happened**
A: Only `enableDarknessEffects` requires a restart. `enableNightVision` and `customGamma` take effect immediately. Make sure you're editing the right config file at `config/darkerer.cfg`.

**Q: The server is forcing darkness on me**
A: Check that `enableDarknessEffects=false` in your config. This setting cannot be overridden by servers.

**Q: I want darkness but the server has it disabled**
A: Set `enableDarknessEffects=true` in your config. However, note that other settings like `mode` will still be synced from the server.

**Q: Fullbright isn't working**
A: Make sure `customGamma` is set to a value greater than 0 (try 10000.0 for maximum brightness). The setting takes effect immediately without a restart.

**Q: Night vision keeps flickering**
A: This is normal - the mod refreshes the effect every few seconds to keep it permanent. The flicker is minimal and shouldn't affect gameplay.

**Q: Can I use night vision and fullbright together?**
A: Yes! They work independently. Set both `enableNightVision=true` and `customGamma=10000.0` for maximum visibility.

**Q: Does customGamma affect my vanilla brightness slider?**
A: When `customGamma > 0`, it overrides the vanilla slider. Set it to `0.0` to use your normal brightness slider again.
