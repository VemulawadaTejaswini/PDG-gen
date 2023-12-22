import java.io.*;
import java.util.*;

class Main {

	private static final int V = 100005;

	private static List<Integer>[] G;
	private static boolean[] visited;
	private static long[] count = new long[2];

	protected static void dfs(int v) {
		if (visited[v]) return;
		visited[v] = true;
		count[v / V]++;
		for (int nv : G[v]) dfs(nv);
	}

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		G = new ArrayList[V * 2];
		for (int i = 0; i < V * 2;
			 i++) {
			G[i] = new ArrayList<>();
		}

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt() + V;
			G[x].add(y);
			G[y].add(x);
		}

		long answer = 0;
		visited = new boolean[V * 2];
		for (int i = 0; i < V * 2; i++) {
			if (visited[i]) continue;
			dfs(i);
			answer += count[0] * count[1];
			count[0] = count[1] = 0;
		}

		System.out.println(answer - N);
	}
}
