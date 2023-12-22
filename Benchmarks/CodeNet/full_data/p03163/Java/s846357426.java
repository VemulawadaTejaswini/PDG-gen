import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
  int n=sc.nextInt();
  int w=sc.nextInt();
  int a[]=new int[n];
  int b[]=new int[n];
  for(int i=0;i<n;i++)
  {
    b[i]=sc.nextInt();

    a[i]=sc.nextInt();

  }
  long dp[][]=new long[n+1][w+1];
  for(int i=1;i<=n;i++)
  {
   for(int j=1;j<=w;j++)
   {
    dp[i][j]=dp[i-1][j];
    if(b[i-1]<=j)
      dp[i][j]=Math.max(dp[i-1][j],a[i-1]+dp[i-1][j-b[i-1]]);
   }
  }
  System.out.println(dp[n][w]);
}
}