import scala.collection.mutable.LinkedList

object Lab3Autograder{
    def main(args: Array[String]): Unit = {
        
        println("========== STARTING LAB 3 AUTOGRADER ==========\n")

        val lab = args(0)

        lab match {
            case _ if lab == "gcd" => gradeGCD()
            case _ if lab == "countingchange" => gradeCountingChange()
            case _ if lab == "mergeLL" => gradeMergeLL()
            case _ if lab == "lab3" => gradeLab3()
            case _ => println("INVALID ARGUMENTS")
        }
    }

    def gradeGCD(): Unit = {
        try {
            println(">>> GRADING GCD")
            testEquals(5, Lab3.gcd(10, 5), "gcd(10, 5)")
            testEquals(1, Lab3.gcd(10, 3), "gcd(10, 3)")
            testEquals(1, Lab3.gcd(1, 1), "gcd(1, 1)")
            testEquals(3, Lab3.gcd(9, 3), "gcd(9, 3)")
            testEquals(6, Lab3.gcd(42, 36), "gcd(42, 36)")
        } catch {
            case e : Throwable => println("\t>>> Runtime Error Has Occured")
        }
    }

    def gradeCountingChange(): Unit = {
        try {
            println(">>> GRADING COUNTING CHANGE")
            testEquals(8, Lab3.countingChange(5), "countingChange(5)")
            testEquals(987, Lab3.countingChange(15), "countingChange(15)")
            testEquals(10946, Lab3.countingChange(20), "countingChange(20)")
            testEquals(17711, Lab3.countingChange(21), "countingChange(21)")
        } catch {
            case e : Throwable => println("\t>>> Runtime Error Has Occured")
        }
    }

    def gradeMergeLL(): Unit = {
        try {
            println(">>> GRADING MERGE SORTED LINKED LIST")
            testEquals(LinkedList(1,2,3), Lab3.mergeLinkedLists(LinkedList(1,2), LinkedList(3)), "mergeLinkedLists(LinkedList(1,2), LinkedList(3))")
            testEquals(LinkedList(1,2,3), Lab3.mergeLinkedLists(LinkedList(1,2,3), LinkedList()), "mergeLinkedLists(LinkedList(1,2,3), LinkedList())")
            testEquals(LinkedList(1,2,3), Lab3.mergeLinkedLists(LinkedList(1,3), LinkedList(2)), "mergeLinkedLists(LinkedList(1,3), LinkedList(2))")
        } catch {
            case e : Throwable => println("\t>>> Runtime Error Has Occured")
        }
    }

    def gradeLab3(): Unit = {
       gradeGCD()
       gradeCountingChange()
       gradeMergeLL()
    }

    def testEquals(expected : Any, actual : Any, method: String) : Unit = {
        try {
            if(expected == actual) {
                println("\tPassed: " + method)
            }else{
                println("\t>>> Failed: " + method + " | Expected: " + expected + " but got " + actual)
            }
            
        }catch {
            case e : Throwable => println("\t>>> Runtime Error: " + method)
        }
    }
}
