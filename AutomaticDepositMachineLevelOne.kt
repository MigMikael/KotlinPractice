import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    //print("Enter num of banknote")
    var numOfBanknote = reader.nextInt()

    var bankNote = IntArray(numOfBanknote)
    for (index in bankNote.indices) {
        bankNote[index] = reader.nextInt()
    }
    reader.nextLine()

    while(true) {
        var total = 0

        var amountStr = reader.nextLine()

        if (amountStr == "-1") {
            break
        }

        val amount = amountStr.split(" ")
        //println(amount)
        
        for (index in bankNote.indices) {
            var curr_amount = amount[index].toInt()
            var sum = curr_amount * bankNote[index]
            total += sum
        }
        println(total)
    } 
}