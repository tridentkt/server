plugins {
    kotlin("jvm") version "1.4.20"
}

group = "trident"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation(kotlin("stdlib"))
    //implementation(project(":api"))
    implementation("com.github.Steveice10:MCProtocolLib:1.15.2-1")
    implementation("com.uchuhimo:konf:0.23.0")
    implementation("com.uchuhimo:konf-toml:0.23.0")
}