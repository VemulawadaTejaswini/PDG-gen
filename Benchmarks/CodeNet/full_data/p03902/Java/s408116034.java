import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static void solve() {
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] a = new int[n][m];
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				a[i][j] = in.nextInt();
			}
			if (i != 0 && a[i-1][0] > a[i][0]) {
				out.println("-1");
				return;
			}
		}

		int ans = 0;

		for (int i=1; i<n; i++) {
			for (int j=1; j<m; j++) {
				if (a[i-1][j] < a[i][j]) {
					break;
				}

				if (a[i-1][j] > a[i][j]) {
					ans++;
					for (int k=1; k<m; k++) {
						a[i][k] += a[i][k-1];
					}
					j--;
				} else if (j == m-1 && a[i-1][j] >= a[i][j]) {
					ans++;
					for (int k=1; k<m; k++) {
						a[i][k] += a[i][k-1];
					}
				}
			}
		}

		dump(a);

		out.println(ans);
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.nanoTime();

		solve();
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}