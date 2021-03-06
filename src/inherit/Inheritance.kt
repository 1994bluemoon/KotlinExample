package inherit

open class Operation(){
    protected var ProcessName: String? = null
    open fun sum(n1 : Int, n2 : Int): Int{
        return n1 + n2
    }

    fun div(n1: Int, n2: Int):Int{
        return n1/n2
    }
}

class MultiOperations(): Operation(){

    fun sub(n1 : Int, n2 : Int): Int{
        return n1 - n2
    }

    fun multi(n1: Int, n2: Int):Int{
        return n1/n2
    }

    fun getName(){
        super.ProcessName
    }
}

fun main(args: Array<String>){
    var op  = Operation()
    var sum = op.sum(5,6)
    println(sum)
    var div = op.div(8,2)
    println(div)

    var op2 = MultiOperations()
    var sub = op2.sub(5,6)
    println(sub)
    var div2 = op2.div(10,5)
    var mul = op2.multi(2,3)
    println(mul)
    sum = op2.sum(5,6)
    println(sum)
    div = op2.div(8,2)
    println(div)

    println(op2.getName())
}