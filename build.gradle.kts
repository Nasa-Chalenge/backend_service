import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    java
    id("org.springframework.boot") version "2.3.0.RELEASE"
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
}

group = "org.nasa.challenge"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_13
}

repositories {
    mavenCentral()
}

configurations {
    all {
        exclude(module = "spring-boot-starter-logging")
    }
}

val xnioVer = "3.8.0.Final"
val jbossThreadsVer = "3.0.1.Final"
val postgresVersion = "42.2.12"
val swaggerVersion = "2.9.2"

dependencies {

    implementation("org.springframework.boot", "spring-boot-starter-web") {
        exclude("org.springframework.boot","spring-boot-starter-tomcat")
    }

    implementation("org.springframework.boot", "spring-boot-starter-undertow") {
        exclude("org.jboss.xnio", "xnio-nio")
        exclude("org.jboss.xnio", "xnio-api")
    }
    implementation("org.jboss.xnio", "xnio-nio", xnioVer)
    implementation("org.jboss.xnio", "xnio-api", xnioVer)
    implementation("org.jboss.threads", "jboss-threads", jbossThreadsVer)

    implementation("org.springframework.boot", "spring-boot-starter-data-jpa")
    implementation("org.postgresql", "postgresql", postgresVersion)

    implementation("io.springfox", "springfox-swagger2", swaggerVersion)
    implementation("io.springfox", "springfox-swagger-ui", swaggerVersion)
}
