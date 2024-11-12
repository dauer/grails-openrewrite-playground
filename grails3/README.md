# Grails 3

**DISCLAIMER** This project is still very much Work in Progress...

This folder contains a simple [Grails 3](https://grails.github.io/legacy-grails-doc/3.3.18/guide/single.html)
application and [OpenRewrite](https://docs.openrewrite.org/) recipes for upgrading to Grails 6.

## Description

OpenRewrite requires [Gradle](https://gradle.org/) 4.x - Grails 3 uses Gradle 3.5

Install Gradle using [SDKMan](https://sdkman.io/)

    sdk install gradle 4.10.3
    sdk use gradle 4.10.3

To do a test run (generate a patch file containing the changes in `build/reports/rewrite/rewrite.patch`)

    gradle rewriteDryRun

To do the actual upgrade

    gradle rewriteRun

## Recipe

To add the recipes to your own project:

Add the following dependencies to the `build.gradle` file


    buildscript {
            ...
        dependencies {
                ...
            classpath "org.openrewrite:plugin:6.26.0"
        }
    }

    apply plugin: "org.openrewrite.rewrite"
       ...

    dependencies {
            ...
        rewrite("org.openrewrite.recipe:rewrite-migrate-java:2.28.0")
    }

        ...
    rewrite {
        configFile = project.getRootProject().file("rewrite.yml")
        activeRecipe("dk.workbench.openrewrite.grails")
        activeRecipe("org.openrewrite.gradle.MigrateToGradle7")
        activeRecipe("org.openrewrite.java.migrate.UpgradeBuildToJava11")
    }

Add the `rewrite.yml` file containing configuration for OpenRewrite to the project

Now you can run the Gradle tasks described above

## Notes

The `rewrite.yml` is configured for upgrading Grails Web and REST applications. \
If you are upgrading plugins changing `compile` to `implementation` might not
always be what you want sometimes `api` is the correct choice, but it is not
possible to decide programmatically (or at least [hard](https://github.com/openrewrite/rewrite/blob/main/rewrite-gradle/src/main/resources/META-INF/rewrite/gradle-6.yml#L26)...) so you might have to
run through that part manually.

## Todo

* The recipe is only testet on a very small project
* The code could be [packaged](https://docs.openrewrite.org/authoring-recipes/recipe-development-environment) more nicely for convenience and ease of use   