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
    static int max;
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
	    max = 0;
	    int res = 0;
	    boolean[] vis = new boolean[n];
	    for(int i = 0; i < n; i++)
	    {
	    	g1.fun(i, n, vis, 0);
	    	//System.out.println(max);
	    	res = Math.max(res, max);
	    }
		System.out.println(res);
	}
	void fun(int v, int n, boolean[] vis, int count)
    {
    	vis[v] = true;
    	Iterator<Integer> itr = adj[v].iterator();
        while(itr.hasNext())
        {
        	int i = itr.next();
        	count = count+1;
        	if(!vis[i])
        		fun(i, n, vis, count);
        	count = count - 1;  
        }
        if(count > max)
        {
        	max = count;
        }
        //count = count-1;
        vis[v] = false; 
    }
}