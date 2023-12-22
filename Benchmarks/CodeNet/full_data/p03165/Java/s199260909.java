import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next(); String t = sc.next();
		String[] S = s.split(""); String[] T = t.split("");
		int n = s.length(); int m = t.length();
		int[][] dp = new int[n+1][m+1];
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++) {
				if(S[i].equals(T[j])) {
					dp[i+1][j+1] = dp[i][j]+1;
				}else {
					dp[i+1][j+1] = Math.max(dp[i+1][j],dp[i][j+1]);
				}
			}
		}
		int i = n-1; int j = m-1;
		while(i >= 0 && j >= 0) {
			if(S[i].equals(T[j])) {
				sb.append(S[i]);
				i--; j--;
			}else {
				if(dp[i+1][j] >= dp[i][j+1]){
					j--;
				}else {
					i--;
				}
			}
		}
		sb.reverse();
		System.out.println(sb.toString());
		//System.out.println(dp[n][m]);
	}
}