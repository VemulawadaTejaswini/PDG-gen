import java.util.Scanner;

public class Main {

	/**
	 * Minimization
	 */
	public static void main(String...args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			if ((n - 1) % (k - 1) == 0) {
				System.out.println((n - 1) / (k - 1));
			} else {
				System.out.println((n - 1) / (k - 1) + 1);
			}
		}
	}
}