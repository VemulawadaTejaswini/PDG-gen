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

		boolean[] f = new boolean[n];
		f[0] = true;

		int[] cnt = new int[n];
		Arrays.fill(cnt, 1);

		for (int i=0; i<m; i++) {
			int x = in.nextInt() - 1;
			int y = in.nextInt() - 1;
			cnt[x]--; cnt[y]++;
			if (f[x]) {
				f[y] = true;
				if (cnt[x] == 0) f[x] = false;
			}
		}

		int ans = 0;
		for (int i=0; i<n; i++) {
			if (f[i]) ans++;
		}

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