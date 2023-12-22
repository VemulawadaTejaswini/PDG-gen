import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		long tmp = scanner.nextLong();
		for (int i = 0; i < n - 1; i++) {
			tmp = lcm(tmp, scanner.nextLong());
		}

		System.out.println(tmp);
	}

	static long gcd(long a, long b) {
		long temp;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return b;
	}

	private static long lcm(long m, long n) {
		return m / gcd(m, n) * n;
	}
}
