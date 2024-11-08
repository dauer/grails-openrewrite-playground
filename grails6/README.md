# Grails 6

This folder contains a simple Grails 6 application and OpenRewrite recipes for upgrading to Grails 7.

To do a test run (generate patch file containing the changes in `build/reports/rewrite/rewrite.patch`)

```
./gradlew rewriteDryRun
```

To do the actual upgrade

```
./gradlew rewriteRun
```

## Todo

*A lot probably...* - Grails 7 has not yet been released, this is very much work in progress...
