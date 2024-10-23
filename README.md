# grails-openrewrite-playground

Testing [OpenRewrite](https://docs.openrewrite.org/) for upgrading [Grails](https://grails.org/) projects.

This project contains a simple Grails 6 application and some OpenRewrite recipes for upgrading to Grails 7.

To do a test run (generate patch file containing the changes in `build/reports/rewrite/rewrite.patch`)

```
./gradlew rewriteDryRun
```

To do the actual upgrade

```
./gradlew rewriteDryRun
```

## Todo

*A lot* - This is very much work in progress...

