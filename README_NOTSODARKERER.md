# NotSoDarkerer v1.0.6

A modified version of [Darkerer](https://github.com/glowredman/Darkerer) that adds client-side control over lighting effects.

## 🎯 What Does It Do?

NotSoDarkerer lets you:
- ✅ **Disable darkness** while staying compatible with servers that require Darkerer
- 🌙 **Enable permanent night vision** for better visibility
- 🔆 **Use fullbright mode** with gamma values up to 10000x
- 🎮 **Mix and match** all features independently

## 🚀 Quick Start

1. Download `darkerer-1.0.6-master+86ff8a786e-dirty.jar`
2. Place in your `mods/` folder
3. Launch Minecraft
4. Edit `config/darkerer.cfg` (optional)

**Default behavior:** Normal vanilla lighting, server compatible ✅

## ⚙️ Configuration

All settings are **CLIENT-SIDE ONLY** and cannot be overridden by servers.

### Disable Darkness (Requires Restart)
```ini
B:enableDarknessEffects=false
```

### Enable Night Vision (Instant)
```ini
B:enableNightVision=true
```

### Enable Fullbright (Instant)
```ini
D:customGamma=10000.0
```

## 📖 Documentation

- **[QUICK_REFERENCE.md](QUICK_REFERENCE.md)** - Quick setup guide
- **[CONFIG_GUIDE.md](CONFIG_GUIDE.md)** - Detailed configuration
- **[FEATURES.md](FEATURES.md)** - Complete feature list
- **[MODIFICATIONS.md](MODIFICATIONS.md)** - Technical changes
- **[SUMMARY.md](SUMMARY.md)** - Development summary

## 🌟 Popular Configurations

### Maximum Visibility (Recommended)
```ini
B:enableDarknessEffects=false
B:enableNightVision=true
D:customGamma=10000.0
```

### Fullbright Only
```ini
B:enableDarknessEffects=false
B:enableNightVision=false
D:customGamma=10000.0
```

### Night Vision Only
```ini
B:enableDarknessEffects=false
B:enableNightVision=true
D:customGamma=0.0
```

## 🔧 Features

| Feature | Default | Restart? | Description |
|---------|---------|----------|-------------|
| Darkness Toggle | OFF | Yes | Enable/disable darkness effects |
| Night Vision | OFF | No | Permanent night vision potion |
| Custom Gamma | 0.0 | No | Brightness override (0-10000) |

## ❓ FAQ

**Q: Will this work on servers?**
A: Yes! The mod is still detected as "darkerer" by servers.

**Q: Can servers override my settings?**
A: No! All new settings are client-side only.

**Q: Is this considered cheating?**
A: Check your server's rules. Some servers may not allow fullbright.

**Q: Does it affect performance?**
A: No performance impact at all.

**Q: Can I use this in singleplayer?**
A: Absolutely! Works in both singleplayer and multiplayer.

## 🏗️ Building from Source

```bash
git clone https://github.com/xXseesXx/Darkerer.git
cd Darkerer
$env:JAVA_HOME="C:\Program Files\Java\jdk-17"
.\gradlew.bat build
```

Output: `build/libs/darkerer-1.0.6-master+86ff8a786e-dirty.jar`

## 📝 Credits

- **Original Darkerer:** [glowredman](https://github.com/glowredman/Darkerer)
- **Based on:** Hardcore Darkness by lumien
- **Modified by:** xXseesXx

## 📄 License

Same as original Darkerer mod.

## 🔗 Links

- Original Darkerer: https://github.com/glowredman/Darkerer
- This Fork: https://github.com/xXseesXx/Darkerer

---

**Minecraft Version:** 1.7.10  
**Mod Version:** 1.0.6  
**Requires:** Forge 1.7.10-10.13.4.1614+
