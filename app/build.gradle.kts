plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.ric.alfaone.rebuild"
    compileSdk = 36
    defaultConfig {
        applicationId = "com.ric.alfaone.rebuild"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "0.1.0"
    }
}
