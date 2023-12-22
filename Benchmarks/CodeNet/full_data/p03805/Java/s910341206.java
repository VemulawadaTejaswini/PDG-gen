import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static boolean adj[][];

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

		//Getting 隣接行列
		int N = scan.nextInt();
		int M = scan.nextInt();

		adj = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			Arrays.fill(adj[i], false);
		}

		for (int i = 0; i < M; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			adj[A-1][B-1] = adj[B-1][A-1] = true;
		}

		boolean visited[] = new boolean[N];
		Arrays.fill(visited, false);
		visited[0] = true;

		System.out.println(dfs(0, N, visited));
	}

	public static int dfs(int x, int N, boolean[] visited) {

		boolean allvisited = true;

		for (int i = 0; i < N; i++) {
			if (visited[i] == false) {
				allvisited = false;
			}
		}

		if (allvisited)	return 1;
		//以上全てのノードを回ったかの確認

		//以下DFS本体
		int ret = 0;

		for (int i = 0; i < N; i++) {
			if (adj[x][i] == false) continue;
			if (visited[i]) continue;

			visited[i] = true;
			ret += dfs(i, N, visited);
			visited[i] = false;
		}

		return ret;
	}
}
