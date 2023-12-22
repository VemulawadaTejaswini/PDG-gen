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
      String st[]=br.readLine().trim().split("\\s+");
      int n=Integer.parseInt(st[0]);
      int k=Integer.parseInt(st[1]);
      String s[]=br.readLine().trim().split("\\s+");
      int size=s.length;
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        arr[i]=Integer.parseInt(s[i]);
      int ans=0;
      //int dp[][]=new int[][];
      //ans=minRec(a,dp,0,0);

      //if define dp[i] as "the minimum total cost to reach nth (i.e. last) stone from ith stone"
      // long dp[]=new long[size];
      // dp[n-1]=0;
      // dp[n-2]=(long)Math.abs((long)arr[n-1]-(long)arr[n-2]);
      // for(int i=n-3;i>=0;i--)
      //   dp[i]=(long)Math.min( dp[i+1]+Math.abs((long)arr[i]-(long)arr[i+1]), dp[i+2]+Math.abs((long)arr[i]-(long)arr[i+2]) );
      // System.out.println(dp[0]);
      //correct


      //if define dp[i] as "the minimum total cost to reach ith stone"
      long dp[]=new long[size];
      dp[0]=0;
      dp[1]=(long)Math.abs((long)arr[1]-(long)arr[0]);
      for(int i=2;i<size;i++)
        dp[i]=Integer.MAX_VALUE;
      for(int i=2;i<n;i++)
        for(int j=i-1;j>=i-k && j>=0;j--)
          dp[i]=(long)Math.min( dp[j]+Math.abs((long)arr[i]-(long)arr[j]), dp[i] );
      System.out.println(dp[n-1]);
      //correct
    }
}