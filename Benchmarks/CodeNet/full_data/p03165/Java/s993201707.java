import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		int[][] dp = new int[s.length + 1][t.length + 1];

		for (int i = s.length - 1; i >= 0; i--) {
			for (int j = t.length - 1; j >= 0; j--) {
				if (s[i] == t[j]) {
					dp[i][j] = 1 + dp[i + 1][j + 1];

				} else {
					if (dp[i + 1][j] >= dp[i][j + 1]) {
						dp[i][j] = dp[i + 1][j];

					} else {

						dp[i][j] = dp[i][j + 1];
					}
				}
			}
		}
		int i = 0;
		int j = 0;
		String sol = "";
		while (i < s.length && j < t.length) {
			if (s[i] == t[j]) {
				sol += s[i];
				i++;
				j++;
			} else if (dp[i + 1][j] >= dp[i][j + 1]) {
				i++;
			} else if (dp[i + 1][j] < dp[i][j + 1]) {
				j++;
			}
		}
		out.println(sol);
		out.close();
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
