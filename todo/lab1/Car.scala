
//Note: This is how you implement a class constructor.
//      Just put in the args you want to pass in, in the header.
//Implement all methods marked TODO and all ____ lines
class Car(name: String){
    
    val owner = name
    
    val make : String = "Toyota"
    val model: String = "Corolla"
    val year: Int = 2020

    val mpg: ____ = 3
    var fuel: Double = 0.0
    var tank: ____ = 13.2
    
    def getOwner(): ____ = {
        owner
    }

    def getMake(): ____ = {
        ____
    }

    //TODO: Implement getModel

    //TODO: Implement getYear

    //TODO: Implement getMPG

    //TODO: Implement getFuel

    //TODO: Implement setFuel(newFuel : Double): Unit
    //Update fuel iff 0 <= newFuel <= tank

    //TODO: Implement getTankCap

    //TODO: Implement fillMax(): Unit
    //Set fuel to the tank capacity
  
    //TODO: Implement drive(miles : Double) : Unit
    //Print "Drove!" if all conditions met
    /* 
        Drive iff:
            a) Remaining fuel is >= 0
            b) miles > 0
        
        Driving should update your fuel level
    
    */ 

}