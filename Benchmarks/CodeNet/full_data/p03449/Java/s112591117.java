import java.util.Scanner;

public class Main {
	static int INF = Integer.MAX_VALUE / 2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] adj = new int[2][N];

		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < N; j++) {
				adj[i][j] = sc.nextInt();
			}
		}
		System.out.println(dfs(adj, 0, 0, N));
	}

	static int dfs(int[][] adj, int i, int j, int N) {
		if(i == 1 && j >= N - 1) return adj[i][j];

		if(i == 1 && j < N-1) {
			return adj[i][j] + dfs(adj, i, j+1, N);
		} else if(i==0 && j >= N-1) {
			return adj[i][j] + dfs(adj, i+1, j, N);
		} else {
			return adj[i][j] + Math.max(dfs(adj, i+1, j, N), dfs(adj, i, j+1, N));
		}
	}
}