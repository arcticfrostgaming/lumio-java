<p align="center"><img src="https://cdn.rawgit.com/arcticicestudio/lumio-java/develop/src/main/assets/lumio-java-banner.svg"/></p>

<p align="center"><img src="https://assets-cdn.github.com/favicon.ico" width=24 height=24/> <a href="https://github.com/arcticicestudio/lumio-java/releases/latest"><img src="https://img.shields.io/github/release/arcticicestudio/lumio-java.svg"/></a> <a href="https://github.com/arcticicestudio/lumio-java/releases/latest"><img src="https://img.shields.io/badge/pre--release---_-blue.svg"/></a> <a href="https://github.com/arcticicestudio/lumio/releases/tag/v2.0.0"><img src="https://img.shields.io/badge/Lumio-2.0.0-blue.svg"/></a> <img src="http://central.sonatype.org/favicon.ico" width=24 height=24/> <a href="http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.arcticicestudio%22%20AND%20a%3A%22lumio-java%22"><img src="https://img.shields.io/maven-central/v/com.arcticicestudio/lumio-java.svg"/></a> <img src="https://oss.sonatype.org/favicon.ico"/> <a href="https://oss.sonatype.org/content/repositories/snapshots/com/arcticicestudio/lumio-java"><img src="https://img.shields.io/badge/snapshot--_-blue.svg"/></a> <img src="https://bintray.com/favicon.ico" width=24 height=24/> <a href='https://bintray.com/arcticicestudio/Lumio/lumio-java/_latestVersion'><img src='https://api.bintray.com/packages/arcticicestudio/Lumio/lumio-java/images/download.svg'></a> <img src="https://oss.jfrog.org/webapp/images/favicon.40285.ico" width=24 height=24/> <a href="https://oss.jfrog.org/webapp/#/artifacts/browse/tree/General/oss-snapshot-local/com/arcticicestudio/lumio-java"><img src="https://img.shields.io/badge/artifactory---_-green.svg"/></a></p>

---

# 0.3.0 (2016-12-03)
## Features
### Public API
The library has been updated to the latest Lumio version [`2.0.0`](https://github.com/arcticicestudio/lumio/releases/tag/v2.0.0)!
Detailed descriptions and changes can be found in the associated [milestone](https://github.com/arcticicestudio/lumio/milestone/1) backlog issue [lumio/#1](https://github.com/arcticicestudio/lumio/issues/1).
**Rewrote all enum constants to match the new naming scheme including their JavaDoc!**
This is almost the largest **breaking change** possible for this library, but since it it still in development it can be done without incrementing the major version. (@arcticicestudio, #5, 6afd95e7)

Implemented a static method to obtain the public API version string compatible to [ArcVer](https://github.com/arcticicestudio/arcver). (@arcticicestudio, #7, bde4478a)

| Class | Method |
| --- | --- |
| `com.arcticicestudio.lumio.Lumio` | `getVersion() : String` |

## Bug Fixes
### API Documentation
Fixed malformed JavaDoc to prevent compilation errors caused by the new JavaDoc linter rules introduced JDK 8u92.
Replaced the `<>` characters with the HTML entities `&lt;``&gt;` and added the `summary` attribute to to `table` tags. (@arcticicestudio, #4, 375b8a2c)

## Improvements
### Code Style
Adapted the Arctic Ice Studio Java code style for the SonarQube minor rule [squid:S00116](https://sonarqube.com/coding_rules#q=squid%3AS00116) applied to the
  - attribute
```java
private final Color COLOR;
```
  - constructor parameters
```java
Lumio(final int RED, final int GREEN, final int BLUE)
```
  - public API method parameters
```java
rgb(final Color COLOR)
hex(final Color COLOR)
```
(@arcticicestudio, #6, 1939c7f2)

### Toolbox
The project POM has been rewritten to adapt the new setup structure which now includes deployment integration for [Bintray](https://bintray.com) and the [JFrog OSS](https://oss.jfrog.org) for snapshots.
Depending assembly descriptor files like the `assembly-bin.xml` have been refactored too. (@arcticicestudio, #3, d422f5e6)

### Documentation
All documentations have been rewritten and cleaned up to adapt to the new project setup like the [Nord](https://github.com/arcticicestudio/nord) project.
This also includes a new [Usage Guide](https://github.com/arcticicestudio/lumio-java#usage-guide). (@arcticicestudio, #1, 5bf35fb0)

## Tasks
### Toolbox
Created a `circle.yml` configuration file to add [Circle CI](https://circleci.com) build integration. (@arcticicestudio, #2, 42d57c19)

# 0.2.0 (2016-08-05)
This version is mainly focused on a [Apache Maven](https://maven.apache.org) migration.
Release and snapshot versions are now deployed to the [Central Repository](https://search.maven.org) via [OSS Sonatype](https://oss.sonatype.org).

## Improvements
### Toolbox
Migrated to [Apache Maven](https://maven.apache.org) based on the [`glacier-apache-maven@0.4.0`](https://github.com/arcticicestudio/glacier-apache-maven) project skeletons.  

A continuous integration build is running at [Travis-CI](https://travis-ci.org/arcticicestudio/lumio-java) which triggers a code coverage test at [codecov.io](https://travis-ci.org/arcticicestudio/lumio-java).

### Documentation
The documentations have been modernized and the `README` now includes a "Getting started" section.

# 0.1.0 (2016-03-28)
## Features
Implemented the main enumeration [`com.arcticicestudio.lumio.Lumio`](https://github.com/arcticicestudio/lumio-java/blob/master/src/main/java/com/arcticicestudio/lumio/Lumio.java) class providing the [Lumio](https://github.com/arcticicestudio/lumio) color palette.

Implemented the `package-info` class for the [`com.arcticicestudio.lumio`](https://github.com/arcticicestudio/lumio-java/blob/master/src/main/java/com/arcticicestudio/lumio) package.

## Tests
Implemented the JUnit test class [`com.arcticicestudio.lumio.LumioTest`](https://github.com/arcticicestudio/lumio-java/blob/master/src/test/java/com/arcticicestudio/lumio/LumioTest.java) for the [`com.arcticicestudio.lumio.Lumio`](https://github.com/arcticicestudio/lumio-java/blob/master/src/main/java/com/arcticicestudio/lumio/Lumio.java) class to ensure valid HEX and RGB values.

# 0.0.0 (2016-03-28)
**Project Initialization**
