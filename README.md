# CopilotAndroidVSA - Camera Application

Application Android avec sélection de caméra (avant/arrière) et flux vidéo en temps réel utilisant Jetpack Compose et Material Design.

## Fonctionnalités

- ✅ Sélection caméra avant/arrière
- ✅ Flux vidéo en temps réel avec CameraX
- ✅ Interface Material Design 3
- ✅ Gestion des permissions
- ✅ Tests automatiques (unitaires et instrumentés)
- ✅ Architecture MVC

## Prérequis

- Android Studio Koala ou plus récent
- JDK 17
- Android SDK 24+ (compilée pour SDK 34)
- Appareil Android ou émulateur avec caméra

## Import dans Android Studio

1. Ouvrir Android Studio
2. Choisir `Open` ou `Open an existing project`
3. Sélectionner le dossier du projet
4. Laisser Gradle synchroniser le projet

## Structure du projet

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/copilotandroidvsa/
│   │   │   ├── MainActivity.kt
│   │   │   └── ui/
│   │   │       ├── screen/
│   │   │       │   └── CameraScreen.kt
│   │   │       └── theme/
│   │   │           ├── Theme.kt
│   │   │           └── Type.kt
│   │   ├── AndroidManifest.xml
│   │   └── res/
│   ├── test/
│   │   └── java/
│   └── androidTest/
│       └── java/
├── build.gradle.kts
└── proguard-rules.pro
```

## Dépendances principales

- **CameraX** : `androidx.camera:camera-core`, `camera-camera2`, `camera-lifecycle`, `camera-view`
- **Jetpack Compose** : UI déclarative
- **Accompanist Permissions** : Gestion simplifiée des permissions
- **Material Design 3** : Design system

## Utilisation

1. Lancer l'application
2. Accepter la permission caméra
3. Voir le flux vidéo en temps réel de la caméra arrière
4. Cliquer sur l'icône de basculement pour passer à la caméra avant
5. Cliquer à nouveau pour revenir à la caméra arrière

## Tests

### Tests unitaires
```bash
./gradlew test
```

### Tests instrumentés (sur appareil/émulateur)
```bash
./gradlew connectedAndroidTest
```

## Architecture

L'application suit l'architecture MVC :
- **Model** : Logique métier (futur)
- **View** : Composables Jetpack Compose (`CameraScreen`)
- **Controller** : Activité principale (`MainActivity`)

## Versions

- Kotlin : 1.9.24
- Compose Compiler : 1.5.14
- SDK Android : 34
- Min SDK : 24
