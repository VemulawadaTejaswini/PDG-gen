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
			long result = calcCombi3(A, B);
			System.out.println(result);
		}
	}

	static long calcCombi3(long A, long B) {
		int a = (int) A;
		int b = (int) B;
		long[][] mat = new long[a + 1][b + 1];
		for (int i = 0; i <= a; ++i) {
			mat[i][0] = 1L;
		}
		for (int i = 0; i <= b; ++i) {
			mat[0][i] = 1L;
		}
		for (int i = 1; i <= a; ++i) {
			for (int j = 1; j <= b; ++j) {
				mat[i][j] = (mat[i - 1][j] + mat[i][j - 1]) % MOD;
			}
		}
		return mat[a][b];
	}

	static long calcCombi2(long n, long c) {
		long result = 1L;
		for (long i = 1; i <= c; ++i) {
			result *= (n - c + i);
			result /= i;
			result %= MOD;
		}
		return result;
	}

	static long calcCombi(long n, long c) {
		BigDecimal result = new BigDecimal(1);
		for (long i = 1; i <= c; ++i) {
			result = result.multiply(new BigDecimal(n - c + i));
			result = result.divide(new BigDecimal(i));
		}
		return (result.remainder(new BigDecimal(MOD))).longValue();
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
