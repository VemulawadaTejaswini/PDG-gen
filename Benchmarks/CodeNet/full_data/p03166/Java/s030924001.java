import java.util.*;
import java.io.*;

class Main
{
	int V;
	ArrayList<Integer> adj[];
    longest_path(int V)
    {
        this.V = V;
        adj = new ArrayList[V];
        for(int i = 0; i < V; i++)
        {
            adj[i] = new ArrayList<>();
        }
    }
    void addEdge(int p1, int p2)
    {
        adj[p1].add(p2);
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int e = sc.nextInt();
	    longest_path g1 = new longest_path(n);
	    for(int i = 0; i < e; i++)
	    {
	    	int a = sc.nextInt();
	    	int b = sc.nextInt();
	    	g1.addEdge(a-1, b-1);
	    }
	    boolean[] vis = new boolean[n];
	    int[] dp = new int[n];
	    for(int i = 0; i < n; i++)
	    {
	    	dp[i] = 0;
	    	vis[i] = false;
	    }
	    int res = 0;
	    for(int i = 0; i < n; i++)
	    {
	    	if(!vis[i])
	    	{
	    		res = Math.max(res, g1.dfs(i, dp, vis));
	    	}	
	    }
		System.out.println(res);
	}
	int dfs(int v, int[] dp, boolean[] vis)
    {
    	int ans = 0;
    	vis[v] = true;
    	Iterator<Integer> itr = adj[v].iterator();
        while(itr.hasNext())
        {
        	int i = itr.next();
        	if(!vis[i])
        	{
        		ans = Math.max(ans, dfs(i, dp, vis));
        	}	
        	else
        	{
        		ans = Math.max(ans, dp[i]);
        	}  
        }
        if(adj[v].size() == 0)
        {
        	dp[v] = ans;
        }
        else
        {
        	dp[v] = ans + 1;
        }
        return dp[v];
    }
}