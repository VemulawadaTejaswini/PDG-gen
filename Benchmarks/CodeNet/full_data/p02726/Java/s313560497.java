// A Java program for Dijkstra's single source shortest path algorithm. 
// The program is for adjacency matrix representation of the graph 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

public class Main { 
	// A utility function to find the vertex with minimum distance value, 
	// from the set of vertices not yet included in shortest path tree 
	static int V; 
	int minDistance(int dist[], Boolean sptSet[]) 
	{ 
		// Initialize min value 
		int min = Integer.MAX_VALUE, min_index = -1; 

		for (int v = 0; v < V; v++) 
			if (sptSet[v] == false && dist[v] <= min) { 
				min = dist[v]; 
				min_index = v; 
			} 

		return min_index; 
	} 

	// A utility function to print the constructed distance array 
	void printSolution(int dist[]) 
	{ 
		System.out.println("Vertex \t\t Distance from Source"); 
		for (int i = 0; i < V; i++) 
			System.out.println(i + " \t\t " + dist[i]); 
	} 

	// Function that implements Dijkstra's single source shortest path 
	// algorithm for a graph represented using adjacency matrix 
	// representation 
	int[] dijkstra(int graph[][], int src) 
	{ 
		int dist[] = new int[V]; // The output array. dist[i] will hold 
		// the shortest distance from src to i 

		// sptSet[i] will true if vertex i is included in shortest 
		// path tree or shortest distance from src to i is finalized 
		Boolean sptSet[] = new Boolean[V]; 

		// Initialize all distances as INFINITE and stpSet[] as false 
		for (int i = 0; i < V; i++) { 
			dist[i] = Integer.MAX_VALUE; 
			sptSet[i] = false; 
		} 

		// Distance of source vertex from itself is always 0 
		dist[src] = 0; 

		// Find shortest path for all vertices 
		for (int count = 0; count < V - 1; count++) { 
			// Pick the minimum distance vertex from the set of vertices 
			// not yet processed. u is always equal to src in first 
			// iteration. 
			int u = minDistance(dist, sptSet); 

			// Mark the picked vertex as processed 
			sptSet[u] = true; 

			// Update dist value of the adjacent vertices of the 
			// picked vertex. 
			for (int v = 0; v < V; v++) 

				// Update dist[v] only if is not in sptSet, there is an 
				// edge from u to v, and total weight of path from src to 
				// v through u is smaller than current value of dist[v] 
				if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) 
					dist[v] = dist[u] + graph[u][v]; 
		} 
		return dist;
		// print the constructed distance array 
		//printSolution(dist); 
	} 

	// Driver method 
	public static void main(String[] args) 
	{ 
		/* Let us create the example graph discussed above */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), x = sc.nextInt()-1, y = sc.nextInt()-1;
		V = n;
		int graph[][] = new int[n][n];
		for (int i=0;i<n-1 ;i++ ) {
		    graph[i][i+1] = 1; 
		    graph[i+1][i] = 1; 
		}
		graph[x][y] = 1;
		graph[y][x] = 1;
		Main t = new Main(); 
		int[] ans = new int[n];
		for(int i=0;i<n;i++){
		   int[] dist = t.dijkstra(graph, i);
		   for (int j=i+1;j<n ;j++ ){
		       ans[dist[j]]++;
		   } 
		}
		for (int i=1;i<n ;i++ ){
		    System.out.println(ans[i]);
		} 
	} 
} 
