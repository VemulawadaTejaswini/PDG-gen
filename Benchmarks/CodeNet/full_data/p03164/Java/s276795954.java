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
		int[] w = new int[N];
		int[] v = new int[N]; 
		int sumVals = 0;
		
		for(int i = 0; i < N; i++) {
			w[i] = fr.nextInt();
			v[i] = fr.nextInt();
			sumVals += v[i];
		}

		
		long[] dp = new long[sumVals+1];
		
		Arrays.fill(dp, (int)1e12);
		dp[0] = 0;
		
		for(int i = 0; i < N; i++) {
			for(int val = sumVals - v[i]; val >= 0; val--) {
				dp[val+v[i]] = Math.min(dp[val+v[i]], dp[val]+w[i]);
			}
		}
		
		int ans = -1;
		
		for(int i = 0; i <= sumVals; i++) {
			if(dp[i] <= W) ans = Math.max(ans, i);
		}
		
		System.out.println(ans);
	}

}
