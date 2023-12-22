import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), k = scanner.nextInt();
			int x = scanner.nextInt(), y = scanner.nextInt();
			System.out.println((n > k) ? k * x + (n - k) * y : n * x);
		}
	}
}
