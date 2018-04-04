fun main(args: Array<String>){
    var t1 = UserThread("t1")
    t1.start()
    var t2 = UserThread("t2")
    t2.start()
    var t3 = UserThread("t3")
    t3.start()
    t3.join()
    var t4 = UserThread("t4 =")
    t4.start()
    println("thread is running")
}

class UserThread: Thread{
    var threadName: String? = null
    constructor(threadName: String): super(){
        this.threadName =threadName
    }

    override fun run() {
        super.run()
        var count = 0
        while (count < 20){
            println(this.threadName + ": " + count)
            count++
            try {
                Thread.sleep(20)
            } catch (ex: Exception){
                println(ex.message)
            }

        }
    }
}