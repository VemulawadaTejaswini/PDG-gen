import java.util.*;
import java.io.*;

public class Vacation {
	static BufferedReader br;
	static StringTokenizer tokenizer;

	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = nextInt();
		int[][] arr = new int[n][3];
		int[][] dp = new int[n][3];
		for(int i = 0; i < n; i++) {
			for(int k = 0; k < 3; k++)
				arr[i][k] = nextInt();
		}
		dp[0][0] = arr[0][0];
		dp[0][1] = arr[0][1];
		dp[0][2] = arr[0][2];
		for(int i = 0; i < n - 1; i++) {
			for(int k = 0; k < 3; k++) {
				dp[i + 1][(k + 1) % 3] = Math.max(dp[i + 1][(k + 1) % 3], dp[i][k] + arr[i + 1][(k + 1) % 3]);
				dp[i + 1][(k + 2) % 3] = Math.max(dp[i + 1][(k + 2) % 3], dp[i][k] + arr[i + 1][(k + 2) % 3]);
			}
		}
		System.out.println((int) Math.max(Math.max(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]));
	}

	public static String next() throws IOException {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			String line = br.readLine();
			if (line == null)
				throw new IOException();
			tokenizer = new StringTokenizer(line);
		}
		return tokenizer.nextToken();
	}

	public static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
}
