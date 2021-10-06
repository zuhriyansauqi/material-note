package com.zuhriyansauqi.materialnote.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class DependenciesPlugin : Plugin<Project> {
    override fun apply(target: Project) {
    }

    companion object {
        val kotlinVersion = "1.5.30"
        val composeVersion = "1.0.3"
    }
}