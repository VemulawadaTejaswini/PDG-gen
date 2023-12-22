import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int N = scanner.nextInt();
		final int M = scanner.nextInt();
		final int K = scanner.nextInt();

		List<Integer>[] friendLists = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			friendLists[i] = new ArrayList<Integer>();
		}

		int A, B;
		for (int i = 0; i < M; i++) {
			A = scanner.nextInt() - 1;
			B = scanner.nextInt() - 1;
			friendLists[A].add(B);
			friendLists[B].add(A);
		}

		boolean[] visited = new boolean[N];

		int[] root = new int[N];
		int[] size = new int[N];

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				DFS(friendLists, i, i, visited, root, size);
			}
		}

		int[] except = new int[N];

		for (int i = 0; i < K; i++) {
			A = scanner.nextInt() - 1;
			B = scanner.nextInt() - 1;
			if (root[A] == root[B]) {
				except[A]++;
				except[B]++;
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(size[root[i]] - friendLists[i].size() - except[i] - 1);
			System.out.print(i == N - 1 ? "\n" : " ");
		}

	}

	static int groupSize;

	static void DFS(List<Integer>[] graph, int rep, int vertex, boolean[] visited, int[] root, int[] size) {
		visited[vertex] = true;
		root[vertex] = rep;
		size[rep]++;
		graph[vertex].forEach(neighbor -> {
			if (!visited[neighbor]) {
				DFS(graph, rep, neighbor, visited, root, size);
			}
		});
	}

}
