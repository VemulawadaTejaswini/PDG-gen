import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if ((x + y) % 3 > 0) {
			System.out.println(0);
			return;
		}
		System.out.println(comb((x + y) / 3, x / 3));

	}

	static int comb(int a, int b) {
		long result = fact[a];
		result *= inverce(fact[a - b]);
		result %= MOD;
		result *= inverce(fact[b]);
		result %= MOD;
		return (int) result;
	}

	static int MOD = 1000000007;
	static int factMax = 2000000 / 3;

	static int[] fact = new int[factMax + 1];
	static {
		fact[0] = 1;
		for (int i = 1; i <= factMax; i++) {
			fact[i] = (int) ((long) fact[i - 1] * i % MOD);
		}
	}

	static int inverce(int x) {
		return power(x, MOD - 2);
	}

	static int power(int x, int e) {
		long result = 1;
		for (long base = x; e > 0; e >>= 1, base = base * base % MOD) {
			if (e % 2 == 1) {
				result *= base;
				result %= MOD;
			}
		}
		return (int) result;
	}
}
