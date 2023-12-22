import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    ArrayList<Integer> g[]= new ArrayList[n+1];
    for(int i=0;i<=n;i++)
      g[i]=new ArrayList<Integer>();
    for(int i=0;i<m;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      g[x].add(y);
    }
    boolean vis[]= new boolean[n+1];
    int dp[]=new int[n+1];
    for(int i=1;i<=n;i++)
    {
      if(!vis[i])
        dfs(vis,dp,g,i);
    }
    int max=0;
    for(int i=1;i<=n;i++)
		max=Math.max(max,dp[i]);
    System.out.println(max);
  }
  static void dfs(boolean vis[],int dp[],ArrayList<Integer> g[],int i)
  {
    vis[i]=true;
    for(int j=0;j<g[i].size();j++)
    {
      if(!vis[g[i].get(j)])
        dfs(vis,dp,g,g[i].get(j));
      dp[i]=Math.max(dp[i],1+dp[g[i].get(j)]);
    }
  }
}
      