import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	static long MOD = 1000000007L;
	long[] array;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		long X = Long.parseLong(tokens[0]);
		long Y = Long.parseLong(tokens[1]);
		if (!checkCond(X, Y)) {
			System.out.println("0");
		} else {
			long A = (2 * Y - X) / 3;
			long B = (2 * X - Y) / 3;
			long result = calcCombi(A + B, Math.min(A, B));
			System.out.println(result);
		}
	}

	static long inv(long val) {
		long result = 1L;
		long k = MOD - 2L;
		long y = val;
		while (k != 0) {
			if ((k & 1L) > 0) {
				result = (result * y) % MOD;
			}
			y = (y * y) % MOD;
			k /= 2;
		}
		return result;

	}

	static long calcCombi(long n, long c) {
		// まず階乗の配列を計算する
		long[] array = new long[(int) (n + 1)];
		array[0] = 0L;
		array[1] = 1L;
		for (long i = 2; i <= n; ++i) {
			int index = (int) i;
			array[index] = array[index - 1] * i % MOD;
		}

		long val = array[(int) (n)];
		val *= inv(array[(int) (n - c)]);
		val %= MOD;
		val *= inv(array[(int) (c)]);
		val %= MOD;
		return val;
	}

	static boolean checkCond(long X, long Y) {
		boolean cond = true;
		if ((2 * Y - X) % 3 != 0) {
			cond = false;
		}
		if ((2 * X - Y) % 3 != 0) {
			cond = false;
		}
		return cond;
	}
}