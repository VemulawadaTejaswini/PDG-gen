

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner in;
	private static String s, t;
	private static long[][] dp;
	private static int n, m;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		s = in.next();
		t = in.next();
		n = s.length();
		m = t.length();
		dp = new long[n+1][m+1];
		
		for(int i=0; i<dp.length; i++) {
			Arrays.fill(dp[i], -1);
		}
//		System.out.println(solve(0, 0));
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				solve(i, j);
			}
		}
		
		int i = 0;
		int j = 0;
		
		while(i!=n && j!=m) {
			if (s.charAt(i)==t.charAt(j)) {
				System.out.print(s.charAt(i));
				i++;
				j++;
			} else {
				if (dp[i][j]==dp[i][j+1]) {
					j++;
				} else {
					i++;
				}
			}
		}

	}
	
	private static long solve(int i, int j) {
		if (i==n || j==m) return 0;
		
		if (dp[i][j]!=-1) return dp[i][j];
		
		if (s.charAt(i)==t.charAt(j)) {
			return dp[i][j]=1+solve(i+1, j+1);
		} else {
			return dp[i][j] = Math.max(solve(i+1, j), solve(i, j+1));
		}
	}

}
