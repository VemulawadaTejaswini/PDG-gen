import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		int[] dp = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		Arrays.fill(dp, 100000);
		dp[0] = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= k; j++) {
				if(i+j < n) {
					dp[i+j] = Math.min(dp[i+j], (dp[i] + Math.abs(h[i+j] - h[i])));
				}
			}
		}
		System.out.println(dp[n-1]);
	}
}
