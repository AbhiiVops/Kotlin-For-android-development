package OOPS


fun main() {

    val dog1 = Dog1("Labrador","Brown",23)
    val dog = Dog1("German", "Brown",24,"Sandy")


}
class Dog1(var breed:String, var color: String, var age: Int) {

    var name: String? = null

    constructor(breed: String, color: String, age:Int,name:String) : this(breed,color,age) {
        this.name =name
    }


}