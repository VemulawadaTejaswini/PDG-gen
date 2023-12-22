import java.util.*;
import java.io.*;

public class Main {

	static int[][] presumw, presumb;
	static int[] mapw, mapb;
	static int n;
	static long[][] dp;

	public static long dp(int w, int b) {

		if (w == n && b == n) {
			return 0;
		}
		if (dp[w][b] != -1)
			return dp[w][b];
		long ans = (long) 1e18;
		if (w != n) {
			ans = Math.min(ans, presumw[w + 1][mapw[w]] + presumb[b][mapw[w]] + dp(w + 1, b));
		}
		if (b != n) {
			ans = Math.min(ans, presumb[b + 1][mapb[b]] + presumw[w][mapb[b]] + dp(w, b + 1));
		}
		return dp[w][b] = ans;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		n = sc.nextInt();
		int[] v = new int[2 * n];
		char[] c = new char[2 * n];
		mapw = new int[n];
		mapb = new int[n];
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.next().charAt(0);
			v[i] = sc.nextInt() - 1;
			if (c[i] == 'W') {
				mapw[v[i]] = i;
			} else
				mapb[v[i]] = i;
		}
		presumw = new int[n + 1][2 * n];
		presumb = new int[n + 1][2 * n];
		for (int i = 0; i < 2 * n; i++) {
			if (c[i] == 'W')
				presumw[0][i] = 1;
			else
				presumb[0][i] = 1;
		}

		for (int i = 1; i < n + 1; i++) {
			for (int j = 0; j < 2 * n; j++) {
				presumw[i][j] = presumw[i - 1][j];
				presumb[i][j] = presumb[i - 1][j];
			}
			presumw[i][mapw[i - 1]] = 0;
			presumb[i][mapb[i - 1]] = 0;
		}
		for (int i = 0; i < n + 1; i++) {
			for (int j = 1; j < 2 * n; j++) {
				presumw[i][j] += presumw[i][j - 1];
				presumb[i][j] += presumb[i][j - 1];
			}
		}
		dp = new long[n + 1][n + 1];
		for (long[] x : dp)
			Arrays.fill(x, -1);
		pw.println(dp(0, 0));
		pw.close();

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}

	}

}
