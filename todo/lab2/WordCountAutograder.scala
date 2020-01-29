object WordCountAutograder{
    def main(args: Array[String]): Unit = {
        
        println("========== STARTING WordCount AUTOGRADER ==========\n")

        gradeFileIO()
    }

    def gradeFileIO(): Unit = {
        try {
            println(">>> GRADING WORDCOUNT")

            val wc = new WordCount()

            val map = wc.wordCount();

            testEquals(51, map("Romeo"), "Word Count of Romeo")
            testEquals(24, map("Juliet"), "Word Count of Juliet")
            testEquals(90, map("The"), "Word Count of The")
            testEquals(7, map("William"), "Word Count of William")
            testEquals(228, map("thou"), "Word Count of thou")
            testEquals(8, map("bite"), "Word Count of bite")
            testEquals(4, map("thumb"), "Word Count of thumb")
            

        } catch {
            case e : Throwable => println("\t>>> Runtime Error Has Occured")
        }
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
