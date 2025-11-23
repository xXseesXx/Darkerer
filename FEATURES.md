# NotSoDarkerer - Feature Overview

## 🌟 Main Features

### 1. Darkness Control
**Config:** `enableDarknessEffects` (default: false)

Completely disable Darkerer's darkness effects while staying compatible with servers that require the mod.

- ✅ Server compatible (mod still detected)
- ✅ Client-side only (cannot be overridden)
- ⚠️ Requires restart to change

**Use Case:** You're on a server that requires Darkerer but you don't want the darkness.

---

### 2. Night Vision
**Config:** `enableNightVision` (default: false)

Permanent night vision potion effect that refreshes automatically.

- ✅ Works immediately (no restart)
- ✅ Independent of darkness settings
- ✅ Great for cave exploration
- 🌙 Minimal flicker when refreshing

**Use Case:** You want better visibility in dark areas without changing brightness.

---

### 3. Fullbright / Custom Gamma
**Config:** `customGamma` (default: 0.0, range: 0.0 - 10000.0)

Override the game's brightness with extreme values for fullbright mode.

- ✅ Works immediately (no restart)
- ✅ Range from 0 (vanilla) to 10000 (max fullbright)
- ✅ Overrides vanilla brightness slider when > 0
- 🔆 Set to 10000 for true fullbright

**Use Case:** You want maximum brightness everywhere, making everything visible.

---

## 🎮 Usage Scenarios

### Scenario 1: Server Compatibility
**Problem:** Server requires Darkerer but you hate darkness
**Solution:**
```
enableDarknessEffects=false
enableNightVision=false
customGamma=0.0
```
Result: Normal vanilla lighting, server happy ✅

---

### Scenario 2: Maximum Visibility
**Problem:** You want to see EVERYTHING clearly
**Solution:**
```
enableDarknessEffects=false
enableNightVision=true
customGamma=10000.0
```
Result: Night vision + fullbright = ultimate visibility 🌟

---

### Scenario 3: Subtle Enhancement
**Problem:** You want better visibility without it being too obvious
**Solution:**
```
enableDarknessEffects=false
enableNightVision=false
customGamma=5.0
```
Result: Slightly brighter than vanilla, natural looking 💡

---

### Scenario 4: Cave Exploration
**Problem:** Caves are too dark but you don't want fullbright everywhere
**Solution:**
```
enableDarknessEffects=false
enableNightVision=true
customGamma=0.0
```
Result: Night vision for caves, normal brightness otherwise 🕳️

---

### Scenario 5: Hardcore Darkness (Original)
**Problem:** You actually want the darkness experience
**Solution:**
```
enableDarknessEffects=true
enableNightVision=false
customGamma=0.0
```
Result: Full Darkerer experience as intended 🌑

---

## 🔧 Technical Details

### How Night Vision Works
- Applies a 15-second night vision potion effect
- Refreshes when duration drops below 11 seconds
- Uses vanilla Minecraft potion system
- No performance impact

### How Custom Gamma Works
- Directly overrides `GameSettings.gammaSetting`
- Applied every client tick
- When set to 0, vanilla slider is used
- When > 0, overrides vanilla slider
- No performance impact

### Independence
All three features work independently:
- You can use any combination
- Night vision + fullbright = maximum visibility
- Darkness disabled + night vision = enhanced vanilla
- Darkness disabled + fullbright = bright vanilla

---

## 📊 Comparison Table

| Feature | Vanilla | Darkerer | NotSoDarkerer (Default) | NotSoDarkerer (Max) |
|---------|---------|----------|------------------------|---------------------|
| Darkness | Normal | Extreme | Normal | Normal |
| Night Vision | Manual | No | Optional | Yes |
| Gamma Range | 0-1 | 0-1 | 0-10000 | 10000 |
| Server Compat | N/A | Required | ✅ | ✅ |
| Client Control | N/A | No | ✅ | ✅ |

---

## 🎯 Recommended Settings

### For Most Users (Default)
```
enableDarknessEffects=false
enableNightVision=false
customGamma=0.0
```
Normal vanilla experience, server compatible.

### For PvP/Competitive
```
enableDarknessEffects=false
enableNightVision=true
customGamma=10000.0
```
Maximum visibility advantage.

### For Builders
```
enableDarknessEffects=false
enableNightVision=false
customGamma=100.0
```
Bright enough to see details, not too extreme.

### For Explorers
```
enableDarknessEffects=false
enableNightVision=true
customGamma=2.0
```
Night vision for caves, slightly brighter surface.

---

## 💡 Pro Tips

1. **Fullbright Values:**
   - 1.0 = Vanilla max
   - 10.0 = Noticeably brighter
   - 100.0 = Very bright
   - 1000.0 = Extremely bright
   - 10000.0 = Maximum fullbright

2. **Night Vision + Fullbright:**
   - Combining both gives the absolute best visibility
   - Night vision adds color enhancement
   - Fullbright removes all shadows

3. **Performance:**
   - All features have zero performance impact
   - Safe to use on any system

4. **Server Rules:**
   - Check if your server allows these features
   - Some servers may consider fullbright unfair
   - Night vision is usually acceptable

5. **Quick Toggle:**
   - Edit config file while game is running
   - Only `enableDarknessEffects` needs restart
   - Other settings apply immediately
