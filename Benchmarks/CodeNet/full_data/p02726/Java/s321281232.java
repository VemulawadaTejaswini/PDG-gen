
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt() - 1;
		int y = sc.nextInt() - 1;

		@SuppressWarnings("unchecked")
		ArrayList<Edge> edges[] = new ArrayList[n];

		for(int i = 0; i < n; i++){
			if(edges[i] == null){
				edges[i] = new ArrayList<Edge>();
			}
		}
		
//		int matrix[][] = new int[n][n];
//		for(int i = 0; i < n; i++){
//			Arrays.fill(matrix[i], INF);
//		}

		for(int i = 0; i < n - 1; i++){
			int from = i;
			int to = i + 1;
			int cost = 1;

//			matrix[from][to] = cost;
//			matrix[to][from] = cost;
			
			edges[from].add( new Edge(to, cost));
			edges[to].add(new Edge(from, cost));
		}
		edges[x].add( new Edge(y, 1));
		edges[y].add(new Edge(x, 1));

//		matrix[x][y] = 1;
//		matrix[y][x] = 1;
//
//		solve(matrix);
		solve(edges, n);
	}

	//	static final int INF = 10_000_001;

	static void solve(ArrayList<Edge>[] edges,  int n){
		int result[] = new int[n + 1];
		
		for(int I = 0; I < n; I++) {
			//xからそれぞれのfarmへの帰り道の最短距離
			int[] dist = dijkstra(edges, I, n);

//			for(int i = 0; i < n; i++){
//				if(dist[i] == INF){
//					System.out.println("INF");
//				}
//				else {
//					System.out.println(dist[i]);
//				}
//			}
			
			for(int i = 0; i < n; i++) {
				result[(int)dist[i]]++;
			}
		}
		
		for(int i = 1; i <= n - 1; i++) {
			System.out.println(result[i]/2);
		}
	}
	
	static void solve(int matrix[][]){
		long[][] dist = warshallFloyd(matrix);

		int n = matrix.length;

		int result[] = new int[n + 1];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(j != 0){
					//					System.out.print(" ");
				}
				//				System.out.print(dist[i][j]);
			}
			//			System.out.println();
		}

		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				result[(int)dist[i][j]]++;
			}
		}

		for(int i = 1; i <= n - 1; i++) {
			System.out.println(result[i]);
		}
	}

	static final int INF = Integer.MAX_VALUE;


	static long[][] warshallFloyd(int[][] matrix){
		int n = matrix.length;

		long[][] dist = new long[n][n];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i == j){
					dist[i][j] = 0;
				}
				else {
					dist[i][j] = matrix[i][j];
				}
			}
		}

		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					if(dist[i][k] == INF || dist[k][j] == INF){
						continue;
					}
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
					//					System.out.println("test "+dist[i][j]);
				}
			}
		}

		return dist;
	}
	//ダイクストラ法
	static int[] dijkstra(ArrayList<Edge>[] edges, int s, int n){
		//			if(n == 1){
		//				return new int[]{0};
		//			}

		PriorityQueue<Distance> que = new PriorityQueue<Distance>();
		int[] dist = new int[n];

		Arrays.fill(dist, INF);
		dist[s] = 0;
		que.add(new Distance(0, s));

		while(!que.isEmpty()){
			Distance tmpDist = que.poll();
			int tmpV = tmpDist.id;

			if(dist[tmpV] < tmpDist.dist){
				continue;
			}
			//				System.out.println(tmpV);
			for(int i = 0; i < edges[tmpV].size() ; i++){
				//					System.out.println(i);
				Edge e = (Edge) edges[tmpV].get(i);
				if(dist[e.to] > dist[tmpV] + e.cost){
					dist[e.to] = dist[tmpV] + e.cost;
					que.add(new Distance(dist[e.to], e.to));
				}
			}
		}

		return dist;
	}
}

class Distance implements Comparable<Distance>{
	int dist;
	int id;

	Distance(int dist, int id){
		this.dist = dist;
		this.id = id;
	}

	@Override
	public int compareTo(Distance d) {
		return this.dist - d.dist;
	}
}

class Edge {
	int to;
	int cost;

	Edge(int to, int cost){
		this.to = to;
		this.cost = cost;
	}
}