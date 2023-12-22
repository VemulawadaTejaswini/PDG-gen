import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt(), b = scanner.nextInt(), k = scanner.nextInt();
			for (int i = getMaxDivisor(a, b); i >= 1; i--) {
				if ((0 == (a % i)) && (0 == (b % i))) {
					if (0 == --k) {
						System.out.println(i);
						break;
					}
				}
			}
		}
	}

	/**
	 * @param a
	 * @param b
	 * @return aとbの共通の最大の約数の可能性のある値
	 */
	private static int getMaxDivisor(int a, int b) {
		if (a == b) {
			return a;
		} else if (a > b) {
			if (b > (a - b)) {
				return a - b;
			} else {
				return b;
			}
		} else {
			if (a > (b - a)) {
				return b - a;
			} else {
				return a;
			}
		}
	}
}
