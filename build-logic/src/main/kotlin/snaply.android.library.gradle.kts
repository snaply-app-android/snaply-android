plugins {
    id("com.android.library")
}

android {
    namespace = "com.snaply.app.${project.path.removePrefix(":").replace(':', '.')}"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        minSdk = 24
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}