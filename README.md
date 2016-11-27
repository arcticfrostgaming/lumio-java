<p align="center"><img src="https://cdn.rawgit.com/arcticicestudio/nord-java/develop/src/main/assets/lumio-java-banner.svg"/></p>

<p align="center"><img src="https://cdn.travis-ci.org/images/favicon-c566132d45ab1a9bcae64d8d90e4378a.svg" width=24 height=24/> <a href="https://travis-ci.org/arcticicestudio/lumio-java"><img src="https://img.shields.io/travis/arcticicestudio/lumio-java/develop.svg"/></a> <img src="https://circleci.com/favicon.ico" width=24 height=24/> <a href="https://circleci.com/gh/arcticicestudio/lumio-java"><img src="https://circleci.com/gh/arcticicestudio/lumio-java.svg?style=shield&circle-token=d78caf88ab11057bb5fa096c1fded5353591c566"/></a> <img src="https://codecov.io/favicon.ico" width=24 height=24/> <a href="https://codecov.io/gh/arcticicestudio/lumio-java"><img src="https://codecov.io/gh/arcticicestudio/lumio-java/branch/develop/graph/badge.svg"/></a> <img src="https://assets-cdn.github.com/favicon.ico" width=24 height=24/> <a href="https://github.com/arcticicestudio/lumio-java/releases/latest"><img src="https://img.shields.io/github/release/arcticicestudio/lumio-java.svg"/></a> <a href="https://github.com/arcticicestudio/lumio-java/releases/latest"><img src="https://img.shields.io/badge/pre--release---_-blue.svg"/></a> <a href="https://github.com/arcticicestudio/nord/releases/tag/v0.1.0"><img src="https://img.shields.io/badge/Nord-0.1.0-blue.svg"/></a> <img src="http://central.sonatype.org/favicon.ico" width=24 height=24/> <a href="http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.arcticicestudio%22%20AND%20a%3A%22lumio-java%22"><img src="https://img.shields.io/maven-central/v/com.arcticicestudio/lumio-java.svg"/></a> <img src="https://oss.sonatype.org/favicon.ico"/> <a href="https://oss.sonatype.org/content/repositories/snapshots/com/arcticicestudio/lumio-java"><img src="https://img.shields.io/badge/snapshot-0.3.0--SNAPSHOT-blue.svg"/></a> <img src="https://bintray.com/favicon.ico" width=24 height=24/> <a href='https://bintray.com/arcticicestudio/Nord/lumio-java/_latestVersion'><img src='https://api.bintray.com/packages/arcticicestudio/Nord/lumio-java/images/download.svg'></a> <img src="https://oss.jfrog.org/webapp/images/favicon.40285.ico" width=24 height=24/> <a href="https://oss.jfrog.org/webapp/#/artifacts/browse/tree/General/oss-snapshot-local/com/arcticicestudio/lumio-java"><img src="https://img.shields.io/badge/artifactory-0.3.0--SNAPSHOT-green.svg"/></a></p>

<p align="center">A luminous warm and calm color palette Java library.<br>
Implementation of the <a href="https://github.com/arcticicestudio/lumio">Lumio</a> project.</p>

---

## Getting started
### Setup
To use lumio-java, it must be available on your classpath.  
You can get it from the <img src="http://central.sonatype.org/favicon.ico" width=16 height=16/> <a href="https://search.maven.org">Central Repository</a> as a dependency for your favorite build tool or [download the latest version](https://github.com/arcticicestudio/lumio-java/releases/latest).

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

Development snapshots are available via [OSS Sonatype](https://oss.sonatype.org/content/repositories/snapshots/com/arcticicestudio/lumio-java) and [JFrog Artifactory](https://oss.jfrog.org/webapp/#/artifacts/browse/tree/General/oss-snapshot-local/com/arcticicestudio/lumio-java).

### Build
Build and install lumio-java into your local repository without GPG signing:  
```
mvn clean install
```

Signed artifacts may be build by using the `sign-gpg` profile with a provided `gpg.keyname` property:
```
mvn clean install -Dgpg.keyname=YourGPGKeyId
```

Continuous integration builds are running at [Travis-CI](https://travis-ci.org/arcticicestudio/lumio-java) and [Circle CI](https://circleci.com/bb/arcticicestudio/lumio-java).

## Development
[![](https://img.shields.io/badge/Changelog-0.2.0-blue.svg)](https://github.com/arcticicestudio/lumio-java/blob/v0.2.0/CHANGELOG.md) [![](https://img.shields.io/badge/Workflow-gitflow_Branching_Model-blue.svg)](http://nvie.com/posts/a-successful-git-branching-model) [![](https://img.shields.io/badge/Versioning-ArcVer_0.8.0-blue.svg)](https://github.com/arcticicestudio/arcver)

### Contribution
Please report issues/bugs, feature requests and suggestions for improvements to the [issue tracker](https://github.com/arcticicestudio/lumio-java/issues).

<p align="center"> <img src="http://arcticicestudio.com/favicon.ico" width=16 height=16/> Copyright &copy; 2016 Arctic Ice Studio</p>

<p align="center"><a href="http://www.apache.org/licenses/LICENSE-2.0"><img src="https://img.shields.io/badge/License-Apache_2.0-blue.svg"/></a></p>
