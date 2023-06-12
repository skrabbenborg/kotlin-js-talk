import org.jetbrains.kotlin.gradle.targets.js.webpack.WebpackDevtool.CHEAP_SOURCE_MAP

plugins {
    kotlin("js") version "1.6.10"
}

group = "me.sander"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:17.0.2-pre.240-kotlin-1.5.30")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:17.0.2-pre.240-kotlin-1.5.30")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-styled:5.3.3-pre.294-kotlin-1.6.10")
    testImplementation("org.jetbrains.kotlin:kotlin-test-js:1.6.10")
}

kotlin {
    js(LEGACY) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
                devtool = CHEAP_SOURCE_MAP
            }
        }
    }
}
