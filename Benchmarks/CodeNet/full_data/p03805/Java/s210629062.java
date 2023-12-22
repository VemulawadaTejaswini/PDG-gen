import java.util.Scanner;

public class Main {

	static boolean[] passed;
	static int N;
	static int[][] adj;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		int M = sc.nextInt();
		adj = new int[N][N];
		passed = new boolean[N];

		int a, b;
		for (int i = 0; i < M; i++) {
			a = sc.nextInt() - 1;
			b = sc.nextInt() - 1;
			adj[a][b] = 1;
			adj[b][a] = 1;
		}

		passed[0] = true;
		System.out.println(dfs(0));
	}

	static int dfs(int node) {
		boolean allPassed = true;
		for(int i = 0; i < N; i++) {
			allPassed = allPassed && passed[i];
		}
		if(allPassed) {
			return 1;
		}

		int ret = 0;

		for(int i = 0; i < N; i++) {
			if(adj[node][i] < 1) continue;
			if(passed[i]) continue;

			passed[i] = true;
			ret += dfs(i);
			passed[i] = false;
		}

		return ret;
	}
}