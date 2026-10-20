plugins {
    kotlin("jvm") version "2.3.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

group = "demo"
version = "1.0.0"

kotlin {
    jvmToolchain(21)
}

application {
    mainClass = "demo.MainKt"
}

tasks.test {
    useJUnitPlatform()
    // show every test in the log, so the result is visible in the GitHub Actions output
    testLogging {
        events("passed", "failed", "skipped")
        showStandardStreams = false
    }
}
