public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int box;
		if (a > b) {
			box = a;
			a = b;
			b = box;
		}
		if (b > c) {
			box = b;
			b = c;
			c = box;
		}
		if (a > b) {
			box = a;
			a = b;
			b = box;
		}
		System.out.println(a + " " + b + " " + c);
	}
}
