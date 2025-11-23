# NotSoDarkerer - Modified Darkerer

## What is this?

This is a modified version of the Darkerer mod that adds a client-side config option to disable all darkness effects while remaining compatible with servers that require Darkerer to be installed.

## Changes Made

### Version: 1.0.6

**Modified Files:**
1. `src/main/java/glowredman/darkerer/DarkererConfig.java`
   - Added new `enableDarknessEffects` config option (default: `false`)
   - Added `enableNightVision` config option for permanent night vision
   - Added `customGamma` config option (0-10000) for fullbright
   - All new options are CLIENT-SIDE ONLY and won't be synced from servers
   - Moved `@Config.Sync` to individual fields instead of the class level

2. `src/main/java/glowredman/darkerer/DarkererEventHandler.java`
   - Modified to check `enableDarknessEffects` config before applying darkness
   - When disabled, sets `DarkererCore.enabled = false`
   - When enabled, uses original dimension-based logic

3. `src/main/java/glowredman/darkerer/ClientEffectsHandler.java` (NEW)
   - Handles client-side night vision effect application
   - Manages custom gamma/brightness override
   - Runs independently of darkness effects

4. `src/main/resources/mcmod.info`
   - Changed mod name from "Darkerer" to "NotSoDarkerer"
   - Updated description to reflect the modification

## How It Works

- **Server Compatibility**: The mod still has the same `modid` ("darkerer"), so servers will detect it as the original Darkerer mod
- **Configurable Darkness**: Toggle darkness effects on/off via the config file
- **Night Vision**: Optional permanent night vision potion effect
- **Fullbright Mode**: Custom gamma slider up to 10000 for extreme brightness
- **Client-Side Control**: All new settings are NOT synced from servers, so you have full control
- **Default Disabled**: By default, darkness effects are OFF for a normal vanilla lighting experience

## Installation

1. Use the jar file: `darkerer-1.0.6-master+86ff8a786e-dirty.jar`
2. Place it in your mods folder just like the original Darkerer mod
3. By default, you'll have normal lighting while staying compatible with servers that require Darkerer

## Configuration

The config file will be located at: `config/darkerer.cfg`

**Key Settings (All CLIENT-SIDE ONLY):**

1. `enableDarknessEffects` (default: `false`) - Requires restart
   - `false` = Normal vanilla lighting (recommended for most users)
   - `true` = Enable Darkerer's darkness effects

2. `enableNightVision` (default: `false`)
   - `false` = No night vision effect
   - `true` = Permanent night vision potion effect

3. `customGamma` (default: `0.0`, range: 0.0 to 10000.0)
   - `0.0` = Use vanilla gamma setting (no override)
   - `1.0` = Vanilla default brightness
   - `10000.0` = Maximum fullbright mode
   - Any value in between for custom brightness

**Note:** `enableDarknessEffects` requires a Minecraft restart. Other settings take effect immediately. Server configs for other Darkerer settings (like `mode`, `darkNether`, etc.) will still be synced from the server.

## Original Mod

Original Darkerer by glowredman: https://github.com/glowredman/Darkerer
Based on Hardcore Darkness by lumien
