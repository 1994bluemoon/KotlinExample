

fun sum(n1: Int, n2: Int): Int{
    return n1 + n2
}

fun sum(n1: Int, n2: Int, n3: Int): Int{
    return n1 + n2 + n3
}
fun sum(n1: Int, n2: Int, n3: Int, n4: Int): Int{
    return n1 + n2 + n3 + n4
}
fun sum(n1: Int, n2: Int, n3: Int, n4: Int, n5: Int): Int{
    return n1 + n2 + n3 + n4 + n5
}

fun show(s1: String): Unit{
    println(s1)
}

fun show(s1: Double): Unit{
    println(s1)
}

fun show(s1: Int): Unit{
    println(s1)
}

fun main(args: Array<String>){
    println(sum(1,2,3,4,5))
    println(sum(1,2,3,4))
    println(sum(1,2,3))
    println(sum(1,2))

    show("henry")
    show(10.5)
    show(6)
}