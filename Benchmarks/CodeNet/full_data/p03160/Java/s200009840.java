public static void main(String[] args){

		
		if(nums.length == 2){
			return nums[0] - nums[1];
		}
		int[] dp = new int[nums.length];
		dp[0] =  Math.abs(nums[0] - nums[1]);
		dp[1] = Math.abs(nums[0] - nums[2]);
		
		for(int i = 2; i < nums.length; i++){
			dp[i] = Math.min(Math.abs(nums[i-1] - nums[i]) + dp[1], Math.abs(nums[i-2] - nums[i]) + dp[0]);
		}
		
		System.out.println(dp[nums.length -1]);
	
}