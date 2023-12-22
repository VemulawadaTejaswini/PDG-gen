import java.io.*;
import java.util.*;
public class Main{
	static int n;
	static int[] height;
	public static int solve(){
		int[] dp=new int[n];
		dp[0]=0;
		dp[1]=Math.abs(height[0]-height[1]);
		for(int i=2;i<n;i++){
			dp[i]=Math.min(dp[i-1]+Math.abs(height[i]-height[i-1]),dp[i-2]+Math.abs(height[i]-height[i-2]));
		}
		return dp[n-1];
	}
	public static void main(String[] args) throws IOException{
    	 BufferedReader br = new BufferedReader( 
                              new InputStreamReader(System.in)); 
       
		n=Integer.parseInt(br.readLine()); 
		height=new int[n];
		String[] str=br.readLine().split(" ");
		for(int i=0;i<n;i++){			
		   height[i]=Integer.parseInt(str[i]);		 
		}
		System.out.println(solve());
	
    }
}