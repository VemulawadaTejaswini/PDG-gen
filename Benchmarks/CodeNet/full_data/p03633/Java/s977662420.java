import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		ConsoleScanner cin = new ConsoleScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	static long now() {
		return System.currentTimeMillis();
	}

	static void trace(Object... objects) {
		assert null != System.out.format("trace:%s\n", Arrays.deepToString(objects));
	}

	private static void solve(ConsoleScanner cin, PrintWriter cout) {
		// assert solve(1) == 1;

		int n = cin.nextInt();
		long[] t = new long[n];
		for (int i = 0; i < t.length; i++)
			t[i] = cin.nextLong();

		long start = now();

		long ans = solve(n, t);

		cout.println(ans);
		trace("elapsed", now() - start);
	}

	private static long solve(int n, long[] t) {
		long a = t[0];
		for (int i = 1; i < n; i++) {
			long b = t[i];
			long gcd = gcd(a, b);
			long lcm = a / gcd * b;
			a = lcm;
		}
		return a;
	}

	private static long gcd(long a, long b) {
		if (a < b) {
			long t = a;
			a = b;
			b = t;
		}
		return a % b == 0 ? b : gcd(b, a % b);
	}

	static class ConsoleScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			try {
				while (!st.hasMoreElements())
					st = new StringTokenizer(br.readLine());
				return st.nextToken();
			} catch (IOException e) {
				throw new AssertionError(e);
			}
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
