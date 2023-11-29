import Dependencies._

ThisBuild / scalaVersion     := "2.13.12"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

name := "Scala.js Tutorial"
scalaVersion := "2.13.1" // or any other Scala version >= 2.11.12

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
      name := "play-videos",
      libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0",
      libraryDependencies += munit % Test,
      scalaJSUseMainModuleInitializer := true
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
