import java.util.*

class Person(var name: String, var age: Int): Comparable<Person>{
    override fun compareTo(other: Person): Int {
        return this.age - other.age
    }
}
fun main(args: Array<String>){
    var listOfNames = ArrayList<Person>()
    listOfNames.add(Person("henry", 20))
    listOfNames.add(Person("duong", 22))
    listOfNames.add(Person("lava", 15))

    for (name in listOfNames){
        println(name.name)
        println(name.age)
    }

    println("after sort")
    Collections.sort(listOfNames)
    for (name in listOfNames){
        println(name.name)
        println(name.age)
    }
}