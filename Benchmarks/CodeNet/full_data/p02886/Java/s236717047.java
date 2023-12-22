fun main(args: Array<String>) {
    abc143b()
}

fun abc143b() {
    val n = readLine()!!.toInt()
    val dList = readLine()!!.split(" ").map { it.toInt() }

    val answer = (0 until n).map { i ->
        (i + 1 until n).map { j ->
            dList[i] * dList[j]
        }
    }.flatten().sum()

    println(answer)
}
