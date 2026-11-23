# IronWill

An Android workout tracker and progress analytics app built with Kotlin and Jetpack Compose. Instead of only logging sets, IronWill converts workout data into clear charts and predicts your next Personal Record (PR) using the Epley formula.

## Core Features
- **Authentication:** Sign in or sign up using Email/Password or Google Sign-In.
- **Workout Logging:** Fast set logging (weight and reps) with a built-in rest timer and a "Previous" column showing last session's performance.
- **Exercise Library:** Searchable exercise list filterable by muscle group, displaying your best performance for each lift.
- **Exercise Detail:** Progress chart, session history, and next PR prediction based on the Epley formula: `1RM = Weight * (1 + Reps / 30)`.
- **Stats Dashboard:** Weekly training volume chart with week-over-week percentage change and muscle group progress tracking.
- **Account & Settings:** Configurable weight units (KG / LBS), default rest timer duration, and notifications.

## Screens & Navigation
- **Auth Flow:** Login and Sign Up screens with direct navigation between them.
- **Bottom Navigation Bar:** Home, Library, Stats, and Account.
- **Secondary Screens:** Workout Logging (launched from Home) and Exercise Detail (launched from Library).

## Tech Stack
- **UI/UX Design:** Google Stitch -> [Figma](https://www.figma.com/design/Rb8rkhiV3k6RwGsSD9FVMz/IronWill?node-id=0-1&t=JFJyvDJDhhc3uHHD-1)
- **Development:** Kotlin, Jetpack Compose (Material 3), Android Studio
- **Minimum SDK:** API 24 (Android 7.0)

## Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/shinnoxi/IronWill.git git clone [https://github.com/shinnoxi/IronWill.git](https://github.com/shinnoxi/IronWill.git)
## Context
Developed as a Mobile Application Development course project.