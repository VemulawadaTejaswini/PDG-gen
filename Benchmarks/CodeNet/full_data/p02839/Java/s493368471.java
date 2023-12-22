import java.io.*;
import java.util.*;
public class Main {
	public static class FS {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch (Exception e) {}
			} return st.nextToken();
		}
		int nextInt() { return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
	}

	public static void main(String[] args) {
		FS in = new FS();
	
		int h = in.nextInt();
		int w = in.nextInt();
		int[][] a = new int[h][w];
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				a[i][j] = in.nextInt();
		int[][] b = new int[h][w];
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				b[i][j] = in.nextInt();

		int[][][] c = new int[2][h][w];
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				c[0][i][j] = a[i][j] - b[i][j];
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				c[1][i][j] = b[i][j] - a[i][j];

		int[][][] dp = new int[2][h][w];
		for (int i = 0; i < h; i++)
			for (int j = 0; j < 2; j++)
				Arrays.fill(dp[2][i], 160 * 160 + 1);
		
		// 0 --> a red b blue
		// 1 --> a blue b red
		dp[0][h - 1][w - 1] = c[0][h - 1][w - 1];
		dp[1][h - 1][w - 1] = c[1][h - 1][w - 1];

		for (int i = h - 1; i >= 0; i--) {
			for (int j = w - 1; j >= 0; j--) {
				if (i != 0) 
					for (int k = 0; k < 2; k++)
						for (int l = 0; l < 2; l++) {
							int put = c[k][i - 1][j] + dp[l][i][j];
							if (abs(put) < abs(dp[k][i - 1][j]))
								dp[k][i - 1][j] = put;
						}
				else if (j != 0)
					for (int k = 0; k < 2; k++)
						for (int l = 0; l < 2; l++) {
							int put = c[k][i][j - 1] + dp[l][i][j];
							if (abs(put) < abs(dp[k][i][j - 1])
								dp[k][i][j - 1] = put;
						}
			}
		}
		
		int ans = dp[0][0][0];
		if (abs(dp[1][0][0]) < abs(ans))
			ans = dp[1][0][0];
		System.out.println(ans);
	}

	int abs(int x) { if (x < 0) return -x; return x; }
}
