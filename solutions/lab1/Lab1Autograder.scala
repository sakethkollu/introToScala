object Lab1Autograder{
    def main(args: Array[String]): Unit = {
        
        println("========== STARTING LAB 1 AUTOGRADER ==========\n")

        val lab = args(0)

        lab match {
            case _ if lab == "lab1_1" => gradeLab1_1()
            case _ if lab == "lab1_2" => gradeLab1_2() //DOES NOT EXIST
            case _ if lab == "lab1" => gradeLab1()
            case _ => println("INVALID ARGUMENTS")
        }
    }

    def gradeLab1_1(): Unit = {
        try {
            println(">>> GRADING CAR CLASS LAB")
        
            val myCar = new Car("Alpha")

            testEquals("Alpha", myCar.getOwner(), "getOwner")    
            testEquals("Toyota", myCar.getMake(), "getMake")
            testEquals("Corolla", myCar.getModel(), "getModel") 
            testEquals(2020, myCar.getYear(), "getYear") 
            testEquals(31, myCar.getMPG(), "getMPG")
            testEquals(0.0, myCar.getFuel(), "getFuel")

            //Set fuel to more than tank test
            myCar.setFuel(100.0)
            testEquals(0.0, myCar.getFuel(), "setFuel(100.0)")

            //Set fuel to less than 0 test
            myCar.setFuel(-100.0)
            testEquals(0.0, myCar.getFuel(), "setFuel(-100.0)")

            //Set fuel to less than tank test
            myCar.setFuel(10.0)
            testEquals(10.0, myCar.getFuel(), "setFuel(10.0)")

            //Set fuel to tank test
            myCar.setFuel(13.2)
            testEquals(13.2, myCar.getFuel(), "setFuel(13.2)")

            testEquals(13.2, myCar.getTankCap(), "getTankCap")

            myCar.fillMax()
            testEquals(13.2, myCar.getFuel(), "fillMax")

            //miles = 0
            testEquals(0, myCar.drive(0), "drive(0)")
            testEquals(13.2, myCar.getFuel(), "fuel level after")

            //miles = -1
            testEquals(0, myCar.drive(-1), "drive(-1)")
            testEquals(13.2, myCar.getFuel(), "fuel level after")

            //miles > 0, fuel > 0
            testEquals(1, myCar.drive(32.2), "drive(32.2)")
            testEquals(12.161290322580644, myCar.getFuel(), "fuel level after")

        } catch {
            case e : Throwable => println("\t>>> Runtime Error Has Occured")
        }
        


    }

    def gradeLab1_2(): Unit = {
        println("GRADING ___ LAB") //DOES NOT EXIST
    }

    def gradeLab1(): Unit = {
        gradeLab1_1()
        gradeLab1_2()
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
