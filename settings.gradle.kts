rootProject.name = "motorcycle-clothing-tweakers"

include("application")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            library("logging", "io.github.oshai", "kotlin-logging-jvm").version("6.0.1")
        }
        create("integrationTestLibs") {
            version("testContainers", "1.19.3")
        }
    }
}
