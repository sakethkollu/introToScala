object Lab2Autograder{
    def main(args: Array[String]): Unit = {
        
        println("========== STARTING LAB 2 AUTOGRADER ==========\n")

        val lab = args(0)

        lab match {
            case _ if lab == "nthPrime" => gradeNthPrime()
            case _ if lab == "missing" => gradeMissing()
            case _ if lab == "lab2" => gradeLab2()
            case _ => println("INVALID ARGUMENTS")
        }
    }

    def gradeNthPrime(): Unit = {
        try {
            println(">>> GRADING nthPrime")
            testEquals(3571, Lab2.nthPrime(500), "nthPrime(500)")
            testEquals(48611, Lab2.nthPrime(5000), "nthPrime(5000)")
            testEquals(2539, Lab2.nthPrime(371), "nthPrime(371)")
            testEquals(1831, Lab2.nthPrime(282), "nthPrime(282)")
            testEquals(3, Lab2.nthPrime(2), "nthPrime(2)")
            testEquals(2, Lab2.nthPrime(1), "nthPrime(1)")
        } catch {
            case e : Throwable => println("\t>>> Runtime Error Has Occured")
        }
    }

    def gradeMissing(): Unit = {
        try {
            println(">>> GRADING MISSING")
            testEquals(3, Lab2.missing(Array(1,2,4,5,6,7,8)), "missing(Array(1,2,4,5,6,7,8)")
        } catch {
            case e : Throwable => println("\t>>> Runtime Error Has Occured")
        }
    }

    def gradeLab2(): Unit = {
        gradeNthPrime()
        gradeMissing()
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
