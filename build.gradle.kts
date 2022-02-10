buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(libs.kotlin.gradle)
        classpath(libs.android.gradle)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}