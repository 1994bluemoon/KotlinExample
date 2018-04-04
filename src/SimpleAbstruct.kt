

abstract class CreditCard(){
    fun CreditID(): String{
        return "252845791hj"
    }

    abstract fun newCredit()
}

class UserInfo(): CreditCard(){
    fun getInfo(): String{
        return CreditID()
    }

    override fun newCredit(){

    }
}

fun main(args: Array<String>){
    var user = UserInfo()
}