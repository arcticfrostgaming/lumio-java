<img align="center" src="https://raw.githubusercontent.com/arcticicestudio/lumio-java/develop/src/main/assets/media/lumio-java-banner.png" alt="Lumio Java"/>

<img src="https://cdn.travis-ci.org/images/favicon.svg" width=24 height=24/> [![Travis CI](https://img.shields.io/travis/arcticicestudio/lumio-java/develop.svg)](https://travis-ci.org/arcticicestudio/lumio-java) <img src="https://codecov.io/favicon.ico" width=24 height=24/> [![codecov](https://codecov.io/gh/arcticicestudio/lumio-java/branch/develop/graph/badge.svg)](https://codecov.io/gh/arcticicestudio/lumio-java)  
<img src="https://assets-cdn.github.com/favicon.ico" width=24 height=24/> [![release](https://img.shields.io/github/release/arcticicestudio/lumio-java.svg)](https://github.com/arcticicestudio/lumio-java/releases/latest) <img src="http://search.maven.org/favicon.ico" width=24 height=24/> [![Central Repository](https://img.shields.io/maven-central/v/com.arcticicestudio/lumio-java.svg)](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.arcticicestudio%22%20AND%20a%3A%22lumio-java%22) [![OSS Sonatype Snapshot](https://img.shields.io/badge/snapshot-0.3.0--SNAPSHOT-blue.svg)](https://oss.sonatype.org/content/repositories/snapshots/com/arcticicestudio/lumio-java)

Java library implementation of the warm pastel color palette [Lumio](https://github.com/arcticicestudio/lumio) which focuses to create a steamed, but colorful comic-like ambiance.  
Optimized for game- and graphic design projects.

## Getting started
### Setup
To use lumio-java it must be available on your classpath.  
You can get it from the <img src="https://search.maven.org/favicon.ico" width=16 height=16/> <a href="https://search.maven.org">Central Repository</a> as a dependency for your favorite build tool or [download the latest version](https://github.com/arcticicestudio/lumio-java/releases/latest).

<img src="http://apache.org/favicons/favicon.ico" width=16 height=16/> <a href="https://maven.apache.org">Apache Maven</a>
```xml
<dependency>
  <groupId>com.arcticicestudio</groupId>
  <artifactId>lumio-java</artifactId>
  <version>0.2.0</version>
</dependency>
```

<img src="https://gradle.org/wp-content/uploads/fbrfg/favicon.ico" width=16 height=16/> <a href="https://gradle.org">Gradle</a>
```java
compile(group: 'com.arcticicestudio', name: 'lumio-java', version: '0.2.0')
```

<img src="http://apache.org/favicons/favicon.ico" width=16 height=16/> <a href="https://ant.apache.org/ivy">Apache Ivy</a>
```xml
<dependency org="com.arcticicestudio" name="lumio-java" rev="0.2.0" />
```

Development snapshots are available via [OSS Sonatype](https://oss.sonatype.org/content/repositories/snapshots/com/arcticicestudio/lumio-java).   

### Build
Build and install lumio-java into your local repository without GPG signing:  
```
mvn clean install
```

Signed artifacts may be build by using the `sign-gpg` profile with a provided `gpg.keyname` property:
```
mvn clean install -Dgpg.keyname=YourGPGKeyId
```

A continuous integration build is running at [Travis-CI](https://travis-ci.org/arcticicestudio/lumio-java).

## Development
[![](https://img.shields.io/badge/Changelog-v0.2.0-blue.svg)](https://github.com/arcticicestudio/lumio-java/blob/v0.2.0/CHANGELOG.md)

### Workflow
This project follows the [gitflow](http://nvie.com/posts/a-successful-git-branching-model) branching model.

### Specifications
This project follows the [Arctic Versioning Specification (ArcVer)](https://github.com/arcticicestudio/arcver).

### Contribution
Please report issues/bugs, suggestions for improvements and feature requests to the [issuetracker](https://github.com/arcticicestudio/lumio-java/issues).

---

<img src="http://arcticicestudio.com/favicon.ico" width=16 height=16/> Copyright &copy; 2016 Arctic Ice Studio

[![GPL-3.0](http://www.gnu.org/graphics/gplv3-88x31.png)](http://www.gnu.org/licenses/gpl.txt) [![CC BY-SA-4.0](http://mirrors.creativecommons.org/presskit/buttons/88x31/svg/by-sa.svg)](http://creativecommons.org/licenses/by-sa/4.0/)
