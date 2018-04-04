

fun ArrayList<String>.swap(index1: Int, index2: Int){
    val temp = this.get(index1)
    this.set(index1, this.get(index2))
    this.set(index2, temp)
}

fun main(args:Array<String>){
    val arrayList = ArrayList<String>()
    arrayList.add("henry")
    arrayList.add("hoang")
    arrayList.add("lava")
    println(arrayList)

    arrayList.swap(0,2)
    println(arrayList)

}