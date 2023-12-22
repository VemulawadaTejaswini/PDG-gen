import java.util.*;

public class Main {
	static int N = 1000001;

	// array to store inverse of 1 to N
	static long[] factorialNumInverse = new long[N + 1];

	// array to precompute inverse of 1! to N!
	static long[] naturalNumInverse = new long[N + 1];

	// array to store factorial of first N numbers
	static long fact[] = new long[N + 1];

	// Function to precompute inverse of numbers
	static void InverseofNumber(long p) {
		naturalNumInverse[0] = naturalNumInverse[1] = 1;
		for (int i = 2; i <= N; i++)
			naturalNumInverse[i] = naturalNumInverse[(int) (p % i)] * (p - p / i) % p;
	}

	// Function to precompute inverse of factorials
	static void InverseofFactorial(long p) {
		factorialNumInverse[0] = factorialNumInverse[1] = 1;

		// precompute inverse of natural numbers
		for (int i = 2; i <= N; i++)
			factorialNumInverse[i] = (naturalNumInverse[i] * factorialNumInverse[i - 1]) % p;
	}

	// Function to calculate factorial of 1 to N
	static void factorial(long p) {
		fact[0] = 1;

		// precompute factorials
		for (int i = 1; i <= N; i++) {
			fact[i] = (fact[i - 1] * i) % p;
		}
	}

	// Function to return nCr % p in O(1) time
	static long Binomial(int N, int R, long p) {
		// n C r = n!*inverse(r!)*inverse((n-r)!)
		long ans = ((fact[N] * factorialNumInverse[R]) % p * factorialNumInverse[N - R]) % p;
		return ans;
	}

	// Driver Code

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int m = (2 * x - y) / 3;
		int n = (2 * y - x) / 3;
		if ((2 * x - y) % 3 == 0 && (2 * y - x) % 3 == 0) {
			long p = 1000000007;
			InverseofNumber(p);
			InverseofFactorial(p);
			factorial(p);
			long sum = 0;
			for (int i = 1; i <= Math.min(m + 1, n); i++) {
				sum += (Binomial(m + 1, i, p) * Binomial(n - 1, i - 1, p)) % p;
				sum %= p;

			}
			System.out.println(sum);
		} else {
			System.out.println(0);
		}

	}

	public static int c(int n, int r) {
		return 1;
	}

}
