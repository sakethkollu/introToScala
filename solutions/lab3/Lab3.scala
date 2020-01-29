import scala.collection.mutable.LinkedList

object Lab3 {

    //TODO: Find the greatest common divisor of two Integers
    def gcd( x: Int, y: Int ) : Int = {
        if (x == 0) {
            y
        } else {
            gcd(y % x, x)
        }
    }

    //TODO: Count the number of ways to make change of an integer quantity using
    //      coins of value 1 and 2 only
    def countingChange( total : Int ) : Int = {
        if (total == 0) {
            1
        } else if (total < 0 ) {
            0
        } else {
            countingChange(total - 1) + countingChange(total - 2)
        }
    }

    //TODO: Merge two sorted LinkedLists, returning a new LinkedList
    def mergeLinkedLists( l1 : LinkedList[Int], l2 : LinkedList[Int] ) : LinkedList[Int] = {
        var merged = LinkedList[Int]()

        if(l1 == LinkedList()) {
            l2
        }else if(l2 == LinkedList()) {
            l1
        } else {
            if(l1.head > l2.head) {
                merged = LinkedList(l2.head)
                merged.next = mergeLinkedLists(l1, l2.next)
            } else {
                merged = LinkedList(l1.head)
                merged.next = mergeLinkedLists(l1.next, l2)
            }
            merged
        }

       
    }

}