# NotSoDarkerer v1.0.6 - Summary

## What We Built

A modified version of Darkerer that gives players full control over lighting through three powerful client-side features:
1. Darkness toggle
2. Permanent night vision
3. Custom gamma/fullbright (up to 10000x)

All while maintaining compatibility with servers that require the mod.

## Key Features

✅ **Client-Side Control** - New `enableDarknessEffects` config option (default: OFF)
✅ **Server Compatible** - Still detected as "darkerer" mod by servers
✅ **No Sync Override** - Your darkness preference cannot be overridden by servers
✅ **User-Friendly** - Defaults to normal lighting for best experience
✅ **Flexible** - Can still enable darkness if desired

## Technical Changes

### 1. DarkererConfig.java
- Removed class-level `@Config.Sync` annotation
- Added `enableDarknessEffects` boolean field (default: false)
  - Marked with `@Config.RequiresMcRestart`
  - NOT marked with `@Config.Sync` (client-side only)
- Added `enableNightVision` boolean field (default: false)
  - Client-side only, no restart required
- Added `customGamma` double field (default: 0.0, range: 0-10000)
  - Client-side only, no restart required
- Added `@Config.Sync` to all other individual fields

### 2. DarkererEventHandler.java
- Added check for `enableDarknessEffects` config
- If false: sets `DarkererCore.enabled = false` and returns early
- If true: uses original dimension-based logic

### 3. ClientEffectsHandler.java (NEW)
- Handles permanent night vision effect application
- Manages custom gamma/brightness override
- Runs every client tick
- Independent of darkness effects

### 4. mcmod.info
- Changed display name to "NotSoDarkerer"
- Updated description to reflect the modification

## Build Output

**Main Jar:** `darkerer-1.0.6-master+86ff8a786e-dirty.jar`
- Size: ~14KB
- Version: 1.0.6
- Compatible with Minecraft 1.7.10

## How It Works

```
Server Check → ✅ Mod Present (modid: "darkerer")
                ↓
Client Config → enableDarknessEffects?
                ↓
        NO (default) → Normal Lighting
                ↓
        YES → Check Dimension → Apply Darkness
```

## Usage

1. Install the jar in your mods folder
2. Launch Minecraft (darkness effects are OFF by default)
3. Optional: Edit `config/darkerer.cfg` to enable darkness
4. Restart Minecraft if you changed the config

## Why This Approach?

- **Simple**: One config option controls everything
- **Safe**: Defaults to normal lighting (most user-friendly)
- **Flexible**: Can still enable darkness if wanted
- **Compatible**: Servers see the mod as installed
- **Clean**: No hacky workarounds or background threads

## Files Modified

```
src/main/java/glowredman/darkerer/DarkererConfig.java
src/main/java/glowredman/darkerer/DarkererEventHandler.java
src/main/resources/mcmod.info
```

## Documentation Created

- `MODIFICATIONS.md` - Overview of changes
- `CONFIG_GUIDE.md` - Detailed configuration guide
- `SUMMARY.md` - This file
