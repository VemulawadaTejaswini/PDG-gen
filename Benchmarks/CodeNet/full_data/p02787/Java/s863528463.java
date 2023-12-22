import java.util.*;
 
public class Main { 
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[] as = new int[n];
		int[] bs = new int[n];
		for(int i=0; i<n; i++){
			as[i] = sc.nextInt();
			bs[i] = sc.nextInt();
		}
		dp(n, h, as, bs);
	}

	public static void dp(int n, int hp, int[] as, int[] bs){
		long[][] dp = new long[n + 1][(int) hp + 1];
		for(long[] tmp: dp){
			Arrays.fill(tmp, 100_000_000);
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (as[i - 1] < j) {
					dp[i][j] = Math.min(dp[i - 1][j], bs[i - 1] + dp[i - 1][j - as[i - 1]]);
					dp[i][j] = Math.min(dp[i][j], bs[i - 1] + dp[i][j - as[i - 1]]);
				} else {
					dp[i][j] = Math.min(bs[i-1], dp[i-1][j]);
				}
			}
		}
		System.out.println(dp[n][hp]);
	}
}
