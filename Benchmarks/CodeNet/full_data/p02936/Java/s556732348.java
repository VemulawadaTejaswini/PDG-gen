import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception
	{
		new Main().run();
	}
	
	node[] nodes;
	
	public void run() throws Exception
	{
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(file.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		nodes = new node[N];
		for(int i = 0;i<N;i++)
			nodes[i] = new node(i);
		for(int i = 0;i<N - 1;i++)
		{
			st = new StringTokenizer(file.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			nodes[a].edges.add(b);
			nodes[b].edges.add(a);
		}
		for(int i = 0;i<M;i++)
		{
			st = new StringTokenizer(file.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken());
			nodes[a].amt+=b;
		}
		dfs(0,-1,0);
		StringBuilder sb = new StringBuilder("");
		for(node n:nodes) {
			sb.append(n.total);
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
	}
	
	public void dfs(int v, int p, long sum)
	{
		nodes[v].total = nodes[v].amt + sum;
		for(int x:nodes[v].edges)
		{
			if(x!=p)
			{
				dfs(x,v,nodes[v].total);
			}
		}
	}
	
	private class node{
		
		ArrayList<Integer> edges;
		int id;
		int amt = 0;
		long total = 0;
		
		public node(int id)
		{
			edges = new ArrayList<Integer>();
		}
		
	}
}
