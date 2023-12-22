import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Random;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
		ProblemD solver = new ProblemD();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemD {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int d1 = in.nextInt();
			int d2 = in.nextInt();
			List<Point> forbidden = new ArrayList<>();
			for (int x = -2 * n; x <= 2 * n; x++) {
				for (int y = -2 * n; y <= 2 * n; y++) {
					Point p = new Point(x, y);
					int d = x * x + y * y;
					if (d == d1 || d == d2) {
						forbidden.add(p);
					}
				}
			}

			Random random = new Random(0);
			int k = 0;
			boolean[][] used = new boolean[2 * n][2 * n];

			while (k < n * n) {
				int bestX = 0;
				int bestY = 0;
				int bestBad = -1;
				int bestR = 0;
				for (int it = 0; it < 30; it++) {
					int x = random.nextInt(2 * n);
					int y = random.nextInt(2 * n);
					while (used[x][y]) {
						x = random.nextInt(2 * n);
						y = random.nextInt(2 * n);
					}
					int bad = 0;
					for (Point p : forbidden) {
						int nx = x + p.x;
						int ny = y + p.y;
						if (nx >= 0 && nx < 2 * n && ny >= 0 && ny < 2 * n && used[nx][ny]) {
							++bad;
						}
					}
					int dx = x - n;
					int dy = y - n;
					int r = dx * dx + dy * dy;
//				int r = Math.max(Math.abs(dx), Math.abs(dy));
//				if (bestBad < 0 || bestBad > bad || bestBad == bad && bestR < r) {
					if (bestBad < 0 || bestBad > bad) {
						bestBad = bad;
						bestX = x;
						bestY = y;
						bestR = r;
					}
					if (bestBad == 0) {
						break;
					}
				}
				int x = bestX;
				int y = bestY;
				for (Point p : forbidden) {
					int nx = x + p.x;
					int ny = y + p.y;
					if (nx >= 0 && nx < 2 * n && ny >= 0 && ny < 2 * n && used[nx][ny]) {
						--k;
						used[nx][ny] = false;
					}
				}
				++k;
				used[x][y] = true;
			}

			for (int x = 0; x < 2 * n; x++) {
				for (int y = 0; y < 2 * n; y++) {
					if (used[x][y]) {
						out.println(x + " " + y);
					}
				}
			}
		}

		class Point {
			int x;
			int y;

			Point(int x, int y) {
				this.x = x;
				this.y = y;
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

