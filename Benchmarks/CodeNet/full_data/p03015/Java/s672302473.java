import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		String L = sc.get();
		int mod = 1000000007;
		int patterns = 1;
		for (int i = L.lastIndexOf('1'); i >= 0; i = L.lastIndexOf('1', i - 1)) {
			patterns = (((patterns * 2) % mod) + modpow(3, L.length() - 1 - i, mod)) % mod;
		}
		System.out.println(patterns);
	}

	int modpow(long a, long n, int mod) {
		long res = 1;
		while (n > 0) {
			if ((n & 1) == 1) res = res * a % mod;
			a = a * a % mod;
			n /= 2;
		}
		return Math.toIntExact(res);
	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
			StringTokenizer line;

			public String get() {
				while (line == null || !line.hasMoreTokens()) try {
					line = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
				return line.nextToken();
			}
		});
	}
}