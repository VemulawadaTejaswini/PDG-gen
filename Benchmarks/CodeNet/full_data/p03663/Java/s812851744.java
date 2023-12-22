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
		TaskE solver = new TaskE();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskE {
		FastScanner in;
		PrintWriter out;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			this.in = in;
			this.out = out;
			String prefix = "";
			while (true) {
				int l = 0;
				int r = 10;
				if (prefix.isEmpty()) {
					l = 1;
				}
				while (r - l > 1) {
					int m = (l + r) / 2;
					if (send(prefix + m)) {
						l = m;
					} else {
						r = m;
					}
				}
				if (send(prefix + l)) {
					prefix += l;
				} else {
					break;
				}
			}
			out.println("! " + prefix);
			out.flush();
		}

		private boolean send(String s) {
			out.println("? " + s);
			out.flush();
			return in.next().equals("Y");
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

	}
}

