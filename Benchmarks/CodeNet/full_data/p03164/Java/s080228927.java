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
		int W = fr.nextInt(); // upto 10^5
		int[] w = new int[N+1];
		int[] v = new int[N+1]; 
		int sumVals = 0;
		
		for(int i = 1; i <= N; i++) {
			w[i] = fr.nextInt();
			v[i] = fr.nextInt();
			sumVals += v[i];
		}
		
		long[][] dp = new long[N+1][sumVals+1];
		
		for (long[] arr : dp) Arrays.fill(arr, Integer.MAX_VALUE);
		
//		long[] dp = new long[W+1]; // only 1 array. 
//		
//		for (int i = 0; i < N; i++) {
//			for (int j = W; j >= w[i]; j--) {
//				dp[j] = Math.max(dp[j], dp[j-w[i]] + v[i]);
//			}
//		}
		
		
		dp[0][0] = 0;
		
		for(int i = 1; i <= N; i++) {
			for (int j = 0; j <= sumVals; j++) {
				if (v[i] <= j) dp[i][j] = Math.min(dp[i-1][j], w[i]+dp[i-1][j-v[i]]);
				else dp[i][j] = dp[i-1][j];
			}
		}
		for(int i = sumVals; i >= 0; i--) {
			if (dp[N][i] <= W) {
				System.out.println(i);
				break;
			}
		}
	}

}
