import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>){
    writeToFile("duong\nminh\nhoang")
    readFile()
}

fun writeToFile(str: String){
    try {
        var fo = FileWriter("test.txt")
        fo.write(str)
        fo.close()
    } catch (ex: Exception){
        println(ex.message)
    }
}

fun readFile(){
    try {
        var fin = FileReader("test.txt")
        var c: Int?
        do {
            c = fin.read()
            print(c.toChar())
        } while (c != -1)
    } catch (ex: Exception){
        println(ex.message)
    }
}