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
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(br.readLine().trim());
      String s[]=br.readLine().trim().split("\\s+");
      int size=s.length;
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        arr[i]=Integer.parseInt(s[i]);
      
      int dp[] =  new int[size];
      Arrays.fill(dp, -1);
      
      System.out.println(minCost(arr, 0, dp));
      
    }
  
  public static int minCost(int arr[], int pos, int dp[]){
  	if(pos >= arr.length)
      return Integer.MAX_VALUE;
    
     if(pos == arr.length -1)
      return 0;
    
    if(dp[pos] != -1)
      	return dp[pos];
    
    if(pos+1 < arr.length)
      dp[pos] = Math.abs(arr[pos] - arr[pos+1]) + minCost(arr, pos+1,dp);
    
    if(pos+2 < arr.length)
     dp[pos] = Math.min(dp[pos], Math.abs(arr[pos] - arr[pos+2]) + minCost(arr, pos+2,dp));
    
      return dp[pos];
    
  }
}
