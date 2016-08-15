lazy val `lti-scala` = (project in file(".")).
  settings(
    organization := "net.paulgray",
    name := "lti-scala",
    version := "1.0.0",
    scalaVersion := "2.11.2"
  )

libraryDependencies ++= Seq(
  "com.github.jsonld-java" % "jsonld-java" % "0.8.3",
  "org.apache.commons" % "commons-io" % "1.3.2" % "test",
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
)

sourceDirectories in Compile += new File("source")
