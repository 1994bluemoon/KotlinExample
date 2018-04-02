
fun main(args : Array<String>){
    var map = HashMap<Int, String>()
    map.put(1, "henry")
    map.put(2, "hoang")
    map.put(33, "duong")
    println(map.get(33))

    map.put(33, "lo")
    for (k in map.keys){
        println(map.get(k))
    }
}