
enablePlugins(JavaAppPackaging)

version := "0.1.0-SNAPSHOT"
scalaVersion := "2.13.8"

val projectName = "expert-octo-happiness"


val AkkaVersion = "2.6.8"
val AkkaHttpVersion = "10.2.9"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion
)

lazy val root = (project in file("."))
  .settings(
    name := projectName
  )