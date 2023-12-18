public class Main {
	Main() {
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int tmpB = 0;
		int tmpC = 0;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		if (a > b) {
			tmpB = b;
			b = a;
			a = tmpB;
		}
		if (b > c) {
			tmpC = c;
			c = b;
			b = tmpC;
		}
		if (a > b) {
			tmpB = b;
			b = a;
			a = tmpB;
		}
		System.out.println(a + " " + b + " " + c );
	}
}
