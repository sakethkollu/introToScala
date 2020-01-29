object Lab2 {

    //TODO: Return the nthPrime prime number
    def nthPrime(n : Int) : Int = {
        var count = 0
        var candidate = 1
        
        if(n == 1) {
            2
        } else {
            while (count != n) {
                var foundDivisor = false
                for (divisor <- 2 to (Math.pow(candidate, 0.5)).toInt + 1) {
                    if (candidate % divisor == 0) {
                        foundDivisor = true
                    }
                }
                if (!foundDivisor) {
                    count = count + 1
                }
                candidate = candidate + 1
            }
            candidate - 1
        }

        
    }

    //TODO: Find the missing number in the array.
    //First and last numbers are garunteed to exist,
    /*

    scala> val numbers = List(1,2,3,5)
    scala> missing(numbers)
    res0: Int = 4

    */
    def missing( arr : Array[Int] ) : Int = {
        
        val size = arr.length + 1
        val sum = size * (size  + 1) / 2  
        val arrSum = arr.sum
        var missing = sum - arrSum
        missing
    }

}