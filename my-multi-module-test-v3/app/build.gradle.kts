plugins {
  kotlin("jvm") version "1.5.30"
  `kotlin-dsl`
  application
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.apache.commons:commons-text:1.10.0")
  implementation(project(":utilities"))
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(17))
  }
}

application {
  mainClass.set("org.chriswininger.multimoduletest.v3.app.AppKt")
}
