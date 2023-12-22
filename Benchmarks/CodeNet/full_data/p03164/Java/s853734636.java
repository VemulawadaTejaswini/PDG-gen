import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	static class Reader {
		BufferedReader br;
		StringTokenizer st;

		public Reader() {
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

	public static void main(String[] args) {
		Reader r = new Reader();

		int n = r.nextInt();
		int w = r.nextInt();
		int[][] items = new int[n][2];
		long[][] dp = new long[w + 1][2];

		for (int i = 0; i < n; i++) {
			items[i][0] = r.nextInt();
			items[i][1] = r.nextInt();
		}

		for (int j = 0; j < n; j++) {
			for (int i = 1; i <= w; i++) {
				dp[i][j % 2] = dp[i][(j + 1) % 2];
				if (items[j][0] <= i) {
					dp[i][j % 2] = Long.max(dp[i][(j + 1) % 2], dp[i - items[j][0]][(j + 1) % 2] + items[j][1]);
				}
			}
		}
		
		
		System.out.println(dp[w][(n - 1) % 2]);
	}
}