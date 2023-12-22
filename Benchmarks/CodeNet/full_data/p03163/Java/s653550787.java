import java.io.*;
import java.util.*;
public class Main{
  	/*public int minRec(int a[],int dp[],int i,int j)
    {
      if(i==n && j==n)
        	return dp[n][n];
      if(
        return Math.min( Math.abs(a[]
    }*/
	public static void main(String args[]) throws IOException{
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
	  int W = sc.nextInt();
      int w[]=new int[n];
      int v[] = new int[n];
      
      for(int i=0; i<n; i++){
         w[i] = sc.nextInt();
         v[i] = sc.nextInt();
      }
      
      int dp[][] =  new int[n][W+1];
      
      for(int i=0;i<n; i++)
      	Arrays.fill(dp[i], -1);
       
      System.out.println(maxSum(w, v, W, 0, dp));
      
    }
  
  public static int maxSum(int wt[], int v[], int W, int pos, int dp[][]){
    
  	if(pos >= wt.length || W == 0)
      return 0;
    
  //  if(prevSelected!=-1 && dp[pos][prevSelected] != Integer.MIN_VALUE)
    //  return dp[pos][prevSelected];
    
    if(dp[pos][W] != -1)
      return dp[pos][W];
    
    
    int sum = 0;
    if(wt[pos] > W)
      return dp[pos][W] = maxSum(wt, v, W, pos+1, dp);
    
    return dp[pos][W] = Math.max(v[pos]+ maxSum(wt, v, W-wt[pos], pos+1, dp), maxSum(wt, v, W, pos+1, dp));
    
  }
}
