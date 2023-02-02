fun main() {

//    val listofStrings : List<Any> = listOf("Box","Table","Chair")  // --> Immutable list
    var listofStrings = mutableListOf("Box","Table","Chair")  // --> mutable list
    var a = arrayOf("Box","Table","Chair")  // --> mutable list

    listofStrings[1] = "Abhii"
    listofStrings.add("12")
    listofStrings.addAll(a)
    println(listofStrings)


    var name = arrayListOf("Abhii",1,'a',2,true)  // --> This is an array list
}