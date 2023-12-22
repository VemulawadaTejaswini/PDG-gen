import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int n = in.nextInt(), m = in.nextInt();
		char[][] a=  new char[n][m];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextToken().toCharArray();
		}

		if (m != 3) {
			return;
		}
		
		int[][][] dp = new int[n + 1][n + 1][n + 1];
		int INF = Integer.MAX_VALUE / 2;
		for (int[][] i : dp) {
			for (int[] j : i) {
				Arrays.fill(j, INF);
			}
		}
		dp[n][n][n] = 0;
		
		int[][][][] cost =new int[3][3][n + 1][n + 1];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int s1 = 0; s1 <= n; s1++) {
					for (int s2 = 0; s2 <= n; s2++) {
						
						for (int t = 0; t + s1 < n && t + s2 < n; t++) {
							if (a[t + s1][i] == a[t + s2][j]) {
								cost[i][j][s1][s2]++;
							}
						}
						
					}
				}
			}
		}
		
		for (int i = n; i >= 0; i--) {
			for (int j = n; j >= 0; j--) {
				for (int k = n; k >= 0; k--) {
					if (i< n) {
						int val = dp[i + 1][j][k] + cost[0][1][i][j];
						dp[i][j][k] = Math.min(dp[i][j][k], val);
					}
					if (j < n) {
						int val = dp[i][j + 1][k] + cost[1][0][j][i] + cost[1][2][j][k];
						dp[i][j][k] = Math.min(dp[i][j][k], val);
					}
					if (k < n) {
						int val = dp[i][j][k + 1] + cost[2][1][k][j];
						dp[i][j][k] = Math.min(dp[i][j][k], val);
					}
				}
			}
		}
		
		out.println(dp[0][0][0]);
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
