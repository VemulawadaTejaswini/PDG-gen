import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskC {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[] cnt = new int[26];
			boolean[] any = new boolean[26];
			Arrays.fill(cnt, Integer.MAX_VALUE);
			for (int i = 0; i < n; i++) {
				char[] s = in.next().toCharArray();
				int[] cur = new int[26];
				for (char ch : s) {
					int c = ch - 'a';
					any[c] = true;
					++cur[c];
				}
				for (int j = 0; j < 26; j++) {
					cnt[j] = Math.min(cnt[j], cur[j]);
				}
			}
			StringBuilder ans = new StringBuilder();
			for (int i = 0; i < 26; i++) {
				if (!any[i]) {
					continue;
				}
				for (int j = 0; j < cnt[i]; j++) {
					ans.append((char) ('a' + i));
				}
			}
			out.println(ans);
		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String rl = in.readLine();
					if (rl == null) {
						return null;
					}
					st = new StringTokenizer(rl);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}

