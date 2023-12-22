import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static String s;
	static int[] cnt;
	static int[][] dp;
	static int alp, n;

	static int[] dfs(int l, int r) {
		if (dp[l][r] == -1) {
			return null;
		}

		if (r < l + 2) {
			dp[l][r] = -1;
			return null;
		}

		int c = cnt[r];
		if (l != 0) c -= cnt[l-1];
		if (c > (r - l + 1)/2) {
			return new int[]{l, r};
		}

		for (int i=l; i<r; i++) {
			int[] left = dfs(l, i);
			if (left != null) {
				return left;
			}

			int[] right = dfs(i+1, r);
			if (right != null) {
				return right;
			}
		}

		dp[l][r] = -1;
		return null;
	}

	static void solve() {
		s = in.next();
		n = s.length();
		cnt = new int[n+1];


		// dump(cnt[n]);

		dp = new int[n][n];

		for (alp=0; alp<26; alp++) {
			Arrays.fill(cnt, 0);
			for (int i=0; i<n; i++) {
				if (alp == s.charAt(i) - 'a') cnt[i]++;
				cnt[i+1] = cnt[i];
				Arrays.fill(dp[i], 0);
			}

			int[] ans = dfs(0, n-1);
			if (ans != null) {
				out.println(ans[0] +" "+ ans[1]);
				return;
			}
		}

		out.println("-1 -1");
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