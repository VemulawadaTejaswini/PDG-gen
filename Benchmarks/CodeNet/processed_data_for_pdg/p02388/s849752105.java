public class Main{
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int number = stdin.nextInt();
		if (number >= 1 && number <= 100) {
			int result = number * number * number;
			System.out.println(result);
		}
	}
}
