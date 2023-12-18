public class Main {
	Main() {
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;
		a = scanner.nextInt();
		b = scanner.nextInt();
		if (a < b) {
			System.out.println("a < b");
		} else if (a > b) {
			System.out.println("a > b");
		} else {
			System.out.println("a == b");
		}
	}
}
