plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("com.google.guava:guava:33.0.0-jre")
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(17))
  }
}
