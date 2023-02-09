
fun main() {

    // Null Pointer Exceptions
    // A null pointer exceptions occurs when the compiler expects a value for a variable but instead gets NULL (or value)

    // How to define a null variable?

    var  nullValue: String? = null // --> / -> Null safety operator
    println(nullValue)
    println(nullValue?.length ?: "This is null")



    /*Why do we use a null safety operator ?
      A null safety operator is used to declare a variable whose value may be null*/
}