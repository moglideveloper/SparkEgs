package java_eg;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.Arrays;
import java.util.List;

public class SparksEg1 {

    private static List<Integer> getIntegers() {
        return Arrays.asList(321, 453, 376, 147) ;
    }


    public void eg1() {


        SparkConf sparkConf = new SparkConf().setMaster("local").setAppName("JD Word Counter");

        JavaSparkContext sparkContext = new JavaSparkContext(sparkConf);

        List<Integer> list = getIntegers();

        System.out.println(list);

        System.out.println("-----------------------------------------------");

        JavaRDD<Integer> numbers = sparkContext.parallelize(list);

        numbers.collect().forEach(System.out::println);
    }

    public static void main(String[] args) {

        new SparksEg1().eg1();
    }
}