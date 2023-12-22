import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int INF = 9999999;
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ele = sc.nextInt();

		int node, path;
		node = n;
		path = m;

		int dist[][] = new int[n][n];
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

		floydWarshall(graph, dist);
		int graph2[][] = new int[node][node];
		int dist2[][] = new int[n][n];
		for (int i = 0; i < node; i++) {
			Arrays.fill(graph2[i], INF);
		}
		for (int i = 0; i < node - 1; i++) {
			for (int o = i + 1; o < node; o++) {
				if (dist[i][o] <= ele) {
					graph2[i][o] = 1;
					graph2[o][i] = 1;
				}
			}
		}
		floydWarshall(graph2, dist2);
		int q = sc.nextInt();
		for (int i = 1; i <= q; i++) {

			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			if (dist2[a][b] >= INF) {
				System.out.println(-1);
			} else {

				System.out.println(dist2[a][b]-1);
			}
		}
	}

	public static void floydWarshall(int graph[][], int dist[][]) {

		int V = graph[0].length;
		int i, j, k;

		for (i = 0; i < V; i++) {
			for (j = 0; j < V; j++) {
				dist[i][j] = graph[i][j];
			}
		}
		for (k = 0; k < V; k++) {

			for (i = 0; i < V; i++) {

				for (j = 0; j < V; j++) {

					if (dist[i][k] + dist[k][j] < dist[i][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}

	}

}