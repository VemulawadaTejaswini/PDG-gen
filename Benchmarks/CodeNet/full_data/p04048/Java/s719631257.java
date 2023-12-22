import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int x = scanner.nextInt();

		// x + n-x + 2*(n - (n-x)) + 3 * (n-x - (n-(n-x))
		// x + (n-x) + 2x + 3*(n-2x)

		System.out.println((long)x + ((long)n-(long)x) + (2L*(long)x) + (3L*((long)n-2L*(long)x)));
	}
}