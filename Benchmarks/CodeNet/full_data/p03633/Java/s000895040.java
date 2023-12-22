import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numClocks = Integer.parseInt(scanner.nextLine());

		long currentLCM = 1;
		for (int clockIndex = 0; clockIndex < numClocks; clockIndex++) {
			long period = Long.parseLong(scanner.nextLine());
			currentLCM = lcm(currentLCM, period);
		}

		System.out.println(currentLCM);
	}

	private static long lcm(long num1, long num2) {
		return num1 * (num2 / gcd(num1, num2));
	}

	private static long gcd(long num1, long num2) {
		return num2 == 0 ? num1 : gcd(num2, num1 % num2);
	}
}
