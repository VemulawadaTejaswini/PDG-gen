import java.util.Scanner;

public class Main {
	
	private static void solve(int n, int w, int[][] items) {
		
		long[][] dp = new long[n+1][w+1];
		for (int i=0; i<n+1; i++) {
			for (int j=0; j<w+1; j++) {
				dp[i][j] = -1;
			}
		}
		
		solve(dp, items, n, w);
		
		System.out.println(dp[n][w]);
	}
	
	private static long solve(long[][] dp, int[][] items, int limit, int capacity) {
				
		if (limit <= 0 || capacity <= 0) {
			return 0;
		}
	
		if (dp[limit][capacity] != -1) {
			return dp[limit][capacity];
		}
		
		long included = 0, excluded = 0;
		
		if (limit > 0) {
			excluded = solve(dp, items, limit-1, capacity);
			
			if (capacity-items[limit-1][0] >= 0) {
				included = items[limit-1][1] + solve(dp, items, limit-1, capacity-items[limit-1][0]);
			}
		}
		
		dp[limit][capacity] = Math.max( included, excluded);	
		
		return dp[limit][capacity];
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int w = scanner.nextInt();
		
		int[][] items = new int[n][2];
		for (int i=0; i<n; i++) {
			for (int j=0; j<2; j++) {
				items[i][j] = scanner.nextInt();
			}
		}
			
		solve(n, w,items);
		
		scanner.close();
	}

}
 