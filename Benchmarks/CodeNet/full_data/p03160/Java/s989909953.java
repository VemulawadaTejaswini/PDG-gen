//greedy is not applicable here as even if select min "diff" at each step then
//also final ans will not be optimal min possible of all answers
//eg: 30 20 50 10 50 70
//greedy: 60
//bruteforce (mainly dp): 40
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
      int ans=0;
      //int dp[][]=new int[][];
      //ans=minRec(a,dp,0,0);
      int dp[]=new int[size];
      dp[n-1]=0;
      dp[n-2]=Math.abs(arr[n-1]-arr[n-2]);
      for(int i=n-3;i>=0;i--)
        dp[i]=Math.min( Math.abs(arr[i]-arr[i+1]), Math.abs(arr[i]-arr[i+2]) );
      System.out.println(dp[0]);
    }
}