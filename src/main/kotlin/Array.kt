import java.util.*

// Syntax to declare an array
// var nameOfArray = arrayOf<type>(elements)

/*
In var type of array we can replace the elements of the array with another array
But in case of the val array it is not possible.

Both in var and val type of array we cannot change the size of the array

*/

fun main() {

 //   var charArray : Array<Char> = arrayOf<Char>('a','b','c','d','e')

     val newArr : Array<Any> = arrayOf("Abhi","dipi",1,'a')

     println(newArr)
     println(Arrays.toString(newArr))


//     for(i in 1..newArr.size-1) {
//          print("${newArr[i]}")
//     }

     for(i in 1 until newArr.size) {   // --> Until keyword can also be used to print the loop
          print("${newArr[i]}")
     }


}


// ** Arrays.toString() --> Returns a string representation of the array specified within round brackets. The string
//                          representation consist of a list of the array's elements within square brackets
// Functions we can use in Array
// size()
// get()


