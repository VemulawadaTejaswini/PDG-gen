import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(isBuyPattern(scanner.nextInt()) == true ? "Yes" : "No");
		}
	}
	private static boolean isBuyPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (4 * i + 7 * j == n) {
					return true;
				}
			}
		}
		return false;
	}
}