fun main(args: Array<String>){

    try {
        var n2: Int = readLine()!!.toInt()
        var  div = 100 / n2

        println("div: $div")
    } catch (ex: Exception){
        println(ex.message)
    }

}