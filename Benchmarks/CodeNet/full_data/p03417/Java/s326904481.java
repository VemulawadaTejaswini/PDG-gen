import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long n = scanner.nextLong();
			long m = scanner.nextLong();
			if (1L == n) {
				if (1L == m) {
					System.out.println(1);
				} else {
					System.out.println(m - 2);
				}
			} else {
				if (1L == m) {
					System.out.println(n - 2);
				} else {
					System.out.println((n - 2) * (m - 2));
				}
			}
		}
	}
}
