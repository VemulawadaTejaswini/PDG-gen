import java.util.*;
import java.io.*;

class frog{
	public static void main(String args[])throws IOException{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	//	Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(read.readLine());
		int[] height = new int[n];
		String[] st = read.readLine().trim().split("\\s+");
		for(int i = 0; i < st.length; i++) height[i] = Integer.parseInt(st[i]);
		int dp[] = new int[n];
	    	if(n == 0)
          {
	    System.out.println(0);
	    return;
	    }
	       if(n == 1)
	    {     	
	    System.out.println(0);
	    return;
	    }
	       if(n == 2)
	         {
	    System.out.println(Math.abs(height[0]-height[1]));
	    return;
		}
		dp[0] = height[0];
		dp[1] = Math.abs(height[0] - height[1]);
		for(int i = 2; i < n; i++){
			dp[i] = Math.min(Math.abs(height[i] - height[i - 1]) + dp[i - 1], Math.abs(height[i] - height[i - 2]) + dp[i - 2]);
		}
		System.out.println(dp[n - 1]); 
}
}