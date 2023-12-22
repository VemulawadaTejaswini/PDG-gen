import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

 class Main {
	static int h;
	static int w;
	static char[][] grid;
	static long[][] dp;

	static long dp(int i, int j) {
		if (i == h && j == w) {
			return 0;
		}
		if (grid[i][j] == '#') {
			return 0;
		}
		if (grid[i][j] == 'g') {
			return 1;
		}
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		long x = 0;
		if (i < h - 1 && j < w - 1) {
			x = dp(i + 1, j) + dp(i, j + 1);
		} else if (i < h && j == w - 1) {
			x = dp(i + 1, j);
		} else if (i == h - 1 && j < w) {
			x = dp(i, j + 1);
		}
		return dp[i][j] = x;
	}

	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		grid = new char[h][w];
		for (int i = 0; i < h; i++) {
			String s = br.readLine();
			for (int j = 0; j < w; j++) {
				grid[i][j] = s.charAt(j);
			}
		}
		grid[h - 1][w - 1] = 'g';
		dp = new long[h][w];
		out.println(dp(0, 0));
		out.close();
	}
}
