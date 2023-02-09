package OOPS

fun main() {

    val dog1 = Dog("Labrador", "Brown",3)
    dog1.eat()
    dog1.bark()

    val dog2 = Dog("German Shepherd", "Black", 4)
    dog2.eat()
    dog2.bark()
}

class Dog(var breed: String, var color: String, var age: Int) {


    fun eat() {
        println("${breed}s eat food")
    }

    fun bark() {

        println("${breed}s bark")
    }


}