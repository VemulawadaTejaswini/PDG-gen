import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		long A = sc.nextLong();
		long B = sc.nextLong();
		/*long dp[] = new long[1000000000];
		dp[0] = 1;
		dp[1] = 2;
		for(int i = 2; i <= K; i++) {
			long temp = (long)(dp[i - 2] / A) * B - ((long)(dp[i - 2] / A) * A);
			dp[i] = Math.max(dp[i - 1] + 1, dp[i - 2] + temp);
			//System.out.println(dp[i]);
		}*/
		
		/*
		long dp[] = new long[3];
		dp[0] = 1;
		dp[1] = 2;
		long temp = (long)(dp[0] / A) * B - ((long)(dp[0] / A) * A);
		dp[2] = Math.max(dp[1] + 1, dp[0] + temp);
		for(int i = 2; i <= K; i++) {
			if(i > 2) {
				dp[0] = dp[1];
				dp[1] = dp[2];
			}
			temp = (long)(dp[0] / A) * B - ((long)(dp[0] / A) * A);
			dp[2] = Math.max(dp[1] + 1, dp[0] + temp);
		}*/
		
		long ans = 1;
		for(int i = 0; i < K; i++) {
				if(ans < A || i == K - 1 || B - A < 2) {
					ans++;
					continue;
				} else {
					//long temp = ans / A;
					ans = ans - A + B;
					//System.out.println(ans);
					i++;
				}
		}
		
		System.out.println(ans);
	}
}
