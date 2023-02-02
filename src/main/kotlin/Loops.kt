
fun main() {

    for(i in 1..10) {
        println(i)
    }

    for(i in 1..10 step 2) {  // --> To increment by 2 use step
        println(i)
    }

    for(i in 10 downTo 1) {  // --> To increment by 2 use step
        println(i)
    }

    println()

    var j =1

    while(j<=10) {
        println(j)
        j++
    }

    println()

    var k =1
    do{
        println(k)
        k++
    }
        while(k<=10)
}