<p align="center"><img src="https://cdn.rawgit.com/arcticicestudio/lumio-java/develop/src/main/assets/lumio-java-banner.svg"/></p>

<p align="center"><img src="https://assets-cdn.github.com/favicon.ico" width=24 height=24/> <a href="https://github.com/arcticicestudio/lumio-java/releases/latest"><img src="https://img.shields.io/github/release/arcticicestudio/lumio-java.svg"/></a> <a href="https://github.com/arcticicestudio/lumio-java/releases/latest"><img src="https://img.shields.io/badge/pre--release---_-blue.svg"/></a> <a href="https://github.com/arcticicestudio/lumio/releases/tag/v2.0.0"><img src="https://img.shields.io/badge/Lumio-2.0.0-blue.svg"/></a> <img src="http://central.sonatype.org/favicon.ico" width=24 height=24/> <a href="http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.arcticicestudio%22%20AND%20a%3A%22lumio-java%22"><img src="https://img.shields.io/maven-central/v/com.arcticicestudio/lumio-java.svg"/></a> <img src="https://oss.sonatype.org/favicon.ico"/> <a href="https://oss.sonatype.org/content/repositories/snapshots/com/arcticicestudio/lumio-java"><img src="https://img.shields.io/badge/snapshot-0.3.0--SNAPSHOT-blue.svg"/></a> <img src="https://bintray.com/favicon.ico" width=24 height=24/> <a href='https://bintray.com/arcticicestudio/Lumio/lumio-java/_latestVersion'><img src='https://api.bintray.com/packages/arcticicestudio/Lumio/lumio-java/images/download.svg'></a> <img src="https://oss.jfrog.org/webapp/images/favicon.40285.ico" width=24 height=24/> <a href="https://oss.jfrog.org/webapp/#/artifacts/browse/tree/General/oss-snapshot-local/com/arcticicestudio/lumio-java"><img src="https://img.shields.io/badge/artifactory-0.3.0--SNAPSHOT-green.svg"/></a></p>

---

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
