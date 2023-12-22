

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
			
			int N = br.nextInt();
			
			int[][] in = new int[N][3];
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < 3; j++) {
					in[i][j] = br.nextInt();
				}
			}
			
			int[][] dp = new int[N][3];
			
			dp[0][0] = in[0][0];
			dp[0][1] = in[0][1];
			dp[0][2] = in[0][2];
			
			for(int i = 1; i < N; i++) {
				for(int j = 0; j < 3; j++) {
					int o1 = (j+1)%3;
					int o2 = (j+2)%3;
					if(i > 1) {
						dp[i][j] = Math.max(dp[i][j], dp[i-2][j]);
					}
					dp[i][j] = Math.max(dp[i-1][o1], Math.max(dp[i-1][o2], dp[i][j])) + in[i][j];
				}
			}
			
			pw.println(Math.max(dp[N-1][0], Math.max(dp[N-1][1], dp[N-1][2])));
			
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
 

