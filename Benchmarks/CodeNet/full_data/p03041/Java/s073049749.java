import java.util.*

fun main(args: Array<String?>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val k = scanner.nextInt()
    val s = scanner.next()

    s.toCharArray().let {
        it[k - 1] = it[k - 1].toLowerCase()
        println(it)
    }
}
