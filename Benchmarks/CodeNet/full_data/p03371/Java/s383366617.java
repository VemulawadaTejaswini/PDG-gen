import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		if (a + b < c * 2) {
			System.out.println(a * x + b * y);
		} else {
			if (x < y) {
				System.out.println(Math.min((c * 2) * x + (y - x) * b, c * 2 * y));
			} else {
				System.out.println(Math.min((c * 2) * y + (x - y) * a, c * 2 * x));
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}
