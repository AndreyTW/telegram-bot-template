rootProject.name = "telegram-bot-template"

pluginManagement {
    val kotlinVersion: String by settings

    repositories {
        mavenCentral()
    }

    plugins {
        kotlin("jvm") version kotlinVersion
    }
}
