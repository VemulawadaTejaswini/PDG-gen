import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int MOD = 1000000007;

	public void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		long dp[][] = new long[len+1][2];


		//a,bの組の数
		dp[0][0]=1;
		for(int i=0; i<len; i++) {
			//ai+bi=0
			int c=s.charAt(i);
			{
				//遷移先
				if(c == '0') {
					dp[i+1][0] = dp[i][0];
					dp[i+1][1] = dp[i][1];
				}else {
					dp[i+1][1] = dp[i][0] + dp[i][1];
				}
			}
			//ai+bi=1;
			{
				//遷移先
				//ai=1 bi=0とai=0 bi=1の2パターンある
				if(c == '0') {
					dp[i+1][1] += dp[i][1] * 2;
					dp[i+1][1] %= MOD;
				}else {
					dp[i+1][0] += dp[i][0] * 2;
					dp[i+1][0] %= MOD;
					dp[i+1][1] += dp[i][1] * 2;
					dp[i+1][1] %= MOD;
				}
			}
		}
		System.out.println(dp[len][0]+dp[len][1]);
		sc.close();
	}
}
