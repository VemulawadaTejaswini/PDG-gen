import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int W = scan.nextInt();
		
		int arr[][] = new int[N+1][2];
		
		for(int i = 1;i<N+1;i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
		}		
		System.out.println(knapSack(arr, N, W));				
	}

	private static long knapSack(int[][] arr, int N, int W) {
		long dp[][] = new long[N+1][W+1];
		
		for(int w = 0;w<=W;w++) {
			dp[1][w] = 0;
		}
		
		dp[1][arr[1][0]] = arr[1][1];
		
		for(int i =2;i<=N;i++) {
				for(int w =0;w<=W;w++) {
					dp[i][w] = dp[i-1][w];
					if(arr[i][0]>w)
						continue;
					dp[i][w] = Math.max(dp[i][w],arr[i][1]+dp[i-1][w-arr[i][0]]);
				}
		}
		
		
		return dp[N][W];
	}
}
