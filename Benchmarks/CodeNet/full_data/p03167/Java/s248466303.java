import java.util.*;
import java.io.*;

public class Main {

	static char[][] grid;
	static int[][] dp;
	static int h, w;
	static int mod = (int) 1e9+7;

	public static int dp(int r, int c) {
		if (r == h - 1 && c == w - 1) {
			return 1;
		}
		if (r == h || c == w) {
			return 0;
		}
		if (grid[r][c] == '#')
			return 0;
		if (dp[r][c] != -1) {
			return dp[r][c];
		}
		return dp[r][c] = (dp(r + 1, c) + dp(r, c + 1)) % mod;

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		h = sc.nextInt();
		w = sc.nextInt();
		grid = new char[h][];
		for (int i = 0; i < h; i++) {
			grid[i] = sc.next().toCharArray();
		}
		dp = new int[h][w];
		for (int[] x : dp)
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
