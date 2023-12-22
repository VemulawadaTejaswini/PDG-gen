
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
			
			long MOD = (long) (1e9+7);
			
			int N = br.nextInt();
			int M = br.nextInt();
			
			boolean[][] grid = new boolean[N][M];
			
			for(int i = 0; i < N; i++) {
				String s = br.nextToken();
				for(int j = 0; j < M; j++) {
					grid[i][j] = (s.charAt(j) == '#');
				}
			}
			
			long[][] dp = new long[N][M];
			
			dp[0][0] = 1;
			
			for(int i = 1; i < N; i++) {
				if(grid[i][0]) {
					dp[i][0] = 0;
					continue;
				}
				dp[i][0] = dp[i-1][0];
			}
			for(int i = 1; i < M; i++) {
				if(grid[0][i]) {
					dp[0][i] = 0;
					continue;
				}
				dp[0][i] = dp[0][i-1];
			}
			
			for(int i = 1; i < N; i++) {
				for(int j = 1; j < M; j++) {
					if(grid[i][j]) {
						dp[i][j] = 0;
						continue;
					}
					dp[i][j] = (long) (dp[i-1][j] + dp[i][j-1]) % MOD;
					
				}
			}
			
			pw.println(dp[N-1][M-1]);
			
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
 

