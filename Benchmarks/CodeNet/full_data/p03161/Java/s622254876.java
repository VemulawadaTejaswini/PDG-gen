import java.io.*;
import java.util.*;
public class Main{
	static int n,k;
	static int[] height=new int[100001];
	public static int solve(){
		int[] dp=new int[n];
		dp[0]=0;
		for(int i=1;i<n;i++){
			dp[i]=Integer.MAX_VALUE;
			for(int j=i-1;j>=Math.max(0,i-k);j--){
				dp[i]=Math.min(dp[i],dp[j]+Math.abs(height[i]-height[j]));
			}
			
		}
		return dp[n-1];
	}
	public static void main(String[] args) throws IOException{
    	 BufferedReader br = new BufferedReader( 
                              new InputStreamReader(System.in)); 
        String[] str=br.readLine().split(" ");
		n=Integer.parseInt(str[0]); 
		k=Integer.parseInt(str[1]); 		
		str=br.readLine().split(" ");
		for(int i=0;i<n;i++){			
		   height[i]=Integer.parseInt(str[i]);		 
		}
		System.out.println(solve());
	
    }
}