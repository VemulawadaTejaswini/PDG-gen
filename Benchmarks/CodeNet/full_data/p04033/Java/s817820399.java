import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (0 < a) {
			System.out.println("Positive");
		} else if (a <= 0 && 0 <= b) {
			System.out.println("Zero");
		} else {
			if ((b - a) % 2 == 0) {
				System.out.println("Negative");
			} else {
				System.out.println("Positive");
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
