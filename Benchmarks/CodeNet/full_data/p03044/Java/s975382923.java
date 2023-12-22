import java.util.*;

class Node{
	int ver;
	long wei;

	Node(int ver, long wei){
		this.ver = ver;
		this.wei = wei;
	}
}

public class Main{

	// declaring variables
	static boolean vis[];
	static ArrayList<ArrayList<Node>> adj;
	static int color[];

	public static void dfs(int node, long dis){
		vis[node] = true;
		// odd means 1, even means 0
		if( dis%2 == 0 )
			color[node] = 0;
		else
			color[node] = 1;

		for(Node nd : adj.get(node)){
			if( !vis[nd.ver] ){
				dfs(nd.ver, dis + nd.wei); // passing the edge weight
			}
		}
	}

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		vis = new boolean[n];
		color = new int[n];
		adj = new ArrayList<ArrayList<Node>>();
		for(int i = 0; i < n; i++)
			adj.add(new ArrayList<Node>());
		int u, v;
		long w;
		for(int i = 0; i < n-1; i++){
			u = in.nextInt();
			v = in.nextInt();
			w = in.nextLong();
			u--;
			v--;
			adj.get(v).add(new Node(u, w));
			adj.get(u).add(new Node(v, w));
		}
		dfs(0, 0);
		for(int i = 0; i < n; i++)
			System.out.println(color[i]);
	}
}