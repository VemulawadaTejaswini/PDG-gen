
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int MOD = 1000000007;
	public void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		long dp[][] = new long[n+1][4];
		dp[0][0]=1;
		for(int i=0; i<n; i++) {
			char c = s.charAt(i);

			if(c=='A'||c=='?') {
				dp[i+1][0] = (dp[i+1][0] + dp[i][0]) % MOD;
				dp[i+1][1] = (dp[i+1][1] + dp[i][1]) % MOD;
				dp[i+1][2] = (dp[i+1][2] + dp[i][2]) % MOD;
				dp[i+1][3] = (dp[i+1][3] + dp[i][3]) % MOD;

				dp[i+1][1] = (dp[i+1][1] + dp[i][0]) % MOD;

			}
			if(c=='B'||c=='?') {
				dp[i+1][0] = (dp[i+1][0] + dp[i][0]) % MOD;
				dp[i+1][1] = (dp[i+1][1] + dp[i][1]) % MOD;
				dp[i+1][2] = (dp[i+1][2] + dp[i][2]) % MOD;
				dp[i+1][3] = (dp[i+1][3] + dp[i][3]) % MOD;

				dp[i+1][2] = (dp[i+1][2] + dp[i][1]) % MOD;
			}
			if(c=='C'||c=='?') {
				dp[i+1][0] = (dp[i+1][0] + dp[i][0]) % MOD;
				dp[i+1][1] = (dp[i+1][1] + dp[i][1]) % MOD;
				dp[i+1][2] = (dp[i+1][2] + dp[i][2]) % MOD;
				dp[i+1][3] = (dp[i+1][3] + dp[i][3]) % MOD;

				dp[i+1][3] = (dp[i+1][3] + dp[i][2]) % MOD;
			}
		}
		System.out.println(dp[n][3]);
		sc.close();
	}


}
