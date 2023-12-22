import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static int n = scanner.nextInt();
	static int m = scanner.nextInt();
	static boolean[][] graph = new boolean[60][60];
	static boolean[] visited = new boolean[n];
	static int verSize = n;

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		int a[] = new int[m];
		int b[] = new int[m];

		for (int i = 0; i < m; i++) {
			a[i] = scanner.nextInt() - 1;
			b[i] = scanner.nextInt() - 1;
		}

		for (int i = 0; i < m; i++) {
			graph[a[i]][b[i]] = true;
			graph[b[i]][a[i]] = true;
		}

		int count = 0;
		for (int i = 0; i < m; i++) {
			graph[a[i]][b[i]] = false;
			graph[b[i]][a[i]] = false;
			dfs(0);

			for (int j = 0; j < visited.length; j++) {
				if (!visited[j]) {
					count++;
					break;
				}
			}
			graph[a[i]][b[i]] = true;
			graph[b[i]][a[i]] = true;
			initVisited();
		}

		System.out.println(count);

	}

	public static void dfs(int vertex) {
		if (visited[vertex]) {
			return;
		} else {
			visited[vertex] = true;
		}
		for (int i = 0; i < verSize; i++) {
			if (graph[vertex][i]) {
				dfs(i);
			}
		}
	}

	public static void initVisited() {
		for (int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}
	}
}
