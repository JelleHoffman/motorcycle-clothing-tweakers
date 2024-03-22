rootProject.name = "motorcycle-clothing-tweakers"

include("application")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            library("logging", "io.github.oshai", "kotlin-logging-jvm").version("6.0.1")

            version("mapstruct", "1.5.5.Final")
            library("mapstruct", "org.mapstruct", "mapstruct").versionRef("mapstruct")
            library("mapstructannotation", "org.mapstruct", "mapstruct-processor").versionRef("mapstruct")
        }
        create("integrationTestLibs") {
            version("testContainers", "1.19.3")
        }
    }
}
