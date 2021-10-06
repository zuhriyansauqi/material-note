import com.zuhriyansauqi.materialnote.gradle.DependenciesPlugin

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("com.zuhriyansauqi.materialnote.dependencies")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.zuhriyansauqi.materialnote"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = DependenciesPlugin.composeVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Android
    implementation(DependenciesPlugin.Android.coreKtx)
    implementation(DependenciesPlugin.Android.appCompat)
    implementation(DependenciesPlugin.Android.material)
    implementation(DependenciesPlugin.Android.lifecycleRuntimeKtx)
    androidTestImplementation(DependenciesPlugin.Test.extJunit)
    androidTestImplementation(DependenciesPlugin.Test.espresso)

    // Jetpack Compose
    implementation(DependenciesPlugin.Compose.ui)
    implementation(DependenciesPlugin.Compose.uiTooling)
    implementation(DependenciesPlugin.Compose.uiToolingPreview)
    implementation(DependenciesPlugin.Compose.foundation)
    implementation(DependenciesPlugin.Compose.material)

    // Jetpack Compose Integration
    implementation(DependenciesPlugin.ComposeIntegration.activity)

    // Test
    testImplementation(DependenciesPlugin.Test.jUnit4)
    androidTestImplementation(DependenciesPlugin.Compose.uiTestJUnit4)
}