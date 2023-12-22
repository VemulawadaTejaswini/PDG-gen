import java.util.*

fun Int.bit(i: Int) = 1 shl i and this > 0

fun main(A: Array<String>) {
    val s = Scanner(System.`in`)
    val n = s.nextInt()
    if (n > 24) {
        println(0)
        return
    }
    val a = IntArray(n) { Integer.parseInt(s.next()) }
    val b = BitSet(25)
    b.set(0)
    b.set(24)

    var r = 0
    outer@ for (f in 0..(1 shl n)) {
        b.clear(1, 24)
        for (i in 0 until n) {
            val j = if (1 shl i and f > 0) 24 - a[i] else a[i]
            if (b[j])
                continue@outer
            b.set(j)
        }
        val v = b.stream().skip(1)
                .map { o: Int -> o - b.previousSetBit(o - 1) }
                .min().asInt
        r = Math.max(r, v)
    }
    println(r)
}
