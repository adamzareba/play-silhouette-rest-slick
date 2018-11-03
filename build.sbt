name := "play-silhouette-rest-slick"
 
version := "1.0" 

lazy val `play-silhouette-rest-slick` = (project in file(".")).enablePlugins(PlayScala)
scalacOptions ++= Seq("-deprecation", "-language:_")

scalaVersion := "2.12.6"
val silhouetteVersion = "5.0.4"
val playMailerVersion = "6.0.1"
val playJsonVersion = "2.6.8"
val swaggerUIVersion = "3.6.1"
val slickVersion = "3.0.1"
val postgresVersion = "42.1.4"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % slickVersion,
  "com.typesafe.play" %% "play-slick-evolutions" % slickVersion,
  "org.postgresql" % "postgresql" % postgresVersion,
  "com.mohiva" %% "play-silhouette" % silhouetteVersion,
  "com.mohiva" %% "play-silhouette-persistence" % silhouetteVersion,
  "com.mohiva" %% "play-silhouette-password-bcrypt" % silhouetteVersion,
  "com.mohiva" %% "play-silhouette-crypto-jca" % silhouetteVersion,
  "com.mohiva" %% "play-silhouette-testkit" % silhouetteVersion % "test",
  "com.iheart" %% "ficus" % "1.4.3",
  "com.typesafe.play" %% "play-mailer" % playMailerVersion,
  "com.typesafe.play" %% "play-mailer-guice" % playMailerVersion,
  "net.codingwell" %% "scala-guice" % "4.1.1",
  "com.adrianhurt" %% "play-bootstrap" % "1.2-P26-B3",
  "com.typesafe.play" %% "play-json" % playJsonVersion,
  "com.typesafe.play" %% "play-json-joda" % playJsonVersion,
  "io.swagger" %% "swagger-play2" % "1.6.1-SNAPSHOT",
  "org.webjars" % "swagger-ui" % swaggerUIVersion,
  specs2 % Test,
  ehcache,
  guice
)

unmanagedResourceDirectories in Test += (baseDirectory.value / "target/web/public/test")

resolvers += Resolver.jcenterRepo
resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
resolvers += "iheartradio-maven" at "https://dl.bintray.com/iheartradio/maven"
resolvers += "atlassian-maven" at "https://maven.atlassian.com/content/repositories/atlassian-public"
