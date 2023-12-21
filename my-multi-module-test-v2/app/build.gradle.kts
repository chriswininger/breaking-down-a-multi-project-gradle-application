/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("org.chriswininger.multimoduletest.v2.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("org.chriswininger.multimoduletest.v2.app.AppKt")
}
