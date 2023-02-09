fun main() {

    val nullList = listOf(1,2,3,null,5,null,9,null,"String")
    val arrayList = arrayListOf(1,2,3,null,5,null,9,null,"String")

    println(nullList.filterNotNull())
}