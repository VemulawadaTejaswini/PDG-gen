import scala.io.{StdIn => in}
import scala.collection.{mutable => mu}

object Main extends App {
  val s = in.readLine
  val set = s.toSet
  val ans = if(set.size == 2 &&
   s.count(_ == set.head) == 2 &&
   s.count(_ == set.last) == 2) "Yes" else "No"

  println(ans)
}