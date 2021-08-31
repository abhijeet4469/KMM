buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath( "com.android.tools.build:gradle:4.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.30")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}