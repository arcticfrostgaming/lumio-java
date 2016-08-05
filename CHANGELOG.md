<img align="center" src="https://raw.githubusercontent.com/arcticicestudio/lumio-java/develop/src/main/assets/media/lumio-java-banner.png" alt="Lumio Java"/>

## 0.2.0 (2016-08-05) - Apache Maven Migration
This version is mainly focused on a [Apache Maven](https://maven.apache.org) migration.
Release and snapshot versions are now deployed to the [Central Repository](https://search.maven.org) via [OSS Sonatype](https://oss.sonatype.org).

### Improvements
#### Build Tool
  - Migrated to [Apache Maven](https://maven.apache.org) based on the [`glacier-apache-maven@0.4.0`](https://github.com/arcticicestudio/glacier-apache-maven) project skeletons
  - A continuous integration build is running at [Travis-CI](https://travis-ci.org/arcticicestudio/lumio-java) which triggers a code coverage test at [codecov.io](https://travis-ci.org/arcticicestudio/lumio-java)

#### Documentation
  - The documentations have been modernized and the `README` now includes a "Getting started" section

## 0.1.0 (2016-03-28)
### Features
  - Implemented the main enumeration [`com.arcticicestudio.lumio.Lumio`](https://github.com/arcticicestudio/lumio-java/blob/master/src/main/java/com/arcticicestudio/lumio/Lumio.java) class providing the [Lumio](https://github.com/arcticicestudio/lumio) color palette
  Implemented the `package-info` class for the [`com.arcticicestudio.lumio`](https://github.com/arcticicestudio/lumio-java/blob/master/src/main/java/com/arcticicestudio/lumio) package

### Tests
  - Implemented the JUnit test class [`com.arcticicestudio.lumio.LumioTest`](https://github.com/arcticicestudio/lumio-java/blob/master/src/test/java/com/arcticicestudio/lumio/LumioTest.java) for the [`com.arcticicestudio.lumio.Lumio`](https://github.com/arcticicestudio/lumio-java/blob/master/src/main/java/com/arcticicestudio/lumio/Lumio.java) class to ensure valid HEX and RGB values

## 0.0.0 (2016-03-28) - Project Initialization
