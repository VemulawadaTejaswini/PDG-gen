import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();

		if (n % 500 <= a) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
