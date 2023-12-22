import java.util.*;

public class Main{
  public static int dp[][];
  public static int func(char[][] g,int i,int j)
  {
    if(i==g.length-1 && j==g[0].length-1)
    return 1;
    if(i>=g.length || j>=g[0].length || g[i][j]=='#')
    return 0;
    if(dp[i][j]!=-1)
    return dp[i][j];
    dp[i][j]=func(g,i+1,j)%1000000007+func(g,i,j+1)%1000000007;
    return dp[i][j]%1000000007;
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int w=sc.nextInt();
    char g[][]=new char[h][w];
    dp=new int[h+1][w+1];
    String tp=sc.nextLine();
    for(int i=0;i<h;i++)
    {
      String s=sc.nextLine();
      for(int j=0;j<w;j++)
      {
        dp[i][j]=-1;
        g[i][j]=s.charAt(j);
      }
    }
    System.out.println(func(g,0,0));
  }
}
    