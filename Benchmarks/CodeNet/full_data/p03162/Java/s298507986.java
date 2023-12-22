import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
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
		FastReader fr = new FastReader();

		int N = fr.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = fr.nextInt();
			b[i] = fr.nextInt();
			c[i] = fr.nextInt();
		}

		int[][] dp = new int[2 * N][3]; // 3 for 3 activities

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 0) {
					switch (j) {
					case 0:
						dp[i][j] = a[i];
						break;
					case 1:
						dp[i][j] = b[i];
						break;
					case 2:
						dp[i][j] = c[i];
						break;
					}
				} else {
					for (int k = 0; k < 3; k++) {
						if (j == k) {
							/* Do nothing */ } else if (j == 0)
							dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + a[i]);
						else if (j == 1)
							dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + b[i]);
						else 
							dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + c[i]);
					}
				}
			}
		}
		
		int ret = 0;
		
		ret = Math.max(ret, dp[N-1][0]);
		ret = Math.max(ret, dp[N-1][1]);
		ret = Math.max(ret, dp[N-1][2]);
		
		System.out.println(ret);
	}

}
