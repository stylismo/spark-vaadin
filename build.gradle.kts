import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.bundling.Jar

repositories {
    mavenLocal()
    maven { setUrl("http://repo.maven.apache.org/maven2") }
}

plugins {
    java
    id("com.github.johnrengelman.shadow") version "1.2.4"
}

task<Copy>("copyToLib") {
    from(configurations.compile)
    into("build/libs")
}

val jar: Jar by tasks

jar.apply {
    manifest.attributes.apply {
        put("Main-Class", "com.stylismo.playground.vaadin.Main")
    }
}


object versions {
    val vaadin = "8.0.2"
    val spark = "2.5.6-SNAPSHOT"
}

tasks {
    "stage" {
        dependsOn("build", "shadowJar")

        doLast { println("Built spark-vaadin-all.jar") }
    }
}


dependencies {
    compile("com.vaadin:vaadin-server:${versions.vaadin}")
    compile("com.vaadin:vaadin-push:${versions.vaadin}")
    compile("com.vaadin:vaadin-themes:${versions.vaadin}")
    compile("com.vaadin:vaadin-client-compiled:${versions.vaadin}")

    compile("com.sparkjava:spark-core:${versions.spark}")
}
