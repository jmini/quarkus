plugins {
    id("org.jetbrains.kotlin.plugin.allopen")
    id("io.quarkus")
    kotlin("jvm")
}

allOpen {
    annotation("jakarta.ws.rs.Path")
    annotation("jakarta.enterprise.context.ApplicationScoped")
    annotation("jakarta.persistence.Entity")
    annotation("io.quarkus.test.junit.QuarkusTest")
}

dependencies {
    implementation(project(":port"))
    implementation(project(":domain"))
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.quarkus:quarkus-resteasy")
}
