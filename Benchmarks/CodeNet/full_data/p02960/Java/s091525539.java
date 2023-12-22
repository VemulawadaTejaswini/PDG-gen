import java.util.Scanner;

public class Main{
	static int mod = 1000000000 + 7;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String S = sc.next();
		int[][] dp = new int[S.length() + 1][13];
		dp[0][0] = 1;

		for(int i = 1; i <= S.length(); i++) {
			char c = S.charAt(i - 1);
			if(c == '?') {
				for(int j = 0; j < 13; j++) {
					for(int k = 0; k < 10; k++) {
						dp[i][(10 * j + k) % 13] += dp[i - 1][j];
						dp[i][(10 * j + k) % 13] %= mod;
					}
				}
			}else {
				int a = c - '0';
				for(int j = 0; j < 13; j++) {
					dp[i][(10 * j + a) % 13] += dp[i - 1][j];
					dp[i][(10 * j + a) % 13] %= mod;
				}
			}
		}
		System.out.println(dp[S.length()][5]);
	}
}