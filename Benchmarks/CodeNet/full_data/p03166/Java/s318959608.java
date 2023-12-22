import java.util.*;
import java.lang.*;

public class LongestPathDAG{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		final int max_node = 100005;

		int[] dist = new int[max_node]; 
		ArrayList<Integer>[] edges = new ArrayList[max_node];
		int[] in_degree = new int[max_node];
		boolean[] visited = new boolean[max_node];

		for (int i = 0; i < max_node; i++) { 
			edges[i] = new ArrayList<Integer>(); 
		}

	//	System.out.println("Enter "+m+" edges");
		for(int i = 0; i < m ; ++i){
			int x = in.nextInt();
			int y = in.nextInt();
			in_degree[y]++;

			edges[x].add(y);
		}

		LongestPathDAG graph = new LongestPathDAG();

		for(int i =1; i<n; i++){
			if(visited[i] == false && in_degree[i] == 0){
				graph.dfs(i,edges, visited, in_degree, dist);
			}
		}

		int answer = 0;
		for(int i = 1; i < max_node; ++i){
			if(dist[i] > answer){
				answer = dist[i];
			}
		}
		
		System.out.println(answer);


	}

	private void dfs(int node,ArrayList<Integer>[] edges, boolean[] visited, int[] in_degree, int[] dist){
		if(visited[node] == true){
			return;
		}
		visited[node] = true;
		for(int edge : edges[node]){
			in_degree[edge]--;
			dist[edge] = Math.max(dist[edge], dist[node]+1);
			if(in_degree[edge] == 0){
				dfs(edge, edges, visited, in_degree, dist);
			}
		}
	}

}
