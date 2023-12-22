import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int k = scanner.nextInt();
			for (int i = getMin(a, b); i >= 1; i--) {
				if ((0 == (a % i)) && (0 == (b % i))) {
					k--;
					if (0 == k) {
						System.out.println(i);
						break;
					}
				}
			}
		}
	}

	private static int getMin(int a, int b) {
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