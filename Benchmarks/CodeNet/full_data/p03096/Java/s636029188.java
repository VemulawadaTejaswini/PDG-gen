import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] dp = new long[N+1];
		int[] last = new int[200001];
		dp[0] = 1;
		for(int i = 1; i <= N; i++) {
			int c = sc.nextInt();
			dp[i] = dp[i-1];
			if(last[c] != 0 && last[c] < i - 1)
				dp[i] += dp[last[c]];
			last[c] = i;
			dp[i] %= 1_000_000_007;
		}
		System.out.println(dp[N]);
	}

}