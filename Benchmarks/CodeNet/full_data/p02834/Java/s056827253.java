import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class atcoder_ptot implements Runnable{
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new Thread(null,new atcoder_ptot(),"somethreadname",1<<26).start();
	}
	
	public void run() {
		
		atc.init(System.in);
		try {
			int N=atc.nextInt();
			int u=atc.nextInt();
			int v=atc.nextInt();
			u--;
			v--;
			
			atc_graph g=new atc_graph(N);
			
			for(int i=0;i<N-1;i++) {
				int a=atc.nextInt();
				int b=atc.nextInt();
				a--;
				b--;
				g.add_edge(g, a, b);
			}
			
			int[] visited=new int[N];
			int[] dist=new int[N];
			int[] parent=new int[N];
			int[] max_depth=new int[N];
			
			g.BFS(g, v, visited, dist, parent);
			g.DFS(g, max_depth);
			
//			for(int f=0;f<N;f++) {
//				System.out.print(max_depth[f]+" ");
//			}
			
			if(dist[u]==1) {
				System.out.println(0);
			}
			else if(N==2) {
				System.out.println(0);
			}
			else {
				int x=0;
				if(dist[u]%2==1) {
					x=(dist[u]-3)/2;
				}
				else {
					x=(dist[u]-2)/2;
				}
				int vertex=u;
				for(int e=0;e<x;e++) {
					vertex=parent[vertex];
				}
				
				if(dist[u]%2==1) {
					System.out.println(x+max_depth[vertex]+1);
				}
				else {
					System.out.println(x+max_depth[vertex]);
				}
			}
			
			
		}
		catch(IOException ioe) {
			System.out.println("IOException occurred");
		}
		
	}

}

class atc_graph{
	
	int n;
	ArrayList<ArrayList<Integer>> adj;
	
	atc_graph(int V){
		n=V;
		adj=new ArrayList<ArrayList<Integer>>();
		
		for(int p=0;p<n;p++) {
			adj.add(new ArrayList<Integer>());
		}
	}
	
	void add_edge(atc_graph g,int a,int b) {
		g.adj.get(a).add(b);
		g.adj.get(b).add(a);
	}
	
	void BFS(atc_graph g,int s,int[] visited,int[] dist,int[] parent) {
		
		LinkedList<Integer> q=new LinkedList<Integer>();
		
		q.add(s);
		
		visited[s]=1;
		dist[s]=1;
		
		while(!q.isEmpty()) {
			
			int v=q.poll();
			
			for(int w:g.adj.get(v)) {
				
				if(visited[w]==0) {
					
					visited[w]=1;
					dist[w]=dist[v]+1;
					parent[w]=v;
					
					q.add(w);
				
				}	
			}
		}
	}
	
	void DFS(atc_graph g,int[] max_depth) {
		
		/* Depth First Search*/
		
		int inf=-1;				 
		int[] colour=new int[g.n];
		for(int i=0;i<g.n;i++) {
			colour[i]=inf;
		}

		for(int j=0;j<g.n;j++) {
			if(colour[j]==inf) {
				DFS_Visit(g,j,colour,max_depth,0);
			}
		}
	}
	
	int DFS_Visit(atc_graph g,int u,int[] colour,int[] max_depth,int depth) {
		
		int inf=-1;
		colour[u]=1;		 
		int maxi=depth;
		
		for(int v:g.adj.get(u)) {
			if(colour[v]==inf) {
				maxi=Math.max(maxi, DFS_Visit(g,v,colour,max_depth,depth+1));
			}
		}
		
		colour[u]=2;
		max_depth[u]=maxi-depth;
		return maxi;
	}

	
}



/** Class for buffered reading int and double values */
class atc {
	static BufferedReader reader;
	static StringTokenizer tokenizer;

	/** call this method to initialize reader for InputStream */
	static void init(InputStream input) {
		reader = new BufferedReader(new InputStreamReader(input));
		tokenizer = new StringTokenizer("");
	}

	/** get next word */
	static String next() throws IOException {
		while (!tokenizer.hasMoreTokens()) {
			// TODO add check for eof if necessary
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}
	
	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}
}



