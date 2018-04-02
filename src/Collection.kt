fun main(args : Array<String>){

    var map = hashMapOf(1 to "henry", 2 to "duong")
    map.put(3, "jenny")
    println(map.get(3))
    println(map[3])

    var ar = arrayOf(1,10,22,11)
    println(ar[3])
    var l = listOf(11,22,33,44,55)
    for (item in l){
        println(item)
    }

    var mutable = mutableListOf(12,32,432,123,43,4,4)
    mutable[3] = 5
    println(mutable[3])
}