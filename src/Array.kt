
fun main(args: Array<String>){
    var arrayList = ArrayList<String>()
    arrayList.add("jeny")
    arrayList.add("henry")
    arrayList.add("nea")
    arrayList.add("tommy")

    println("First name ${arrayList[0]}")
    arrayList.set(0, "lavar")

    for (item in arrayList){
        println(item)
    }

    if (arrayList.contains("henry")){
        println("name found")
    } else{
        println("name not found")
    }

    for (index in 0..arrayList.size - 1){
        println(arrayList.get(index))
    }
}