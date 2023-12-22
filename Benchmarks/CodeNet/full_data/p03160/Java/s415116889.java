import java.util.*;
public class Main{
 	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
     	int n = s.nextInt();
      	int [] h = new int[n];
      for(int i =0;i<n;i++){
      	h[i]=s.nextInt();
      }
      int [] dp = new int [n+1];
      
      Arrays.fill(Integer.MAX_VALUE);
      dp[1]=0;
      
      for(int i =0; 
      for(int i =2;i<=n;i++){
        dp[i]=Math.min(dp[i-1]+Math.abs(h[i]-h[i-1],dp[i]);
        dp[i]=Math.min(dp[i-2]+Math.abs(h[i]-h[i-2],dp[i]);               
    }
                       return dp[n];
 
 }  