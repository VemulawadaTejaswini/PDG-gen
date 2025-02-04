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
			
			String s = br.nextToken();
			String t = br.nextToken();
			
			int N = s.length();
			int M = t.length();
			
			String[][] dp = new String[N+1][M+1];
			
			dp[0][0] = "";
			
			for(int i = 1; i <= N; i++) {
				dp[i][0] = "";
			}
			
			for(int i = 1; i <= M; i++) {
				dp[0][i] = "";	
			}
			
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= M; j++) {
					String s1 = dp[i-1][j];
					String s2 = dp[i][j-1];
					
					
					boolean c = s.charAt(i-1) == t.charAt(j-1);
										
					if(!c) {
						if(s1.length() > s2.length()) {
							dp[i][j] = dp[i-1][j];
						}
						else {
							dp[i][j] = dp[i][j-1];
						}
					}
					else {
						dp[i][j] = dp[i-1][j-1] + s.charAt(i-1);
					}
					

					
				}

			}
			
			pw.println(dp[N][M]);
			
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
 

