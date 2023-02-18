fun main(args: Array<String>) {

    var i = 0
    var j = 0
    var counter = 0
    var container1: Int = 0
    var container2: Int = 0
    
    print("1. Enter the size of the container : ")
    var containerSize1 = readln().toInt()
    print("2. Enter the size of the container : ")
    var containerSize2 = readln().toInt()
    print("Enter the size to reach : ")
    var finalLiter = readln()!!.toInt()
5
    fun countTheStages(){
        counter = counter+1
        println("NUMBER OF STEPS : $counter")
    }

    fun showContainerInformation(){
        println("FIRST CONTAINER : $container1")
        println("SECOND CONTAINER : $container2")
        countTheStages()
    }

    fun fillTheFirst(){
        println("______________________________________________________")
        println("FIRST CONTAINER FILLED")
        for (i in container1..containerSize1 - 1) {
            container1 = container1 + 1
        }
        showContainerInformation()
    }

    fun transferFromFirstToSecond(){
        println("______________________________________________________")
        println("TRANSFER FROM FIRST TO SECOND")
        while (container1 > 0 && container2 < containerSize2) {
            container2 = container2 + 1
            container1 = container1 - 1
        }
        showContainerInformation()
    }

    fun emptyTheSecond(){
        println("______________________________________________________")
        println("EMPTY THE SECOND")
        container2 = 0
        showContainerInformation()
    }

    if (containerSize1 <= containerSize2) {
        println("First container should be bigger !!")
    } else {
        while (1 > 0) {
            fillTheFirst()
            if (container1 == finalLiter) {
                println("RESULT REACHED")
                break
            }
            transferFromFirstToSecond()
            if (container1 == finalLiter) {
                println("RESULT REACHED")
                break
            }
            emptyTheSecond()
            if (container1 == finalLiter) {
                println("RESULT REACHED")
                break
            }
            transferFromFirstToSecond()
            if (container1 == finalLiter) {
                println("RESULT REACHED")
                break
            }
        }
    }
}
