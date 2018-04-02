
fun sum(n1: Double, n2: Double): Double{
    //block
    var sum = n1 + n2
    return sum
}

fun display(n1: Double): Unit{
    println(n1)
}

fun main(args : Array<String>){
    var r = sum(5.0,4.0)
    display(r)
}