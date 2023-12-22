fun main(args: Array<String>) {
    abc143a()
}

fun abc143a() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    val answer = Math.max(0, a - 2 * b)

    println(answer)
}
