fun main() {

    val num=2

   /* when(num){  // --> We can also use when statement without  the use of conditions
        1 -> println("Hello")
        2 -> println("Hi")
        3 -> println("Hola")
        4 -> println("Hey")
        else -> println("Get out")
    }*/

    when(num){  // --> We can also use when statement without  the use of conditions
      in  1..10 -> println("Hello")
      in  11..20 -> println("Hi")
      else -> println("Get out")
    }
}