import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static boolean adj[][];
	static int C = 0;
	static ArrayList<Integer> ans = new ArrayList<>();
	static boolean finish = false;
	static boolean visited[];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//Getting 隣接行列
		int N = scan.nextInt();
		int M = scan.nextInt();
		adj = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			Arrays.fill(adj[i], false);
		}
		int[] A = new int[M];
		int[] B = new int[M];
		for (int i = 0; i < M; i++) {
			A[i] = scan.nextInt();
			B[i] = scan.nextInt();
			adj[A[i] - 1][B[i] - 1] = adj[B[i] - 1][A[i] - 1] = true;
		}

		for (int i = 0; i < M; i++) {
			adj[A[i] - 1][B[i] - 1] = adj[B[i] - 1][A[i] - 1] = false;
			C = 0;
			visited = new boolean[N];
			finish = false;
			Arrays.fill(visited, false);
			visited[0] = true;
			dfs(0, N, visited);
			for (int j = 0; j < N; j++) {
				if (visited[j]) {
					C++;
				}
			}
			ans.add(C);
			adj[A[i] - 1][B[i] - 1] = adj[B[i] - 1][A[i] - 1] = true;
		}

		int count = 0;
		for (Integer i : ans) {
			if (i != N) {
				count++;
			}
		}
		System.out.println(count);
	}


	public static void dfs(int x, int N, boolean[] visited) {

		if (finish) {
			return;
		}
		boolean allvisited = true;

		for (int i = 0; i < N; i++) {
			if (visited[i] == true) {
				allvisited = false;
			}
		}

		if (allvisited) {
			finish = true;
			return;
		}
		//以上全てのノードを回ったかの確認

		//以下DFS本体

		for (int i = 0; i < N; i++) {
			if (adj[x][i] == false)
				continue;
			if (visited[i])
				continue;

			visited[i] = true;
			dfs(i, N, visited);
		}

		return;
	}
}
