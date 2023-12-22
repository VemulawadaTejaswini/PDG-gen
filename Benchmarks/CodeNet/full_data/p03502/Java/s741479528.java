import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long f = 0;

		for (int i = n; i > 0; i /= 10) {
			f += i % 10;
		}

		if (n % f == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
