package com.zuhriyansauqi.materialnote.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class DependenciesPlugin : Plugin<Project> {
    override fun apply(target: Project) {
    }

    object Android {
        const val coreKtx = "androidx.core:core-ktx:$androidCoreVersion"
        const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
        const val material = "com.google.android.material:material:$materialVersion"
        const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleRuntimeVersion"
    }

    object Compose {
        const val ui = "androidx.compose.ui:ui:$composeVersion"
        const val uiTooling = "androidx.compose.ui:ui-tooling:$composeVersion"
        const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:$composeVersion"
        const val foundation = "androidx.compose.foundation:foundation:$composeVersion"
        const val material = "androidx.compose.material:material:$composeVersion"
        const val uiTestJUnit4 = "androidx.compose.ui:ui-test-junit4:$composeVersion"
    }

    object ComposeIntegration {
        const val activity = "androidx.activity:activity-compose:$activityComposeVersion"
    }

    object Test {
        const val jUnit4 = "junit:junit:$jUnit4Version"
        const val extJunit = "androidx.test.ext:junit:$extJUnitVersion"
        const val espresso = "androidx.test.espresso:espresso-core:$espressoVersion"
    }

    companion object {
        const val activityComposeVersion = "1.3.1"
        const val androidCoreVersion = "1.6.0"
        const val appCompatVersion = "1.3.1"
        const val composeVersion = "1.0.3"
        const val espressoVersion = "3.4.0"
        const val extJUnitVersion = "1.1.3"
        const val jUnit4Version = "4.13.2"
        const val kotlinVersion = "1.5.30"
        const val lifecycleRuntimeVersion = "2.3.1"
        const val materialVersion = "1.4.0"
    }
}