import java.util.Scanner

fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    var numOfReward:Int = reader.nextInt()
    var rewardMap = mutableMapOf<String, Int>()

    for (i in 1..numOfReward) {
        var amountOfNumber = reader.nextInt()
        for (j in 1..amountOfNumber) {
            var num:String = reader.next()
            rewardMap[num] = i
        }
    }

    /* 
    for ((k, v) in rewardMap) {
        println("key is : $k and value is : $v")
    }*/
    reader.nextLine()
    while (true) {
        var userNumber = reader.nextLine()
        if (userNumber == "0") {
            break
        }else if (rewardMap.containsKey(userNumber)) {
            println("Reward ${rewardMap[userNumber]}")
        } else {
            println("Sorry")
        }
    }
}