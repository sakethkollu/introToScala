import scala.io.Source
import java.io._

class WordCount {

    //TODO: Create a map between every word and it's count
    def wordCount() : Map[String, Int] = {
        val s1 = Source.fromFile("solutions/lab2/data.txt").mkString; //returns the file data as String

        //splitting String data with white space and calculating the number of occurrence of each word in the file  
        val counts = s1.split("\\s+").groupBy(x=>x).mapValues(x=>x.length) 

        //THIS IS A ONE LINE SOLUTION THAT WORKS :)

        counts
    }

}