import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		Arrays.setAll(h, i -> sc.nextInt());
		
		long[] dp = new long[n];
		dp[0] = 0;
		dp[1] = Math.abs(h[1] - h[0]);
		for (int i = 2; i < n; i++) {
			for (int j = 1; j <= k; j++) {
				if (i - k < 0) break;
				dp[i] = Math.max(dp[i], dp[i - k] + Math.abs(h[i - k] - h[i]));
			}
		}
		
		System.out.println(dp[n - 1]);
		
		sc.close();
	}
}

