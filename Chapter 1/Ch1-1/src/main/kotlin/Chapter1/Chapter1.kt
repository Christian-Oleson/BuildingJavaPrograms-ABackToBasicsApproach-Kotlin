package Chapter1

class Chapter1 {
    fun exercise1() {
        println("//////////////////////")
        println("|| Victory is mine! ||")
        println("//////////////////////")
    }

    fun exercise2() {
        println("   \\/")
        println("  \\\\//")
        println(" \\\\\\///")
        println("\\\\\\\\////")
        println("////\\\\\\\\")
        println(" ///\\\\\\")
        println("  //\\\\")
        println("   /\\")
    }

    fun exercise2Improved() {
        drawSpike(5)
    }

    private fun drawSpike(depth: Int) {
        val startingChar = '\\'
        val endingChar = '/'
        val sb = StringBuilder()
        for (i in 1..depth) {
            val spaceQuantity = depth - i
            spaceWriter(sb, spaceQuantity)
            val charQuantity = depth - spaceQuantity
            for (k in 0 until charQuantity) {
                sb.append(startingChar)
            }
            for (k in 0 until charQuantity) {
                sb.append(endingChar)
            }
            spaceWriter(sb, spaceQuantity)
            if (i != depth) {
                sb.append("\n")
            }
        }
        val string1 = sb.toString()
        val string2 = sb.reverse().toString()
        println(string1)
        println(string2)
    }

    private fun spaceWriter(sb: StringBuilder, spaceQuantity: Int) {
        for (j in 0 until spaceQuantity) {
            sb.append(" ")
        }
    }
}