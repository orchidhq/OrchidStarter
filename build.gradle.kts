import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Buildscript dependencies and plugins
//----------------------------------------------------------------------------------------------------------------------

plugins {
    // Check latest version at https://plugins.gradle.org/plugin/com.eden.orchidPlugin
    id("com.eden.orchidPlugin") version "0.21.0"
    kotlin("jvm") version "1.3.72"
}

project.version = "1"

// Orchid setup
//----------------------------------------------------------------------------------------------------------------------
repositories {
    jcenter()
}

dependencies {
    // Run $ gradlew refreshVersions to search for Orchid updates
    // See https://jmfayard.github.io/refreshVersions/update-dependencies/
    implementation(Orchid.core)
    orchidImplementation(Orchid.core)
    orchidRuntimeOnly(Orchid.plugins.posts)
    orchidRuntimeOnly(Orchid.plugins.pages)
    orchidRuntimeOnly(Orchid.plugins.wiki)
    orchidRuntimeOnly(Orchid.plugins.netlify)
    orchidRuntimeOnly(Orchid.plugins.netlifyCMS)
    orchidRuntimeOnly(Orchid.plugins.pluginDocs)
    orchidRuntimeOnly(Orchid.plugins.search)
    orchidRuntimeOnly(Orchid.plugins.writersBlocks)
    orchidRuntimeOnly(Orchid.plugins.syntaxHighlighter)
    orchidRuntimeOnly(Orchid.plugins.taxonomies)
    orchidRuntimeOnly(Orchid.themes.futureImperfect)
    orchidRuntimeOnly(Orchid.plugins.asciidoc)
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
