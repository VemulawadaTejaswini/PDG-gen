import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			factorization(a[i]);
		}
		scanner.close();

		long lcm = 1;
		for (int i = 0; i < PRIME_NUMBER; i++) {
			lcm *= power(PRIME_LIST[i], factorList[i]);
			lcm %= MOD;
		}

		int result = 0;
		long b;
		for (int i = 0; i < n; i++) {
			b = lcm * inverse(a[i]) % MOD;
			result += b;
			result %= MOD;
		}
		System.out.println(result);
	}

	static final int MOD = 1000000007;

	static int inverse(int denom) {
		return power(denom, MOD - 2);
	}

	static int power(int b, int p) {//b^p
		long res = 1;
		for (long a = b % MOD; p > 0; a = a * a % MOD, p >>= 1)
			if ((p & 1) > 0)
				res = res * a % MOD;
		return (int) res;
	}

	static int[] PRIME_LIST = new int[78498];
	static int PRIME_NUMBER = 78498;
	static {
		int p_max = 999983;
		int count = 0;
		boolean[] notPrime = new boolean[p_max + 1];
		for (int i = 2; i <= 997; i++) {
			if (notPrime[i])
				continue;
			for (int j = i * i; j <= p_max; j += i) {
				notPrime[j] = true;
			}
			PRIME_LIST[count] = i;
			count++;
		}
		for (int i = 1009; i <= p_max; i++) {
			if (notPrime[i])
				continue;
			PRIME_LIST[count] = i;
			count++;
		}

	}
	static int[] factorList = new int[PRIME_NUMBER];

	static void factorization(int x) {
		for (int i = 0, exponent; i < PRIME_NUMBER; i++) {
			if (x == 1)
				break;
			exponent = 0;
			while (x % PRIME_LIST[i] == 0) {
				exponent++;
				x /= PRIME_LIST[i];
			}
			if (exponent > factorList[i])
				factorList[i] = exponent;
		}
	}
}
