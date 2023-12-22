import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if (a == b) {
			System.out.println("Draw");
			return;
		}

		if (a == 1) {
			System.out.println("Alice");
			return;
		}

		if (b == 1) {
			System.out.println("Bob");
			return;
		}

		if (a > b) {
			System.out.println("Alice");
			return;
		}

		System.out.println("Bob");

	}

}
