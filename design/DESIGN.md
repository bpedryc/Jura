# OpenDesign App Specification

## App Overview
A mobile app for Android and iOS to browse climbing crags, view sectors and climbs, and log ascents.

---

## Global Components

### Top App Bar
- **Left**: Logo (minimalistic designed rock).
- **Right**: Profile Picture button.
  - *Logged Out*: Tap navigates to the **Authentication Screen**.
  - *Logged In*: Tap navigates to the **Profile Tab**.

### Bottom Navigation
Three navigation tabs: **Browse**, **Map**, and **Profile**.

---

## Tabs & Screens

### 1. Browse Screen
- **Search Bar**: Top search query for Regions, Sectors, or Climbs.
  - If a Climb is selected, redirects directly to the **Climbs Screen** for that sector.
- **Region List**: List of climbing regions (e.g., "Dolina Kobylańska").
  - Card elements: Thumbnail image, name, and total routes count per grade band.
- **Sector List Screen** (Navigated on Region tap):
  - Lists sectors within the region (e.g., "Kula", "Mnich").
  - **Bypass Rule**: If the region has exactly 1 sector, bypass this list and navigate directly to the **Climbs Screen**.
- **Climbs Screen** (Navigated from a Sector):
  - Lists all climbs in the sector.
  - Row elements: Climb Name, Grade (displays both UIAA and French scales, e.g., "VI.1+ / 6a+"), and a Checkbox.
  - Tapping the Checkbox marks the route as climbed (adds to Profile ascents).
  - **Filters**: Grade range, Sector, Region, and Name.

### 2. Map Screen
- Interactive map with location pins for all climbing sectors.
- Tapping a sector pin navigates directly to the **Climbs Screen** for that sector.

### 3. Profile Screen
- **Header**: User name and profile picture.
- **Ascents Feed**: Scrollable list of ticked/climbed routes ordered from latest to oldest.
