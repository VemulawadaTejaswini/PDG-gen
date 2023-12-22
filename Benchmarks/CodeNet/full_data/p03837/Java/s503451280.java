import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ABC051DSolve solve = new ABC051DSolve();
		solve.main();
	}
}

class ABC051DSolve {
	
	int N;
	int M;
	int[][] adj;
	
	ABC051DSolve() {
		Scanner cin = new Scanner(System.in);
		this.N = cin.nextInt();
		this.M = cin.nextInt();
		this.adj = new int[N][N];
		for (int i = 0; i < M; i++) {
			int a = cin.nextInt() - 1;
			int b = cin.nextInt() - 1;
			int c = cin.nextInt();
			adj[a][b] = c;
			adj[b][a] = c;
		}
	}
	
	void main() {
		int INF = Integer.MAX_VALUE / 2;
		int[][] dist = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				dist[i][j] = INF;
				if (adj[i][j] > 0) {
					dist[i][j] = adj[i][j];
					dist[j][i] = adj[i][j];
				}
			}
			dist[i][i] = 0;
		}
		
		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
		
		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (dist[i][j] < adj[i][j]) {
					count++;
				}
			}
		}
		System.out.println(count / 2);
	}
	
}
