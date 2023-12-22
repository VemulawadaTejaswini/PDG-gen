import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		a += 12;
		a %= 13;
		b += 12;
		b %= 13;
		if (a < b) {
			System.out.println("Bob");
		} else if (b < a) {
			System.out.println("Alice");
		} else {
			System.out.println("Draw");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
