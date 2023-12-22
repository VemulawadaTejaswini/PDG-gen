import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] dp = new int[n+1];
		dp[0] = 0;
		for (int i = 0; i < n; i++) {
			dp[i+1] = dp[i];
			if (dp[i]*(dp[i]+1)/2 == i) {
				dp[i+1] = dp[i]+1;
			}
		}
		System.out.println(dp[n]);
	}
}
