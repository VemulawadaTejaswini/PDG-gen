public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int W = sc.nextInt();
		int[] w = new int[N];
		int[] v = new int[N];
		for(int i=0; i<N; i++){
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		sc.close();
		
		int[][] dp = new int[N+1][W+1];
		int ret = 0;

		for (int i = 0; i < N; i++) {
		    for (int j = 0; j <= W; j++) {
		        dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
		        if (j + w[i] <= W) {
		            dp[i + 1][j + w[i]] = Math.max(dp[i + 1][j + w[i]], dp[i][j] + v[i]);
		            ret = Math.max(ret, dp[i + 1][j + w[i]]);
		        }
		    }
		}
	
		System.out.println(ret);

	}

}