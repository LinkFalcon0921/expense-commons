import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    `java-library`
    `maven-publish`
    id("org.springframework.boot") version "3.5.0"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "com.flintcore"
version = "0.10.1"

repositories {
    mavenLocal().run {
        this.url.let(::println)
    }
    google()
    mavenCentral()
}

// Variables
val javaVersion = JavaVersion.VERSION_17

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(javaVersion.toString())
    }
    withSourcesJar()
//    withJavadocJar()
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

// Deshabilitar completamente el bootJar ya que es una librería
tasks.getByName<BootJar>("bootJar") {
    enabled = false
}

// Asegurar que el jar normal esté habilitado
tasks.getByName<Jar>("jar") {
    enabled = true
    archiveClassifier = "" // Importante: sin classifier para que sea el jar principal
}

publishing {
    repositories {
        mavenLocal()
    }

    publications {
        create<MavenPublication>("utilsLocal") {
            groupId = project.group.toString()
            version = project.version.toString()
            artifactId = project.name.trim()

            pom{
                packaging = "jar"
                name.set(project.name)
            }
            from(components["java"])
        }
    }
}

dependencies {
    compileOnly("org.springframework.boot:spring-boot-starter-data-jpa")
    compileOnly("org.springframework.boot:spring-boot-starter-web")
    compileOnly("org.springframework.boot:spring-boot-starter-security")

    api("org.apache.commons:commons-lang3:3.17.0")

    // Validations
    compileOnly("jakarta.validation:jakarta.validation-api:3.1.1")

    // Lombok
    api("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.32")

    testCompileOnly("org.projectlombok:lombok:1.18.32")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.32")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}