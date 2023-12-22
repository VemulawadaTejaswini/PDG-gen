
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer>[] adj;
	static long lazy[];
	public static void dfs(int u,long prev) {
		lazy[u]+=prev;
		for(int to:adj[u])
		{
			dfs(to,lazy[u]);
		}
		
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int q=scan.nextInt();
		adj=new ArrayList[n];
		for(int i=0;i<n;i++)
		{
			adj[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<n-1;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			u--;
			v--;
			adj[u].add(v);
			
		}
		lazy=new long[n];
		
		for(int i=0;i<q;i++)
		{
			int x=scan.nextInt();
			int node=scan.nextInt();
			lazy[x-1]+=node;
			
		}
		dfs(0,0);
		for(int i=0;i<n;i++)
		{
			System.out.println(lazy[i]);
		}
	}
}
