import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long dp[][] = new long[65][3];
		dp[0][0] = 1;
		long MOD = 1000000007;
		for(int i=0; i<64; i++) {
			long d = (n>>(63-i))&1;
			if(d==1) {
				dp[i+1][0] += dp[i][0]; //(1,0)(0,1)
				dp[i+1][1] += dp[i][0] + dp[i][1]; //(0,0), (1,1)
				dp[i+1][2] += 2 * dp[i][1] + 3 * dp[i][2]; //(0,0)(1,0)(0,1), (0,0)(1,0)(0,1)(1,1)
			}else {
				dp[i+1][0] += dp[i][0] + dp[i][1]; //(0,0),(1,1)
				dp[i+1][1] += dp[i][1]; //(1,1)
				dp[i+1][2] += dp[i][1] + 3 * dp[i][2];//(0,0), (0,0)(1,0)(0,1)(1,1)
			}
			dp[i+1][0] %= MOD;
			dp[i+1][1] %= MOD;
			dp[i+1][2] %= MOD;
		}
		long ans = dp[64][0] + dp[64][1] + dp[64][2];
		ans %= MOD;
		System.out.println(ans);
		sc.close();
	}

}
