import java.io.PrintWriter
val pw = PrintWriter(System.out)


fun main(args: Array<String>) {
    val S = next()

    if(S[0] == S[1] && S[1] == S[2] && S[0] == S[2]){
        println("No")
    }else{
        println("Yes")
    }
}

fun func() {

}



fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextListOfString() = next().split(" ")
fun nextListOfInt() = nextListOfString().map { it.toInt() }
fun nextListOfLong() = nextListOfString().map { it.toLong() }
fun nextListOfDouble() = nextListOfString().map { it.toDouble() }

