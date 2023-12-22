fun main(args: Array<String>) {
    abc143c()
}

fun abc143c() {
    val n = readLine()!!.toInt()
    val s = readLine()!!

    val slimes = mutableListOf<Char>()
    s.forEachIndexed { index, c ->
        if (index > 0) {
            if (slimes.last() != c) slimes.add(c)
        } else {
            slimes.add(c)
        }
    }

    println(slimes.size)
}
