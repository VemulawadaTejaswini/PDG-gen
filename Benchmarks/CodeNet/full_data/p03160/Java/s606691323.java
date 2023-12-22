import java.util.Scanner;

public class Main {
	
	private static void solve(int n ,int[] h) {
		
		int[] dp = new int[n];
		dp[1] = Math.abs(h[1]-h[0]);
		
		for (int i=2; i<n; i++) {
			
			dp[i] = Math.min(
						dp[i-1] + Math.abs(h[i] - h[i-1]), 
						dp[i-2] + Math.abs(h[i] - h[i-2])
						);
		}

		System.out.println(dp[n-1]);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] h = new int[n];
		
		for (int i=0; i<n; i++) {
			h[i] = scanner.nextInt();
		}
		
		solve(n, h);
		
		scanner.close();
	}

}
