import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static final int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		long[] factorial = new long[n];
		long[] inverse = new long[n];
		long[] factorial_inverse = new long[n];

		factorial[0] = 1;
		factorial[1] = 1;
		inverse[1] = 1;
		factorial_inverse[0] = 1;
		factorial_inverse[1] = 1;
		for (int i = 2; i < n; i++) {
			factorial[i] = factorial[i - 1] * i % MOD;
			inverse[i] = MOD - inverse[MOD % i] * (MOD / i) % MOD;
			factorial_inverse[i] = factorial_inverse[i - 1] * inverse[i] % MOD;
		}

		long[] array = new long[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);

		long max = 0;
		long min = 0;

		for (int i = k; i <= n; i++) {
			long combination = factorial[i - 1] * (factorial_inverse[k - 1] * factorial_inverse[i - k] % MOD) % MOD;
			max = (max + array[i - 1] * combination) % MOD;
		}

		for (int i = k; i <= n; i++) {
			long combination = factorial[i - 1] * (factorial_inverse[k - 1] * factorial_inverse[i - k] % MOD) % MOD;
			min = (min + array[n - i] * combination) % MOD;
		}

		print((max + MOD - min) % MOD);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}