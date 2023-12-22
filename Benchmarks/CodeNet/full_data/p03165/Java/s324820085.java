
import java.util.*;
import java.io.*;

public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}

	static void solve() {
		char[] s = in.nextLine().toCharArray();
		char[] t = in.nextLine().toCharArray();
		
		int sl = s.length, tl = t.length;
		
		int[][] dp = new int[sl][tl];
		if(s[0] == t[0]) dp[0][0] = 1;
		for(int i = 1; i < sl; i++)
		{
			dp[i][0] = dp[i - 1][0];
			if(s[i] == t[0]) 
			{
				dp[i][0] = 1;
			}
		}
		for(int i = 1; i < tl; i++)
		{
			dp[0][i] = dp[0][i - 1];
			if(t[i] == s[0])
			{
				dp[0][i] = 1;
			}
		}
		for(int i = 1; i < sl; i++)
		{
			for(int j = 1; j < tl; j++)
			{
				dp[i][j] = Math.max(Math.max(dp[i - 1][j], dp[i][j - 1]), s[i] == t[j]? dp[i - 1][j - 1] + 1: dp[i - 1][j - 1]);
			}
		}

		int i = sl - 1, j = tl - 1;
		String ans = "";
		
		while(true)
		{
			if(i == 0 || j == 0)
			{
				if(s[i] == t[j])
				{
					ans += s[i];
					break;
				}
				if(i == 0 && j == 0) break;
				if(i == 0) j--;
				if(j == 0) i--;
			
			}
			if(dp[i][j] == (s[i] == t[j]? dp[i - 1][j - 1] + 1: dp[i - 1][j - 1]))
			{
				ans += s[i];
				i--;
				j--;
			}
			else if(dp[i - 1][j] == dp[i][j])
			{
				i--;
			}
			else if(dp[i][j - 1] == dp[i][j])
			{
				j--;
			}

			
		}
		System.out.println(new StringBuilder(ans).reverse());
//		System.out.println(dp[sl - 1][tl - 1]);
//		System.out.println(Arrays.deepToString(dp));
	}



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

		int[] readarr(int abc) {
			int[] temp = new int[abc];
			for (int i = 0; i < abc; i++)
				temp[i] = nextInt();
			return temp;
		}
	}
}
