import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static long INF = 1L << 60;
	static long[] h = new long [100010];
	static long[] dp = new long [100010];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		for(int i=0;i<n;i++)h[i] = Long.parseLong(sc.next());
		sc.close();
		//初期化(INF)
		Arrays.fill(dp,INF);
		dp[0] = 0;

		for(int i=1;i<n;i++) {
			dp[i]=chmin(dp[i],dp[i-1]+Math.abs(h[i]-h[i-1]));
			if(i>1) {
				dp[i]=chmin(dp[i],dp[i-2]+Math.abs(h[i]-h[i-2]));
			}
		}
		System.out.println(dp[n-1]);

	}
	private static long chmin(long a, long b) {
		if (a < b) { return a; } return b;
	}
}
