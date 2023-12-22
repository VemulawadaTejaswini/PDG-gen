
import java.util.Scanner;

public class Main {
	
	static int INF = 100000000;

	public static void main(String[] args) {
		// DPを用いた解法
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []dp = new int [n+1];
		
		for(int i = 0 ; i <= n ;i++) {
			dp[i] = INF;
			}
		
		dp[0] = 0;
		
		for(int i = 0 ;i < n ;i++) {
			for(int pow9 = 1 ; i + pow9 <= n ; pow9 *= 9) {
				dp[i+pow9] = Math.min(dp[i+pow9], dp[i]+1);
			}
			for(int pow6 = 1 ; i + pow6 <= n ;  pow6 *= 6) {
				dp[i+pow6] = Math.min(dp[i+pow6], dp[i]+1);
			}
		}
		
		System.out.println(dp[n]);

		
		
	}

}
