
name := "$name$"

organization := "$org$"

version := "$version$"

scalaVersion := "2.9.2"

crossScalaVersions := Seq("2.9.1", "2.9.2")

publishMavenStyle := true

resolvers ++= Seq (
                    "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
                    "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases",
                    "Era7 Releases"     at "http://releases.era7.com.s3.amazonaws.com"
                  )

libraryDependencies += "com.typesafe.akka" % "akka-actor" % "$akkaVersion$"

