// LCS

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class Main {
	public static void LCS(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int[m+1][n+1];

		for(int i = 0; i <= n; i++)
			dp[0][i] = 0;
		for(int i = 0; i <= m; i++)
			dp[i][0] = 0;

		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= n; j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1))
					dp[i][j] = 1+dp[i-1][j-1];
				else
					dp[i][j] = max(dp[i-1][j], dp[i][j-1]);
			}
		}
		

		String result = "";
		int i, j;
		i = m;
		j = n;
		while(i > 0 && j > 0) {
			if(s1.charAt(i-1) == s2.charAt(j-1)) {
				result = s1.charAt(i-1) + result;
				i -= 1;
				j -= 1;
			}
			else {
				if(dp[i-1][j] > dp[i][j-1])
					i -= 1;
				else
					j -= 1;
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();

		LCS(s1, s2);

	}

	public static int max(int...arr) {
		int max = Integer.MIN_VALUE;
		for(int i: arr) {
			if(i > max)
				max = i;
		}
		return max;
	}
}
