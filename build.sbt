name := "specs2 bug"
version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

scalacOptions in Test ++= Seq("-Yrangepos")

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.11" % "2.4.2",

  "org.specs2" %% "specs2-core" % "3.7" % "test",
  "com.typesafe.akka" % "akka-testkit_2.11" % "2.4.2" % "test"
)
