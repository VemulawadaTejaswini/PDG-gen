object Main {
	val s = new java.util.Scanner(System.in)
	def main(args: Array[String]) {
		val a, b, c = s.nextInt()
		for (i <- 1 to b)
			if (a * i % b == c) {
				println("YES")
				return
			}
		println("NO")
	}
}
