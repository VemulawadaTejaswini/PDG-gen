import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	static long MOD = 1000000007L;

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

	static long calcCombi(long n, long c) {
		// まず階乗の配列を計算する
		long[] array = new long[(int) (n + 1)];
		array[0] = 0L;
		array[1] = 1L;
		for (long i = 2; i <= n; ++i) {
			int index = (int) i;
			array[index] = array[index - 1] * i % MOD;
		}
		long divVal = array[(int)(n-c)] * array[(int)(c)] % MOD;
		long val = array[(int)(n)];
		while(val % divVal != 0) {
			val += MOD;
		}
		return val / divVal;
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
