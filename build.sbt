import base.BasePlugin._

val clusterVariant = "2.3.1"

scalaVersion := "2.11.7"

resolvers ++= sparkIdeResolvers(clusterVariant)

libraryDependencies ++= (
  sparkcore(version = clusterVariant) ++ sparksql(version = clusterVariant) 
    ++ sparkstreaming(version = clusterVariant) ++ sparkhive(version = clusterVariant)
    ++ sparkutils(version = clusterVariant) ++ sparkIdeDependencies(clusterVariant)
  )

lazy val sparkEgs = (project in file(".")).settings(baseSettings( "org.mogli", clusterVariant ))