import model.Antena

fun main() {
    println("Dinension of getting up flat")
    println("============================")
    println("Insert many to Antennas : ")

    var input = readLine()!!.toInt()
    var data : ArrayList<Int> = ArrayList()

    for (i in 1..input step 1){
        println("Anttena position input")

        print("x: ")

        var x = readLine()!!.toInt()
        print("x: ")
        var y = readLine()!!.toInt()
        print("y: ")

        data.add(input)
    }
    println(data)

    println("Antennas Position Input")
    print("x: ")

    var y = readLine()!!.toInt()
    for (idx in 0..y step 1) {
        var dataY = readLine()!!.toInt()
        data.add(dataY)
    }

}

