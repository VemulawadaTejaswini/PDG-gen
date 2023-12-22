import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		FastScanner cin = new FastScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(FastScanner cin, PrintWriter cout) {
		// assert solve(1) == 1;

		int n = cin.nextInt();
		int a = cin.nextInt();
		int b = cin.nextInt();
		long[] hs = new long[n];
		for (int i = 0; i < n; i++)
			hs[i] = cin.nextInt();
		long ans = solve(n, a, b, hs);
		cout.println(ans);
	}

	private static long solve(int n, long a, long b, long[] hs) {
		// 二分法
		long abdif = a - b;
		long l = 0;
		long r = (long) 1e9;
		while (l + 1 != r) {
			long m = (l + r) / 2;
			boolean ok = false;
			long yoha = b * m;
			long tgt = 0;
			for (long h : hs) {
				if (h - yoha <= 0)
					continue;
				tgt += (h - yoha + abdif - 1) / abdif;
			}
			ok = tgt <= m;
			if (ok)
				r = m;
			else
				l = m;
		}
		return r;
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
