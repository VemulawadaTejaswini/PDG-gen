import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Frog1 {

	public int minCost(int[] height) {
		
		int N = height.length;
		
		if(N<=1) return 0;
		
		int[] dp = new int[N+1];

		dp[0] = 0;
		dp[1] = Math.abs(height[1]-height[0]);
		
		for(int i=2; i<N; i++) {
			dp[i] = Math.min(dp[i-2]+Math.abs(height[i]-height[i-2]), dp[i-1]+Math.abs(height[i]-height[i-1]));
		}
		return dp[N-1];
	}
	
	public static void main(String[] args) throws IOException {

		//Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        int N = Integer.parseInt(reader.readLine()); 
		
		int[] heights = new int[N];
		String[] input = reader.readLine().split(" ");
		for (int i = 0; i < input.length; i++) {
			heights[i] = Integer.parseInt(input[i]);
		}
		Frog1 obj = new Frog1();
		int result = obj.minCost(heights);
		System.out.println(result);
	}
}
