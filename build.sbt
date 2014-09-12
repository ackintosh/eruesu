seq(conscriptSettings :_*)

organization := "com.github.ackintosh"

name := "eruesu"

version := "0.1.0"

scalaVersion := "2.11.2"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.3" % "test"

libraryDependencies += "org.scalamock" %% "scalamock-scalatest-support" % "3.1.2" % "test"

publishTo := Some(Resolver.file("eruesu", file("/Users/Ack/Develop/github/eruesu_repo"))(Patterns(true, Resolver.mavenStyleBasePattern)))