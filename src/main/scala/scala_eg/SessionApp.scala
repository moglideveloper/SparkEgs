package scala_eg

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object SessionApp extends App {

  val sparkConf = new SparkConf().setAppName("SampleApp").setMaster("local[*]")

  val spark = SparkSession.builder().config(sparkConf).getOrCreate()

  val file = "sampleData.txt"

  val rdd = spark.sparkContext.textFile( file )

  rdd.foreach( println )
}
