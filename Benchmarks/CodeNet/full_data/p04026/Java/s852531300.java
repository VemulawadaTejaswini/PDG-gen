import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static String s;
	static int[][] cnt, dp;
	static int alp, n;

	static int[] dfs(int l, int r) {
		if (dp[l][r] == -1) {
			return null;
		}

		if (r - l < 2) {
			dp[l][r] = -1;
			return null;
		}

		int c = cnt[r][alp];
		if (l != 0) c -= cnt[l-1][alp];
		if (c > (r - l + 1)/2) {
			return new int[]{l, r};
		}

		int[] left = dfs(l, (l+r)/2);
		if (left != null) {
			return left;
		}

		int[] mid = dfs((l*2+r)/3, (l+r*2)/3);
		if (mid != null) {
			return mid;
		}

		int[] right = dfs((l+r)/2+1, r);
		if (right != null) {
			return right;
		}

		dp[l][r] = -1;
		return null;
	}

	static void solve() {
		s = in.next();
		n = s.length();
		cnt = new int[n+1][26];
		for (int i=0; i<n; i++) {
			cnt[i][s.charAt(i) - 'a']++;
			for (int j=0; j<26; j++) {
				cnt[i+1][j] = cnt[i][j];
			}
		}

		dump(cnt[n]);


		for (alp=0; alp<26; alp++) {
			dp = new int[n][n];
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