// tag::buildscript_block[]
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.5")
    }
}

apply(plugin = "com.jfrog.bintray")
// end::buildscript_block[]


