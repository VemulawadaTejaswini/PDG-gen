

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static class Knapsack {

		int n, w;
		int wt[];
		long value[];
		long dp[][];

		Knapsack(int n, int w) {

			this.n = n;
			wt = new int[n];
			value = new long[n];

			dp = new long[n][w + 1];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= w; j++)
					dp[i][j] = -1L;
			}
		}

		long maxprofit(int i, int j) {

			if (i == n || j == 0)
				return 0;

			if (dp[i][j] != -1L)
				return dp[i][j];

			if (wt[i] <= j) {

				long left = value[i] + maxprofit(i + 1, j - wt[i]);
				long right = maxprofit(i + 1, j);

				return dp[i][j] = Math.max(left, right);
			}

			else
				return dp[i][j] = maxprofit(i + 1, j);
		}
	}

	public static void main(String args[]) throws Exception {

		MyScanner sc = new MyScanner();
		PrintWriter pr = new PrintWriter(System.out);
		int n = sc.nextInt();
		int w = sc.nextInt();

		Knapsack a = new Knapsack(n, w);

		for (int i = 0; i < n; i++) {

			a.wt[i] = sc.nextInt();
			a.value[i] = sc.nextLong();
		}

		pr.println(a.maxprofit(0, w));
		pr.close();
	}

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}