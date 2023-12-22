import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		FastScanner cin = new FastScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(FastScanner cin, PrintWriter cout) {
		assert solve(2, new long[] { 3, 1, 4, 1, 5, 9 }) == 1;
		assert solve(1, new long[] { 1, 2, 3 }) == -1;
		assert solve(3, new long[] { 8, 2, 2, 7, 4, 6, 5, 3, 8 }) == 5;
		int n = cin.nextInt();
		long[] a = new long[3 * n];
		for (int i = 0; i < a.length; i++)
			a[i] = cin.nextLong();
		long ans = solve(n, a);
		cout.println(ans);
	}

	private static long solve(int n, long[] a) {
		// n == 1e5では時間が無理では？
		long ans = Long.MIN_VALUE;
		long[] c = new long[a.length];
		for (int i = n; i < 2 * n; i++) {
			System.arraycopy(a, 0, c, 0, a.length);
			Arrays.sort(c, 0, i);
			Arrays.sort(c, i, 3 * n);
			long left = 0;
			long right = 0;
			for (int j = 0; j < n; j++) {
				left += c[i - 1 - j];
				right += c[i + j];
			}
			ans = Math.max(ans, left - right);
		}
		return ans;
	}

	/**
	 * How to read input in Java — tutorial <br />
	 * By Flatfoot<br />
	 * http://codeforces.com/blog/entry/7018
	 */
	static class FastScanner {
		private BufferedReader br;
		private StringTokenizer st;

		FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new IllegalStateException(e);
				}
			return st.nextToken();
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				throw new IllegalStateException(e);
			}
			return str;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
