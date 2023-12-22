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
		String[][] dp = new String[s.length + 1][t.length + 1];
		for (int i = s.length - 1; i >= 0; i--) {
			for (int j = t.length - 1; j >= 0; j--) {
				if (s[i] == t[j]) {
					if (dp[i + 1][j + 1] != null)
						dp[i][j] = s[i] + dp[i + 1][j + 1];
					else {
						dp[i][j] = s[i] + "";
					}
				} else {
					int n = 0;
					int m = 0;
					if (dp[i + 1][j] != null) {
						n = dp[i + 1][j].length();
					}
					if (dp[i][j + 1] != null) {
						m = dp[i][j + 1].length();
					}
					if (n >= m) {
						dp[i][j] = dp[i + 1][j];
					} else {
						dp[i][j] = dp[i][j + 1];
					}
				}
			}
		}
		if (dp[0][0] != null)
			out.println(dp[0][0]);
		else {
			out.println("");
		}
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
