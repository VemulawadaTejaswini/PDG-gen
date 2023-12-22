import java.util.Scanner;

public class Main {

	public int minCost(int[] height, int K) {

		int N = height.length;

		if(N<=1) return 0;

		int[] dp = new int[N];

		dp[0] = 0;
		dp[1] = Math.abs(height[1]-height[0]);

		for(int i=2; i<N; i++) {
			int min = Integer.MAX_VALUE;
			for(int j=K; j>=1; j--) {
				if(i-j>=0) {
					min = Math.min(min, dp[i-j]+Math.abs(height[i]-height[i-j]));
				}else {

				}
			}
			dp[i] = min;
		}
		return dp[N-1];
	}

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

		Main obj = new Main();
		int result = obj.minCost(arr, K);
		System.out.println(result);
	}

}
