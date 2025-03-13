plugins {
	java
	id("org.springframework.boot") version "3.4.3"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "io.github.cherry05.encryptiontest"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.slf4j:slf4j-api")
	implementation("ch.qos.logback:logback-classic")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.slf4j:slf4j-api")
	testImplementation("ch.qos.logback:logback-classic")

	testImplementation("org.mockito:mockito-core:5.7.0")
	testImplementation("org.mockito:mockito-inline:5.7.0") // ✅ mockito-inline 추가

	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")

	testCompileOnly("org.projectlombok:lombok")
	testAnnotationProcessor("org.projectlombok:lombok")

	developmentOnly("org.springframework.boot:spring-boot-devtools")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
