fun main(args: Array<String>) {
    abc143d()
}

fun abc143d() {
    val n = readLine()!!.toInt()
    val lines = readLine()!!.split(" ").map { it.toInt() }
        .sorted().toIntArray()

    var answer = 0
    for (bi in 0 until n) {
        var right = bi + 1
        for (ai in 0 until bi) {
            while (right < n && lines[right] < lines[ai] + lines[bi]) right++
            val left = bi + 1
            answer += right - left
        }
    }

    println(answer)
}
