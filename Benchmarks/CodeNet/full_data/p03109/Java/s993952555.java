/** Still TBD
  *
  */
object Main extends App {
  final private val DELIMITER = "/"
  val input = io.StdIn.readLine.split(DELIMITER)
  val year = input(0).toInt
  val month = input(1).toInt
  val day = input(2).toInt

  if (year > 2019) println("TBD")
  else if (year == 2019 && month > 5) println("TBD")
  else if (year == 2019 && month == 4 && day > 30) println("TBD")
  else println("heisei")
}
