public class Frog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	    int stoneCount = sc.nextInt();
	    
	    int stones[] = new int[stoneCount];
	    
	    for(int i=0;i<stoneCount; i++) stones[i] = sc.nextInt();
	    
	     int dp[]  = new int[stoneCount + 1];
	     
	     for(int i=0; i<=stoneCount; i++) dp[i] = -1;
	     
	    int minimumIncurred = solve(stones, 0, stoneCount, dp);
	    
	    System.out.println(minimumIncurred);
	    
	    

	}
	
	public static int solve(int stones[], int i, int stoneCount, int dp[])
	{
		
		if(i==stoneCount-1)
			return 0;
		
		if(dp[i] != -1)
			return dp[i];
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		if(i+1<stoneCount) 
		first = Math.abs(stones[i] - stones[i+1])+solve(stones, i+1, stoneCount, dp);
		if(i+2<stoneCount)
		second = Math.abs(stones[i] - stones[i+2])+ solve(stones, i+2, stoneCount, dp);
		dp[i] = Math.min(first, second);
		return Math.min(first, second);	
	}

}
