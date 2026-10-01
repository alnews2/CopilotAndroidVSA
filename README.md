# CopilotAndroidVSA

Application Android minimale en Kotlin avec Jetpack Compose, Material Design et tests automatiques.

## Prérequis

- Android Studio Koala ou plus récent
- JDK 17
- Android SDK installé via Android Studio

## Import dans Android Studio

1. Ouvrir Android Studio
2. Choisir `Open` ou `Open an existing project`
3. Sélectionner le dossier du projet
4. Laisser Gradle synchroniser le projet

## Structure

- `app/` : module principal Android
- `build.gradle.kts` : configuration Gradle du projet
- `settings.gradle.kts` : inclusion du module `app`

## Fonctionnement

L'application affiche un écran Hello World avec un thème Material 3.

## Tests

- Tests unitaires : `app/src/test`
- Tests instrumentés : `app/src/androidTest`

## Version de référence

- Kotlin : 1.9.24
- Compose Compiler : 1.5.14
- SDK Android : 34
