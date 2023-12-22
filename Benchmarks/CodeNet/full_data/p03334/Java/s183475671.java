import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
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
		int n;
		Point[] ans;
		int k;
		boolean[][] used;
		List<Point>[] forbidden;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			n = in.nextInt();
			int d1 = in.nextInt();
			int d2 = in.nextInt();
			List<Point> p1 = new ArrayList<>();
			List<Point> p2 = new ArrayList<>();
			for (int x = -2 * n; x <= 2 * n; x++) {
				for (int y = -2 * n; y <= 2 * n; y++) {
					Point p = new Point(x, y);
					if (x * x + y * y == d1) {
						p1.add(p);
					}
					if (x * x + y * y == d2) {
						p2.add(p);
					}
				}
			}
			forbidden = new List[2];
			forbidden[0] = p1;
			forbidden[1] = p2;
			ans = new Point[n * n];
			used = new boolean[2 * n][2 * n];
			boolean[][] was = new boolean[2 * n][2 * n];
			int[] qx = new int[4 * n * n];
			int[] qy = new int[4 * n * n];
			was[n][n] = true;
			qx[0] = n;
			qy[0] = n;
			int qt = 0;
			int qh = 1;
			while (qt < qh) {
				if (k == ans.length) {
					break;
				}
				int x = qx[qt];
				int y = qy[qt];
				++qt;

				boolean ok = true;
				outer:
				for (List<Point> l : forbidden) {
					for (Point p : l) {
						int nx = x + p.x;
						int ny = y + p.y;
						if (nx >= 0 && nx < 2 * n && ny >= 0 && ny < 2 * n && used[nx][ny]) {
							ok = false;
							break outer;
						}
					}
				}

				if (ok) {
					used[x][y] = true;
					ans[k++] = new Point(x, y);
				}

				for (int dx = -1; dx <= 1; dx++) {
					for (int dy = -1; dy <= 1; dy++) {
						int nx = x + dx;
						int ny = y + dy;
						if (nx < 0 || nx >= 2 * n || ny < 0 || ny >= 2 * n) {
							continue;
						}
						if (!was[nx][ny]) {
							was[nx][ny] = true;
							qx[qh] = nx;
							qy[qh] = ny;
							++qh;
						}
					}
				}
			}

			if (k != ans.length) {
				throw new AssertionError();
			}
			for (int i = 0; i < k; i++) {
				out.println(ans[i].x + " " + ans[i].y);
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

