import scala.io.Source
import java.io._

class WordCount {

    //TODO: Create a map between every word and it's count
    def wordCount() : Map[String, Int] = {
        val s1 = Source.fromFile("todo/lab2/data.txt").mkString; //returns the file data as String

        //splitting String data with white, becomes a string array
        val str = s1.split("\\s+")

        //TODO: YOUR SOLUTION GOES HERE

        

        //return the counts map here
    }

}