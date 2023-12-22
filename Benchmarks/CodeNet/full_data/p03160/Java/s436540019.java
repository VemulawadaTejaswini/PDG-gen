import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n];
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		dp[0] = 0;
		dp[1] = Math.abs(h[0]-h[1]);
		for(int i = 2; i < n; i++) {
			dp[i] =
			Math.min(dp[i-1]+Math.abs(h[i]-h[i-1]), dp[i-2]+Math.abs(h[i]-h[i-2]));
		}
		System.out.println(dp[n-1]);
		sc.close();
	}
}