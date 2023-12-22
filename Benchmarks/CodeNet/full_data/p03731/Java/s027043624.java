import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long T = sc.nextLong();
		long[] t = new long[n];
		for(int i = 0; i < n; i++) {
			t[i] = sc.nextLong();
		}
		long[] dp = new long[n];
		dp[0] = 0;
		for(int i = 1; i < n; i++) {
			dp[i] = Math.min(dp[i - 1] + T, dp[i - 1] + t[i] - t[i - 1]);
		}
		System.out.println(dp[n - 1] + T);
	}
}