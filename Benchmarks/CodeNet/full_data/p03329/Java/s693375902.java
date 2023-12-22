import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] dp = new long[n+1];
		Arrays.fill(dp, 10000000000l);
		dp[0] = 0;
		for(int i = 1; i <= n; i++) {
			dp[i] = Math.min(dp[i], dp[i-1]+1);
			for(int j = 6; j <= 100000; j*=6) {
				if(i>=j) dp[i] = Math.min(dp[i], dp[i-j]+1);
			}
			for(int j = 9; j <= 100000; j*=9) {
				if(i>=j) dp[i] = Math.min(dp[i], dp[i-j]+1);
			}
		}
		System.out.println(dp[n]);	
	}

}