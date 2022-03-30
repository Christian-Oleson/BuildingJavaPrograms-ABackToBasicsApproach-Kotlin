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

    fun exercise3() {
        val sb = StringBuilder("A well-formed Java program has\n")
        sb.appendLine("a main method with { and }")
        sb.appendLine("braces.")
        sb.appendLine("")
        sb.appendLine("A System.out.println statement")
        sb.appendLine("has ( and ) and usually a")
        sb.appendLine("String that starts and ends")
        sb.appendLine("with a \" character.")
        sb.appendLine("(But we type \\\" instead!")
        sb.appendLine("Also, I wrote this in Kotlin")
        sb.appendLine("so replace System.out.println")
        sb.append("with println()")
        print(sb)
    }

    fun exercise4() {
        println("What is the difference between\na ' and a \"? Or between a \" and a \\\"?\n");
        println("One is what we see when we're typing our program.\nThe other is what appears on the \"console\".");
    }
}