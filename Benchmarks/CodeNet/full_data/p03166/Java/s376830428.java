import java.util.*;

public class Main{
  public static int dp[];
  public static int dfs(List<Integer>[] g,
  int u)
  {
      if(dp[u]!=-1)
      return dp[u];
      int ans=0;
      for(int child:g[u])
      {
        ans=Math.max(ans,1+dfs(g,child));
      }
      return dp[u]=ans;
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    List<Integer>[] g=
      new ArrayList[n];
    for(int i=0;i<n;i++)
    g[i]=new ArrayList<>();
    for(int i=0;i<m;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      x--; y--;
      g[x].add(y);
    }
    int max=0;
    dp=new int[n];
    for(int i=0;i<n;i++)
    dp[i]=-1;
    for(int i=0;i<n;i++)
    {
        int cnt=dfs(g,i);
        max=Math.max(max,cnt);
    }
    System.out.println(max);
  }
}
    