plugins {
    id("application") 
    id("java") 
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("io.micronaut:micronaut-bom:3.7.1"))
    implementation("io.micronaut.aws:micronaut-aws-cdk")
    testImplementation(platform("io.micronaut:micronaut-bom:3.7.1"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-engine")
}
application {
    mainClass.set("com.bytestream.Main")
}
tasks.withType<Test> {
    useJUnitPlatform()
}

