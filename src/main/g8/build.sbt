name := "$name$"

organization := "$organization$"

// for sbt-assembly
mainClass in assembly := "org.greiner.mymain"

version := "$version$"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.1"
)

