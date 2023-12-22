import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
			System.out.println(0);
			return;
		}

		long min = Long.MAX_VALUE;
		min = Math.min(min, a * b);
		min = Math.min(min, b * c);
		min = Math.min(min, c * a);
		System.out.println(min);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
