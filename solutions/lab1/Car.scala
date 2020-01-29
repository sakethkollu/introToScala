class Car(name: String){
    
    val owner = name
    
    val make : String = "Toyota"
    val model: String = "Corolla"
    val year: Int = 2020

    val mpg: Int = 31
    var fuel: Double = 0.0
    var tank: Double = 13.2
        def getOwner(): String = {
        owner
    }

    def getMake(): String = {
        make
    }

    //TODO: Implement getModel
    def getModel(): String = {
        model
    }

    //TODO: Implement getYear
    def getYear(): Int = {
        year
    }

    //TODO: Implement getMPG
    def getMPG(): Double = {
        mpg
    }

    //TODO: Implement getFuel
    def getFuel(): Double = {
        fuel
    }

    //TODO: Implement setFuel(newFuel : Double): Unit
    //Update fuel iff 0 <= newFuel <= tank
    def setFuel(newFuel : Double): Unit = {
        if (newFuel >= 0 && newFuel <= tank)
        fuel = newFuel
    }

    //TODO: Implement getTankCap
    def getTankCap(): Double = {
        tank
    }

    //TODO: Implement fillMax(): Unit
    //Set fuel to the tank capacity
    def fillMax(): Unit = {
        setFuel(tank)
    }

    //TODO: Implement drive(miles : Double) : Int
    //Return 1 if drove and 0 if not drove
    /* 
        Drive iff:
            a) Remaining fuel is >= 0
            b) miles > 0
        
        Driving should update your fuel level
    
    */ 
    def drive(miles : Double): Int = {
        val gallonsUsed = miles / mpg
        if(fuel - gallonsUsed >= 0 && miles > 0){
            fuel = fuel - gallonsUsed
            1
        }else {
            0
        }

    }

}