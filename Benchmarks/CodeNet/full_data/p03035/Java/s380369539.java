import java.util.*


fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    when {
        a >= 13 -> println(b)
        a in 6..12 -> println(b / 2)
        else -> println(0)
    }
}