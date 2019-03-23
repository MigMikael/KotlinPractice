import java.util.Scanner

fun main(args: Array<String>) {
    print("Enter text:")
    val stringInput = readLine()!!
    println("Your input text is $stringInput")

    val reader = Scanner(System.`in`)
    print("Enter number: ")
    var num = reader.nextInt()
    println("Your num is $num")
}