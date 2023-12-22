import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Collections;
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
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int t = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}

			int posMin = 0;
			int posMax = 0;
			for (int i = 0; i < n; i++) {
				if (a[posMin] > a[i]) {
					posMin = i;
				}
				if (a[posMax] < a[i]) {
					posMax = i;
				}
			}

			long[] suff = new long[n];
			boolean[] peak = new boolean[n];
			for (int i = n - 1; i >= 0; i--) {
				suff[i] = a[i];
				if (i + 1 < n && suff[i] < suff[i + 1]) {
					suff[i] = suff[i + 1];
				} else {
					peak[i] = true;
				}
			}

			long min = Integer.MAX_VALUE;
			List<Long> v = new ArrayList<>();
			for (int i = 0; i + 1 < n; i++) {
				if (peak[i]) {
					min = Integer.MAX_VALUE;
					continue;
				}

				min = Math.min(min, a[i]);
				if (peak[i + 1]) {
					v.add(a[i + 1] - min);
				}
			}

			Collections.sort(v);
			Collections.reverse(v);
			int ans = 0;
			for (int i = 0; i < v.size(); i++) {
				if (v.get(i).equals(v.get(0))) {
					++ans;
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
					st = new StringTokenizer(in.readLine());
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

