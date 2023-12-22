import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int w=sc.nextInt();
    int[] val=new int[n];
    int[] weights=new int[n];
    for(int i=0;i<n;i++)
    {
      weights[i]=sc.nextInt();
      val[i]=sc.nextInt();
      
    }
    long[][] dp=new long[n+1][w+1];
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=w;j++)
      {
        if(j>=weights[i-1])
        {
          dp[i][j]=Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-weights[i-1]]);
        }
        else
          dp[i][j]=dp[i-1][j];
      }
    }
    System.out.println(dp[n][w]);
  }
}
    