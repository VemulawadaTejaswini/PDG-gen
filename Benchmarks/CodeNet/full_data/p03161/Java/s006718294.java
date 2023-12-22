import java.util.*;

public class Main{
	void solve(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) h[i] = scan.nextInt();
		int[] dp = new int[n];
		for(int i = 0; i < n; i++) dp[i] = Integer.MAX_VALUE;
		dp[0] = 0;
		dp[1] = Math.abs(h[1] - h[0]);
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= k; j++) {
				if(i - j >= 0) dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i - j] - h[i]));
			}
		}
		System.out.println(dp[n - 1]);
		scan.close();
	}

	public static void main(String[] args){
		new Main().solve();
	}
}
 