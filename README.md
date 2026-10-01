# CopilotAndroidVSA - Camera Application

Application Android complète avec caméra avant/arrière, menu 3 points, zoom par pincement gestuel, responsive portrait/paysage, et support full-screen.

## ✨ Fonctionnalités

- 📷 Sélection caméra avant/arrière via menu vertical (⋮)
- 🎯 Flux vidéo en temps réel avec CameraX
- 🔍 Zoom par geste de pincement (1x à 5x)
- 📱 Support portrait et paysage (responsive)
- 🎨 Interface Material Design 3
- 💾 Persistance du choix de caméra lors des rotations
- ❌ Option Quitter l'application
- 🔐 Gestion automatique des permissions
- ✅ Tests automatiques (unitaires et instrumentés)
- 🏗️ Architecture MVC

## 📋 Prérequis

- Android Studio Koala ou plus récent
- JDK 17
- Android SDK 24+ (compilé pour SDK 34)
- Appareil Android ou émulateur avec caméra

## 📥 Import dans Android Studio

1. Ouvrir Android Studio
2. Choisir `Open` ou `Open an existing project`
3. Sélectionner le dossier du projet
4. Laisser Gradle synchroniser complètement
5. Lancer sur un appareil/émulateur

## 🏗️ Structure du projet

```
app/
├── src/
│   ├── main/
│   ��   ├── java/com/example/copilotandroidvsa/
│   │   │   ├── MainActivity.kt
│   │   │   └── ui/
│   │   │       ├── screen/
│   │   │       │   └── CameraScreen.kt
│   │   │       └── theme/
│   │   │           ├── Theme.kt
│   │   │           └── Type.kt
│   │   ├── AndroidManifest.xml
│   │   └── res/values/strings.xml
│   ├── test/
│   └── androidTest/
├── build.gradle.kts
└── proguard-rules.pro
```

## 📦 Dépendances principales

- **CameraX** : `androidx.camera:camera-core:1.3.4`, `camera-camera2`, `camera-lifecycle`, `camera-view`
- **Jetpack Compose** : UI déclarative avec `androidx.compose.ui`
- **Material Design 3** : `androidx.compose.material3`
- **Accompanist Permissions** : Gestion simplifiée des permissions `com.google.accompanist:accompanist-permissions:0.35.1-alpha`

## 🎯 Utilisation

1. Lancer l'application
2. Autoriser la permission caméra
3. Voir le flux vidéo en temps réel (caméra arrière par défaut)
4. **Cliquer sur le menu (⋮)** en haut à droite pour :
   - Basculer vers **Caméra avant**
   - Revenir à **Caméra arrière**
   - **Quitter** l'application
5. **Pincer l'écran** (geste de zoom) pour zoomer sur la vidéo
6. **Tourner l'écran** pour basculer entre portrait et paysage

## 🔍 Zoom par pincement

- Placez 2 doigts sur l'écran
- Écartez-les pour zoomer (jusqu'à 5x)
- Rapprochez-les pour dé-zoomer (jusqu'à 1x)
- Le zoom est préservé lors du changement de caméra ou d'orientation

## 🧪 Tests

### Tests unitaires
```bash
./gradlew test
```

### Tests instrumentés (sur appareil/émulateur)
```bash
./gradlew connectedAndroidTest
```

## 🏛️ Architecture

L'application suit l'architecture **MVC** :
- **Model** : Logique métier future
- **View** : Composables Jetpack Compose (`CameraScreen`, thème Material Design)
- **Controller** : Activité principale (`MainActivity`)

## 🔧 Configuration

- **Kotlin** : 1.9.24
- **Compose Compiler** : 1.5.14
- **Android SDK** : 34 (compilé), 24 (minimum)
- **JVM** : 17

## 📱 Compatibilité

- ✅ Android 7.0+ (SDK 24+)
- ✅ Portrait et Paysage
- ✅ Petit et grand écran
- ✅ Téléphones et tablettes

## 🐛 Dépannage

### La caméra ne s'affiche pas
- Vérifier que la permission caméra est accordée
- Tester sur un appareil réel ou un émulateur avec caméra virtuelle
- Vérifier le support CameraX sur l'appareil

### Le zoom ne fonctionne pas
- Tous les appareils ne supportent pas le zoom numérique
- Le zoom peut être limité selon le modèle de caméra
- Tester avec 2 doigts bien écartés

### La caméra avant ne s'affiche pas
- Certains appareils n'ont pas de caméra avant
- Vérifier les paramètres CameraX du modèle

## 📄 Licence

Projet libre à usage personnel et éducatif.

## 🎬 Version

- v1.0 : Application fonctionnelle avec caméra, menu, zoom et mode responsive
