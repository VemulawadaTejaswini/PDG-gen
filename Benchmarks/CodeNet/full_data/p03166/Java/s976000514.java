import java.util.*;

public class Main
{
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
	{
		adj.get(u).add(v);
	}
	
	static int dfs(ArrayList<ArrayList<Integer>> adj,int x,boolean visited[],int dp[])
	{
		visited[x]=true;
		dp[x]=0;
		for(int i=0;i<adj.get(x).size();i++)
		{
			if(!visited[adj.get(x).get(i)])
			{
				dp[adj.get(x).get(i)]=dfs(adj,adj.get(x).get(i),visited,dp);
			}
			if(dp[x]<dp[adj.get(x).get(i)]+1)
				dp[x]=dp[adj.get(x).get(i)]+1;
		}
		return dp[x];
	}
	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n;i++)
			adj.add(new ArrayList<Integer>());
		for(int i=0;i<m;i++)
			addEdge(adj,in.nextInt(),in.nextInt());
		boolean visited[]=new boolean[n+1];
		int dp[]=new int[n+1];
		Arrays.fill(visited, false);
		int ans=0;
		for(int i=1;i<=n;i++)
		{
			if(!visited[i])
				dp[i]=dfs(adj,i,visited,dp);
			if(ans<dp[i])
				ans=dp[i];
		}
		System.out.println(ans);
	}
}
