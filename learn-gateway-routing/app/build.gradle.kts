plugins {
  id("org.springframework.boot") version "3.1.2"
  id("io.spring.dependency-management") version "1.1.2"
  id("nebula.integtest") version "9.6.3"
  `java-library`
}

apply(plugin = "io.spring.dependency-management")

dependencyManagement {
  imports {
    mavenBom("org.springframework.boot:spring-boot-dependencies:3.1.2")
    mavenBom("org.springframework.cloud:spring-cloud-dependencies:2022.0.4")
  }
}

repositories {
  mavenCentral()
}
