
class UserAdmins<T> (credit:T){
    init {
        println(credit)
    }
}

fun <T> display(process: T){
    println(process)
}

fun main(args: Array<String>){
    var userAdmin = UserAdmins<String> ("Henry")
    var userAdmin2 = UserAdmins<Int> (5)
    var userAdmin3 = UserAdmins<Double> (6.6)

    display<String>("eee")
}