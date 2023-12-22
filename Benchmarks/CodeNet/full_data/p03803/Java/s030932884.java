import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a == 1) {
			a = a * 14;
		}
		if (b == 1) {
			b = b * 14;
		}
		if (a > b) {
			System.out.println("Alice");
		} else if (b > a) {
			System.out.println("Bob");
		} else {
			System.out.println("Draw");
		}
	}

}
