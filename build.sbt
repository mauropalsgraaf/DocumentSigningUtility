name := "DocumentSigningUtility"

version := "1.0"

scalaVersion := "2.11.8"

mainClass in Compile := Some("Main")

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.8.5" % "test")
libraryDependencies ++= Seq("org.specs2" %% "specs2-mock" % "3.8.5" % "test")

