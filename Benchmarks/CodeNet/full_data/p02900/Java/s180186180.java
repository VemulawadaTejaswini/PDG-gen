import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
		Long b = sc.nextLong();

		long gcd = gcd(a, b);
		System.out.println(prime(gcd));
		sc.close();
	}

	private static long gcd(Long a, Long b) {

		if (b > a)
			return gcd(b, a);
		if (a % b == 0)
			return b;

		return gcd(b, a % b);
	}

	private static long prime(long n) {
		int count = 1;

		long d = n;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (d % i == 0) {
				count++;
				while (d % i == 0) {
					d = d / i;
				}
			}
		}

		if (d != 1)
			count++;
		return count;
	}
}
