import java.util.Scanner;

class AllPairShortestPath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int INF = 9999999;
		int node, path;
		node = sc.nextInt();
		path = sc.nextInt();

		int z, x, c;
		int graph[][] = new int[node][node];

		for (int i = 0; i < node; i++) {
			for (int j = 0; j < node; j++) {
				graph[i][j] = INF;
			}
		}
		for (int i = 0; i < path; i++) {
			z = sc.nextInt();
			x = sc.nextInt();
			c = sc.nextInt();
			z--;
			x--;
			graph[z][x] = c;// ここを消すと有向グラフに
			graph[x][z] = c;// graph[from][to]=distance
		}
		int st, go;
		st = sc.nextInt();
		go = sc.nextInt();
		AllPairShortestPath a = new AllPairShortestPath();
		// graphはグラフデータ
		// stはスタート地点
		// goはゴール地点
		a.floydWarshall(graph, st, go);
	}

	void floydWarshall(int graph[][], int st, int go) {

		int V = graph[0].length;
		int dist[][] = new int[V][V];
		int i, j, k;

		for (i = 0; i < V; i++){
			for (j = 0; j < V; j++){
				dist[i][j] = graph[i][j];
			}}
		for (k = 0; k < V; k++) {

			for (i = 0; i < V; i++) {

				for (j = 0; j < V; j++) {

					if (dist[i][k] + dist[k][j] < dist[i][j]){
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}

		st--;
		go--;
		System.out.println(dist[st][go]);
	}


}