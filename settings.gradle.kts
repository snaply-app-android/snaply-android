pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
includeBuild("build-logic")
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Snaply"
include(":app")
include(
    ":core:common",
    ":core:model",
    ":core:network",
    ":core:database",
    ":core:datastore",
    ":core:navigation",
    ":core:security",
    ":core:testing",
    ":feature:onboarding",
    ":feature:auth",
    ":feature:home",
    ":feature:explore",
    ":feature:post",
    ":feature:profile",
    ":feature:challenges",
    ":feature:avatar",
)
 