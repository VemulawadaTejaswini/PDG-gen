import java.io.BufferedReader;

import java.lang.Math;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

public class Main{
	static int[] v;
	static int[] w;
	static long dp[][];
	public static void main (String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int c = sc.nextInt();
		dp = new long[n+1][c+1];
		for(int i = 0 ; i < n+1 ; i ++)
			for(int j = 0 ; j < c+1 ; j ++)
				dp[i][j]--;

		v = new int[n]; w = new int[n];
		for(int i = 0 ; i < n ; i++) {
			w[i] = sc.nextInt();v[i]=sc.nextInt();
		}
			pw.println((long)dp(0,c,n));
			pw.close();
		}
	static long dp(int idx , int c , int n) {
		if(idx == n)
			return 0;
		if(dp[idx][c]!=-1)
			return dp[idx][c];
		if(c<w[idx])
			return dp[idx][c] = (long)dp(idx+1,c,n);
		long take = v[idx]+ dp(idx+1,c-w[idx],n);
		long leave = dp(idx+1 , c , n);
		return dp[idx][c] = Math.max(take,leave);
	}
		
	}

	


	
	
	
	
	 class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	 }
	