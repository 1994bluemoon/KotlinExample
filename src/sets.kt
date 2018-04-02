

fun main(args : Array<String>){
    var setEmenet = setOf(1,2,32,42,12,345,1)
    for (elemet in setEmenet){
        println(elemet)
    }

    var setEmenetM = mutableSetOf(23,4,3,6,7,234,67)
    setEmenetM.add(77)
    for (elemet in setEmenetM){
        println(elemet)
    }
}