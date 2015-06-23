name := "play2-mailgun"

// If the CI supplies a "build.version" environment variable, inject it as the rev part of the version number:
version := s"${sys.props.getOrElse("build.majorMinor", "0.1")}.${sys.props.getOrElse("build.version", "SNAPSHOT")}"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.11.2", "2.10.4")

organization := "com.themillhousegroup"

libraryDependencies ++= Seq(
		"com.typesafe.play"           %%  "play-ws"               % "2.3.8"       % "provided",
    "org.mockito"                 %   "mockito-all"           % "1.9.0"       % "test",
    "org.specs2"                  %%  "specs2"                % "2.3.12"      % "test",
		"commons-fileupload" 					% 	"commons-fileupload" 		% "1.3.1"       % "test",
		"javax.servlet" 							% 	"javax.servlet-api" 		% "3.0.1"       % "test"


)

resolvers ++= Seq(  "oss-snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
                    "oss-releases"  at "https://oss.sonatype.org/content/repositories/releases",
                    "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/")

jacoco.settings

publishArtifact in (Compile, packageDoc) := false

seq(bintraySettings:_*)

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

scalariformSettings

net.virtualvoid.sbt.graph.Plugin.graphSettings

