import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Set;
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
		TaskA solver = new TaskA();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskA {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int[] a = new int[3];
			for (int i = 0; i < 3; i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			Set<String> was = new HashSet<>();
			for (int step = 0; ; step++) {
				for (int i = 0; i < 3; i++) {
					if (a[i] % 2 != 0) {
						out.println(step);
						return;
					}
				}
				int[] na = new int[3];
				for (int i = 0; i < 3; i++) {
					na[i] = (a[(i + 1) % 3] + a[(i + 2) % 3]) / 2;
				}
				a = na;
				String key = a[0] + " " + a[1] + " " + a[2];
				if (was.contains(key)) {
					out.println(-1);
					return;
				}
				was.add(key);
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

