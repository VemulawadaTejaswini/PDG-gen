import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * https://atcoder.jp/contests/abc127/submissions/16641564 を参考に作成
 */
public class Main {

	private static final long MOD = 1_000_000_007;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), m = scanner.nextInt(), k = scanner.nextInt();
			long xSum = (n * (n - 1) / 2 % MOD * n % MOD
					- (n - 1) * n % MOD * (2 * n - 1) % MOD * powMod(6, MOD - 2) % MOD + MOD) % MOD * m % MOD * m % MOD;
			long ySum = (m * (m - 1) / 2 % MOD * m % MOD
					- (m - 1) * m % MOD * (2 * m - 1) % MOD * powMod(6, MOD - 2) % MOD + MOD) % MOD * n % MOD * n % MOD;
			System.out.println((xSum + ySum + MOD) % MOD * combinationMod(n * m - 2, k - 2) % MOD);
		}
	}

	/**
	 * n_C_m mod MOD を計算する
	 * 
	 * @param n
	 * @param m
	 * @return n_C_m mod MOD
	 */
	private static long combinationMod(long n, int m) {
		long min = Math.min(m, n - m), max = Math.max(m, n - m);
		long factorialMin = LongStream.rangeClosed(1, min).reduce(1L, (result, next) -> result = result * next % MOD);
		long factorialMax = LongStream.rangeClosed(min + 1, max).reduce(factorialMin,
				(result, next) -> result = result * next % MOD);
		long factorialN = LongStream.rangeClosed(max + 1, n).reduce(factorialMax,
				(result, next) -> result = result * next % MOD);
		return factorialN * powMod(factorialMin, MOD - 2) % MOD * powMod(factorialMax, MOD - 2) % MOD;
	}

	/**
	 * n^m mod MOD を計算する
	 * 
	 * @param n
	 * @param m
	 * @return n^m mod MOD
	 */
	private static long powMod(long n, long m) {
		long result = 1L;
		while (m > 0) {
			if (1 == (1 & m)) {
				result = result * n % MOD;
			}
			n = n * n % MOD;
			m >>= 1;
		}
		return result;
	}
}
