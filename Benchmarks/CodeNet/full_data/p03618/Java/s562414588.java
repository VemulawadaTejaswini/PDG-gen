import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{ // 

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

		String s = cin.next();

		long start = now();

		long ans = solve(s);
		cout.println(ans);

		trace("elapsed", now() - start);
	}

	private static long solve(String s) {
		long len = s.length();
		long[] cnt = new long['z' - 'a' + 1];
		long[] others = new long[cnt.length];
		Arrays.fill(others, len);
		for (char c : s.toCharArray()) {
			int d = c - 'a';
			cnt[d] += 1;
			others[d] -= 1;
		}
		long ans = 0;
		for (int i = 0; i < cnt.length; i++)
			ans += cnt[i] * others[i];
		ans /= 2;
		ans += 1;
		return ans;
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
