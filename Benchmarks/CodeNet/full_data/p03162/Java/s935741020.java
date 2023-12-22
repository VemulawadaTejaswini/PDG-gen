import java.util.*;

public class Main{
  public static int dp[][];
  public static int func(int[][] a,int i,int turn)
  {
    if(i==a.length)
    return 0;
    if(dp[i][turn]!=-1)
    return dp[i][turn];
    if(turn==0)
    {
      dp[i][turn]=Math.max(a[i][1]+func(a,i+1,1),
              a[i][2]+func(a,i+1,2));
    }
    else if(turn==1)
    {
      dp[i][turn]=Math.max(a[i][0]+func(a,i+1,0),
              a[i][2]+func(a,i+1,2));
    }
    else
    {
      dp[i][turn]=Math.max(a[i][0]+func(a,i+1,0),
              a[i][1]+func(a,i+1,1));
    }
    return dp[i][turn];
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[][]=new int[n][3];
    dp=new int[n+1][3];
    for(int i=0;i<n;i++)
    {
      a[i][0]=sc.nextInt();
      a[i][1]=sc.nextInt();
      a[i][2]=sc.nextInt();
    }
    int max=0;
    for(int i=0;i<=2;i++)
    {
      for(int k=0;k<=n;k++)
      {
        for(int j=0;j<3;j++)
        dp[k][j]=-1;
      }
      max=Math.max(max,func(a,0,i));
    }
    System.out.println(max);
  }
}
    