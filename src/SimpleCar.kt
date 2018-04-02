class Car(){
    var type: String? = null
    var model: Int? = null
    var price: Double? = null

    init {
        println("class is created")
    }

    constructor(type: String, model: Int, price: Double): this(){
        this.model = model
        this.price = price
        this.type = type
    }

    constructor(model: Int): this(){
        this.model = model
    }

    fun gettype(): String{
        return this.type!!
    }
}

fun main(args: Array<String>){
    val huCar = Car("BMW", 2018, 1500.0)
    val jenCar = Car("Honda", 2019, 1400.0)

    println(huCar.model)
    println(jenCar.type)
    println(huCar.gettype())
}