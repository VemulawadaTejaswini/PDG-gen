
/*
USER: caoash3
LANG: JAVA
TASK: 
*/

import java.io.*;
import java.util.*;

public class Main {

	static final boolean stdin = true;
	static final String filename = "";
	static FastScanner br;
	static PrintWriter pw;

	public static void main(String[] args) throws IOException {

		if (stdin) {
			br = new FastScanner();
			pw = new PrintWriter(new OutputStreamWriter(System.out));
		}

		else {
			br = new FastScanner(filename + ".in");
			pw = new PrintWriter(new FileWriter(filename + ".out"));
		}

		X solver = new X();
		solver.solve(br, pw);
	}

	static class X {
		public void solve(FastScanner br, PrintWriter pw) throws IOException {
			long MOD = (long)1e9+7;
			int N = br.nextInt();
			int K = br.nextInt();
			
			int[] in = new int[N];
			
			for(int i = 0; i < N; i++) {
				in[i] = br.nextInt();
			}
			
			long[][] dp = new long[N+1][K+1];
			long[][] pre = new long[N+1][K+1];
			
			
			
			for(int i = 0; i <= in[0]; i++) {
				dp[1][i] = 1;
			}
			
			pre[1][0] = 1;
			
			for(int i = 1; i <= K; i++) {
				pre[1][i] = (pre[1][i-1] + dp[1][i])%MOD;
			}	
			
			for(int i = 2; i <= N; i++) {
				int v = in[i-1];
				for(int j = 0; j <= K; j++) {
					if((j - v-1) >= 0) {
						dp[i][j] = (pre[i-1][j] - pre[i-1][j-v-1]);
					}
					else {
						dp[i][j] = pre[i-1][j];
					}
					
				}
				
				//calc pre sums
				pre[i][0] = dp[i][0];
				for(int j = 1; j <= K; j++) {
					pre[i][j] = (pre[i][j-1] + dp[i][j])%MOD;
				}
			}
			
			pw.println(dp[N][K]%MOD);
			
			pw.close();
		}

	}

	//fastscanner class
	public static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String nextToken() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(nextToken());
		}

		long nextLong() {
			return Long.parseLong(nextToken());
		}

		double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

}
 

