public static int Main(int n,int[] height){
		
		int result=0;
		//height[n]=0;height[n+1]=0;
		int[] dp=new int[n+2];
		result=getCost(0,height,dp,n);
		
		return result;
	}

	private static int getCost(int i, int[] height, int[] dp, int n) {

		if (i >= n - 1)
			return dp[i] = 0;

		if (dp[i] == 0) {
			dp[i] = Math.min(
					Math.abs(height[i] - height[i + 1])
							+ getCost(i + 1, height, dp, n),
					Math.abs(height[i] - height[i + 2])
							+ getCost(i + 2, height, dp, n));
		}

		return dp[i];
	}