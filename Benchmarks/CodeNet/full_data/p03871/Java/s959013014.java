import java.io.*;
import java.util.*;

public class Main {
	FastScanner in;
	PrintWriter out;

	int n, m;
	double[][] p;

	double f(double A) {
		double touristWin = 0;
		for (int i = 0; i < 6; i++) {
			touristWin += Math.max(p[0][i] * A, p[1][i] * (1 - A));
		}
		return touristWin;
	}

	void solve() {
		n = 2;
		m = 6;
		p = new double[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				p[i][j] = in.nextInt() / 100.0;
			}
		}
		double res = Double.MAX_VALUE;
		double eps = 1e-4;
		for (double A = 0.0; A < 1; A += eps) {
			double l = A, r = A + eps;
			for (int it = 0; it < 50; it++) {
				double m1 = l + (r - l) / 3;
				double m2 = r - (r - l) / 3;
				double f1 = f(m1), f2 = f(m2);
				if (f1 < f2) {
					r = m2;
				} else {
					l = m1;
				}
			}
			res = Math.min(res, f((l + r) / 2));
		}
		out.println(res);
	}

	void run() {
		try {
			in = new FastScanner(new File("object.in"));
			out = new PrintWriter(new File("object.out"));

			solve();

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	void runIO() {

		in = new FastScanner(System.in);
		out = new PrintWriter(System.out);

		solve();

		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return null;
				st = new StringTokenizer(s);
			}
			return st.nextToken();
		}

		boolean hasMoreTokens() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return false;
				st = new StringTokenizer(s);
			}
			return true;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	public static void main(String[] args) {
		new Thread(null, new Runnable() {
			public void run() {
				new Main().runIO();
			}
		}, "1", 1 << 26).start();
	}
}