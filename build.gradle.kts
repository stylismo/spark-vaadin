repositories {
    mavenLocal()
    maven { setUrl("http://repo.maven.apache.org/maven2") }
}

plugins {
    java
}

object versions {
    val vaadin = "8.0.2"
    val spark = "2.5.6-SNAPSHOT"
}

dependencies {
    compile("com.vaadin:vaadin-server:${versions.vaadin}")
    compile("com.vaadin:vaadin-push:${versions.vaadin}")
    compile("com.vaadin:vaadin-themes:${versions.vaadin}")
    compile("com.vaadin:vaadin-client-compiled:${versions.vaadin}")

    compile("com.sparkjava:spark-core:${versions.spark}")
}
