Apache Maven
============

What is Maven
-------------
1. build automation tool
2. dependency management

Configuration
-------------
`$M2_HOME` is the home of Maven. Normally it points to `$HOME/.m2`  
`~/.m2/settings.xml` user configuration  
`~/.m2/repository` local repository

Core Concepts
-------------
####Plugins and Goals
**A Maven Plugin is a collection of one or more goals.** Examples of Maven plugins can be simple core plugins like the Jar plugin, which contains goals for creating JAR files, Compiler plugin, which contains goals for compiling source code and unit tests, or the Surefire plugin, which contains goals for executing unit tests and generating reports.  
**A goal is a specific task that may be executed as a standalone goal or along with other goals as part of a larger build. A goal is a “unit of work” in Maven.** Examples of goals include the compile goal in the Compiler plugin, which compiles all of the source code for a project, or the test goal of the Surefire plugin, which can execute unit tests.

Execute a goal: `mvn <pluginId>:<goalId>`, for example:

    mvn archetype:generate
    mvn compiler:compile

####Phase

    compile --> test --> package --> install --> deploy
Plugin goals can be attached to a lifecycle phase. As Maven moves through the phases in a lifecycle, it will execute the goals attached to each particular phase.

####Maven Coordinates
Maven coordinates for projects: the `groupId`, `artifactId`, `version` and `packaging`

    <groupId>com.happyslowly</groupId>
    <artifactId>maven-study</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>
    
####Repository
Default central repository: [http://repo1.maven.org/maven/](http://repo1.maven.org/maven/)
And the artifact can be located by:

    /<groupId>/<artifactId>/<version>/<artifactId>-<version>.<packaging>

Online Resources
----------------
[Introduction to the Build Lifecycle](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)  
[Maven by Example](http://books.sonatype.com/mvnex-book/reference/index.html)
