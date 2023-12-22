/*package whatever //do not write package name here */

import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), t = sc.next();
		int n = s.length(), m = t.length();
		int[][] dp = new int[n+1][m+1];
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=m;j++){
		        if(s.charAt(i-1)==t.charAt(j-1)){
		            dp[i][j] = dp[i-1][j-1] + 1;
		        }
		        else{
		            dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
		        }
		    }
		}
		StringBuilder s1 = new StringBuilder("");
		int len = dp[n][m];
		int i = n, j = m;
		while(i>0 && j>0){
		    if(s.charAt(i-1)==t.charAt(j-1)){
		        s1.append(s.charAt(i-1));
		        i--;
		        j--;
		    }
		    else if(dp[i-1][j]>dp[i][j-1]){
		        i--;
		    }
		    else{
		        j--;
		    }
		}
		System.out.println(s1.reverse());
	}
}