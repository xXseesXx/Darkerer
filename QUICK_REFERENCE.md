# NotSoDarkerer - Quick Reference Card

## 📦 Installation
1. Download `darkerer-1.0.6-master+86ff8a786e-dirty.jar`
2. Place in `mods/` folder
3. Launch Minecraft
4. Config created at `config/darkerer.cfg`

## ⚙️ Config Location
```
config/darkerer.cfg
```

## 🎛️ Main Settings (All Client-Side)

| Setting | Default | Range | Restart? | Description |
|---------|---------|-------|----------|-------------|
| `enableDarknessEffects` | false | true/false | ✅ Yes | Enable/disable darkness |
| `enableNightVision` | false | true/false | ❌ No | Permanent night vision |
| `customGamma` | 0.0 | 0.0-10000.0 | ❌ No | Brightness override |

## 🚀 Quick Configs

### Normal (Default)
```ini
B:enableDarknessEffects=false
B:enableNightVision=false
D:customGamma=0.0
```

### Fullbright
```ini
B:enableDarknessEffects=false
B:enableNightVision=false
D:customGamma=10000.0
```

### Night Vision
```ini
B:enableDarknessEffects=false
B:enableNightVision=true
D:customGamma=0.0
```

### Maximum Visibility
```ini
B:enableDarknessEffects=false
B:enableNightVision=true
D:customGamma=10000.0
```

## 💡 Gamma Values

| Value | Effect |
|-------|--------|
| 0.0 | Use vanilla slider |
| 1.0 | Vanilla default |
| 5.0 | Slightly brighter |
| 100.0 | Very bright |
| 1000.0 | Extremely bright |
| 10000.0 | Maximum fullbright |

## ✅ Features

- ✅ Server compatible (still detected as Darkerer)
- ✅ Client-side control (cannot be overridden)
- ✅ No performance impact
- ✅ Works independently (mix and match)
- ✅ Instant effect (except darkness toggle)

## 🔧 Troubleshooting

| Problem | Solution |
|---------|----------|
| Config not working | Check file location: `config/darkerer.cfg` |
| Darkness still enabled | Set `enableDarknessEffects=false` and restart |
| Fullbright not working | Set `customGamma=10000.0` (no restart needed) |
| Night vision flickering | Normal behavior (refreshes every few seconds) |

## 📝 Notes

- Only `enableDarknessEffects` requires restart
- `enableNightVision` and `customGamma` apply immediately
- All settings are client-side only
- Server configs (mode, darkNether, etc.) still sync from server
- Mod ID is still "darkerer" for server compatibility

## 🌐 Links

- Original Darkerer: https://github.com/glowredman/Darkerer
- Based on Hardcore Darkness by lumien

## 📄 Documentation

- `MODIFICATIONS.md` - Overview of changes
- `CONFIG_GUIDE.md` - Detailed configuration guide
- `FEATURES.md` - Complete feature documentation
- `SUMMARY.md` - Technical summary
