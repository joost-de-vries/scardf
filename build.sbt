name := "scardf"

version := "0.6-SNAPSHOT"

scalaVersion := "2.10.1"

resolvers+= "Maven2 Central Repository" at "http://repo1.maven.org/maven2"

resolvers+= "Scala-tools Maven2 Repository" at "http://scala-tools.org/repo-releases"

resolvers+= "wp5.e-taxonomy.eu" at "http://wp5.e-taxonomy.eu/cdmlib/mavenrepo/"


libraryDependencies += "com.hp.hpl.jena" % "jena" % "2.6.3"

libraryDependencies += "com.hp.hpl.jena" % "arq" % "2.8.4"

libraryDependencies += "joda-time" % "joda-time" % "1.6"

libraryDependencies += "commons-logging" % "commons-logging" % "1.1.1"

libraryDependencies += "junit" % "junit" % "4.7"

libraryDependencies += "org.specs2" %% "specs2" % "2.0" % "test"

