import java.util.Scanner

fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    var text:String = reader.nextLine()

    var len = text.length
    //println(len)
    for (char in text) {
        val ascii = char.toInt()
        //println("$char is $ascii")

        var encoded_char = ascii + len
        encoded_char %= 95
        encoded_char += 32

        print(encoded_char.toChar())
    }
    println()
}