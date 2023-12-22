import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long W = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long dp[][] = new long[(int)H][(int)W];
		dp[0][0] = 1;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(i >= H - A && j < B) continue;
				if(i != 0) {
					dp[i][j] = (dp[i][j] + dp[i - 1][j]) % 1000000007;
				}
				if(j != 0) {
					dp[i][j] = (dp[i][j] + dp[i][j - 1]) % 1000000007;
				}
				//System.out.println("i:" + i + ", j:" + j + ", dp:" + dp[i][j]);
			}
		}
		System.out.println(dp[(int)H - 1][(int)W - 1]);
	}
}
