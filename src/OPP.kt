

fun main(args: Array<String>){
    for (x in 9 downTo 0 step 3) {
        println(x)
    }

    println(describe("1"))
}

fun describe(obj: Any): String = when (obj) {
    1           -> "One"
    "Hello"     -> "Greeting"
    is Long     -> "Long"
    !is String  -> "Not a string"
    else        -> "Unknown"
}