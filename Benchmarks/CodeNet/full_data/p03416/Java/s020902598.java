import scala.io.StdIn

object B090 extends App {
  val Array(n, m) = StdIn.readLine.split(" ").map(_.toInt)

  val ans = (n to m).count(i => {
    val s = i.toString
    s == s.reverse
  })

  println(ans)
}
