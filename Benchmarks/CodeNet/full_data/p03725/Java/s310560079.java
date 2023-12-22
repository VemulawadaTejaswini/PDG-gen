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
			final int infinity = 1000000000;
			int height = in.nextInt();
			int width = in.nextInt();
			int k = in.nextInt();
			char[][] s = new char[height][];
			int sr = -1;
			int sc = -1;
			for (int r = 0; r < height; r++) {
				s[r] = in.next().toCharArray();
				for (int c = 0; c < width; c++) {
					if (s[r][c] == 'S') {
						sr = r;
						sc = c;
					}
				}
			}
			int[] q = new int[2 * height * width];
			int[][] dist = new int[height][width];
			for (int[] arr : dist) {
				Arrays.fill(arr, infinity);
			}
			dist[sr][sc] = 0;
			int qt = 0;
			int qh = 0;
			q[qh++] = sr;
			q[qh++] = sc;
			int[] dr = {-1, 0, 1, 0};
			int[] dc = {0, -1, 0, 1};
			while (qt < qh) {
				int r = q[qt++];
				int c = q[qt++];
				for (int dir = 0; dir < 4; dir++) {
					int nr = r + dr[dir];
					int nc = c + dc[dir];
					if (nr < 0 || nr >= height || nc < 0 || nc >= width) {
						continue;
					}
					if (s[nr][nc] == '#') {
						continue;
					}
					if (dist[nr][nc] > 1 + dist[r][c]) {
						dist[nr][nc] = 1 + dist[r][c];
						q[qh++] = nr;
						q[qh++] = nc;
					}
				}
			}
			int ans = infinity;
			for (int r = 0; r < height; r++) {
				for (int c = 0; c < width; c++) {
					if (dist[r][c] > k) {
						continue;
					}
					int d = infinity;
					d = Math.min(d, r);
					d = Math.min(d, height - r - 1);
					d = Math.min(d, c);
					d = Math.min(d, width - c - 1);
					ans = Math.min(ans, 1 + (d + k - 1) / k);
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

