val clusterVariant = "2.3.1"

scalaVersion := "2.11.7"

libraryDependencies += "org.apache.spark" %% "spark-core" % clusterVariant
libraryDependencies += "org.apache.spark" %% "spark-sql" % clusterVariant
libraryDependencies += "org.apache.spark" %% "spark-streaming" % clusterVariant
libraryDependencies +=  "org.apache.spark" %% "spark-launcher" % clusterVariant
libraryDependencies +=  "org.apache.spark" %% "spark-yarn" % clusterVariant
libraryDependencies +=  "org.apache.hadoop" % "hadoop-client" % "2.7.3" excludeAll ExclusionRule(organization = "javax.servlet")

lazy val sparkEgs = (project in file("."))