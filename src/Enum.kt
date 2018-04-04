
enum class Direction{
    NORTH, SOUTH, EAST, WEST
}

fun main(args: Array<String>){
    var userDirect = Direction.SOUTH
    if (userDirect == Direction.EAST){
        println("north")
    } else {
        println("dont know")
    }
}