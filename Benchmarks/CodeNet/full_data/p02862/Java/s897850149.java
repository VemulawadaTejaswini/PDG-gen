
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int x = in.nextInt();
		int y = in.nextInt();
		long r = solve(x, y);
		System.out.println(r);
		in.close();
	}

	private static long solve(int x, int y) {
		if (2 * x - y < 0 || 2 * y - x < 0)
			return 0;
		if ((2 * x - y) % 3 != 0 || (2 * y - x) % 3 != 0)
			return 0;
		int a = (2 * x - y) / 3;
		int b = (2 * y - x) / 3;
		long r = 1, q = 1;
		for (int i = a + b, j = Math.min(a, b); j > 0; i--, j--) {
			r *= i;
			r %= MOD;
			q *= j;
			q %= MOD;
		}
		r *= invMod(q);
		r %= MOD;
		return r;
	}

	private static long invMod(long q) {
		q %= MOD;
		for (long r = 1; r < MOD; r++)
			if ((q * r) % MOD == 1)
				return r;
		return 0;
	}
}