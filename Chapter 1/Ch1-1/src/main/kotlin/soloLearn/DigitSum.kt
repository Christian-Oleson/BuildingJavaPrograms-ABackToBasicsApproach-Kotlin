package soloLearn

class DigitSum {

    fun sumOfDigits(input: String): Int {
        var sum : Int = 0

        for (c in input) {
            println("Current Char: $c")
            println("Current Sum: $sum")
            sum = sum.plus(c.digitToInt())
            println("Updated Sum: $sum")
        }

        println(sum)
        return sum
    }
}