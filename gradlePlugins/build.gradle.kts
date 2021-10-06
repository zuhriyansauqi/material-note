plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("dependencies") {
            id = "com.zuhriyansauqi.materialnote.dependencies"
            implementationClass = "com.zuhriyansauqi.materialnote.gradle.DependenciesPlugin"
        }
    }
}
