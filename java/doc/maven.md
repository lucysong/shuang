Apache Maven
============

Maven
-----
####Project management
1. build tool
2. dependency management


Configuration
-------------
`$M2_HOME` normally points to `$HOME/.m2`
`~/.m2/settings.xml` user configuration
`~/.m2/repository` local repository

Core Concepts
-------------
####Plugins and Goals
**A Maven Plugin is a collection of one or more goals.** Examples of Maven plugins can be simple core plugins like the Jar plugin, which contains goals for creating JAR files, Compiler plugin, which contains goals for compiling source code and unit tests, or the Surefire plugin, which contains goals for executing unit tests and generating reports.
A goal is a specific task that may be executed as a standalone goal or along with other goals as part of a larger build. A goal is a “unit of work” in Maven. Examples of goals include the compile goal in the Compiler plugin, which compiles all of the source code for a project, or the test goal of the Surefire plugin, which can execute unit tests.
Execute a plugin goal:
    mvn <pluginId>:<goalId>
    mvn archetype:generate
    mvn compiler:compile

####Phase

    compile --> test --> package --> install --> deploy
Plugin goals can be attached to a lifecycle phase. As Maven moves through the phases in a lifecycle, it will execute the goals attached to each particular phase.

### Maven Coordinates

  groupId

Example
-------
####simple project

    mvn archetype:generate -DgroupId=<groupId> -DartifactId=<artifactId> -Dversion=1.0-SNAPSHOT -Dpackage=<package>

