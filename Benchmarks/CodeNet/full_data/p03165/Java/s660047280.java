import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
	final static long MOD = 1000000007L;
 
	public static void main(String[] args) {
		Reader in = new Reader();
		char[] s1 = in.next().toCharArray();
		char[] s2 = in.next().toCharArray();
		int n = s1.length;
		int m = s2.length;
		int[][] dp = new int[n+1][m+1];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(s1[i]==s2[j]) dp[i+1][j+1] = dp[i][j]+1;
				else dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
			}
		}
		/*
		for(int i = 0; i<=n; i++) {
			for(int j = 0; j<=m; j++)
				System.out.print(dp[i][j]+" ");
			System.out.println();
		}
		*/
		int len = dp[n][m];
		int idx = 0;
		char[] ans = new char[len];
		int i = n; 
		int j = m;
		while(idx<len) {
			if(s1[i-1]==s2[j-1]) {
				ans[idx++] = s1[i-1];
				i--;
				j--;
			}else if(dp[i-1][j]>dp[i][j-1]) i--;
			else j--;
		}
		for(i = ans.length-1; i>=0; i--) System.out.print(ans[i]);
	}
 
	static class Reader {
		static BufferedReader br;
		static StringTokenizer st;
		private int charIdx = 0;
		private String s;
 
		public Reader() {
			this.br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		public int[] na(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		public char nextChar() {
			if (s == null || charIdx >= s.length()) {
				if (st == null || !st.hasMoreTokens())
					try {
						readLine();
					} catch (Exception e) {
					}
				s = st.nextToken();
				charIdx = 0; 
			}
			return s.charAt(charIdx++);
		}
 
		public long[] nl(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
 
		public char[] nca() {
			return next().toCharArray();
		}
 
		public String[] nS(int n) {
			String[] a = new String[n];
			for (int i = 0; i < n; i++)
				a[i] = next();
			return a;
		}
 
		public int nextInt() {
			if (st == null || !st.hasMoreTokens())
				try {
					readLine();
				} catch (Exception e) {
				}
			return Integer.parseInt(st.nextToken());
		}
 
		public double nextDouble() {
			if (st == null || !st.hasMoreTokens())
				try {
					readLine();
				} catch (Exception e) {
				}
			return Double.parseDouble(st.nextToken());
		}
 
		public Long nextLong() {
			if (st == null || !st.hasMoreTokens())
				try {
					readLine();
				} catch (Exception e) {
				}
			return Long.parseLong(st.nextToken());
		}
 
		public String next() {
			if (st == null || !st.hasMoreTokens())
				try {
					readLine();
				} catch (Exception e) {
				}
			return st.nextToken();
		}
 
		public static void readLine() {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
			}
		}
	}
}