import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int h = sc.nextInt();
		int w = sc.nextInt();

		FloydWarshall fw = new FloydWarshall(10);

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int c = sc.nextInt();

				fw.addEdge(i, j, c);
			}
		}

		int[] cnt = new int[10];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int a = sc.nextInt();
				if (a >= 0) {
					cnt[a]++;
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < 10; i++) {
			ans += cnt[i] * fw.getShortestPath(i, 1);
		}

		pr.println(ans);
	}

	private static class FloydWarshall {
		long[][] d;
		int n;
		long[][] result;
		boolean nf; // NEGATIVE CYCLE flag

		final long INF = Long.MAX_VALUE;

		FloydWarshall(int n) {
			this.n = n;
			d = new long[n][n];
			for (int i = 0; i < n; i++) {
				Arrays.fill(d[i], INF);
				d[i][i] = 0;
			}
			nf = false;
		}

		// i, j:0-indexed
		public void addEdge(int i, int j, int c) {
			d[i][j] = c;
		}

		public long getShortestPath(int i, int j) {
			if (nf) {
				return -INF;
			}

			if (result == null) {
				for (int kk = 0; kk < n; kk++) {
					for (int ii = 0; ii < n; ii++) {
						for (int jj = 0; jj < n; jj++) {
//							d[ii][jj] = Math.min(d[ii][jj], d[ii][kk] + d[kk][jj]);
							if (d[ii][kk] != INF && d[kk][jj] != INF && d[ii][jj] > d[ii][kk] + d[kk][jj]) {
								d[ii][jj] = d[ii][kk] + d[kk][jj];
							}
						}
					}
				}

				for (int k = 0; k < n; k++) {
					if (d[k][k] < 0) {
						nf = true;
						return -INF;
					}
				}

				result = d;
			}

			return result[i][j];
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
