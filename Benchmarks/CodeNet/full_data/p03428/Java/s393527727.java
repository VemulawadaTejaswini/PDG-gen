import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
		TaskB solver = new TaskB();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskB {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			for (int i = 0; i < n; i++) {
				x[i] = in.nextInt();
				y[i] = in.nextInt();
			}

			final int K = (int) 3e5;
			double[] alpha = new double[K + 1];
			double[] xs = new double[K];
			double[] ys = new double[K];
			for (int i = 0; i < K; i++) {
				alpha[i] = 2 * Math.PI * i / K;
			}
			for (int i = 0; i < K; i++) {
				double a = 0.5 * (alpha[i] + alpha[(i + 1) % alpha.length]);
				xs[i] = Math.cos(a) * 1e8;
				ys[i] = Math.sin(a) * 1e8;
			}
			double[] dist = new double[n];
			double[] ans = new double[n];
			for (int i = 0; i < K; i++) {
				for (int j = 0; j < n; j++) {
					double dx = xs[i] - x[j];
					double dy = ys[i] - y[j];
					dist[j] = Math.sqrt(dx * dx + dy * dy);
				}
				int best = -1;
				for (int j = 0; j < n; j++) {
					if (best < 0 || dist[best] < dist[j]) {
						best = j;
					}
				}
				ans[best] += 1.0 / K;
			}

			for (int i = 0; i < n; i++) {
				out.printf("%.15f\n", ans[i]);
			}
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

