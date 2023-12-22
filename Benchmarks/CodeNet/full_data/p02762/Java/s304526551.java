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
		List<Integer>[] brockLists = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			friendLists[i] = new ArrayList<Integer>();
			brockLists[i] = new ArrayList<Integer>();
		}

		int A, B;
		for (int i = 0; i < M; i++) {
			A = scanner.nextInt() - 1;
			B = scanner.nextInt() - 1;
			friendLists[A].add(B);
			friendLists[B].add(A);
		}
		for (int i = 0; i < K; i++) {
			A = scanner.nextInt() - 1;
			B = scanner.nextInt() - 1;
			brockLists[A].add(B);
			brockLists[B].add(A);
		}

		boolean[] visited = new boolean[N];

		List<Integer> group;

		List<Integer>[] groupLists = new ArrayList[N];

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				group = new ArrayList<Integer>();
				DFS(friendLists, i, visited, group);
				for (Integer j : group) {
					groupLists[j] = group;
				}
			}
		}

		int result;
		for (int i = 0; i < N; i++) {
			result = groupLists[i].size() - friendLists[i].size() - 1;
			for (Integer block : brockLists[i]) {
				if (groupLists[i].contains(block))
					result--;
			}
			System.out.print(result + " ");
		}
	}

	static void DFS(List<Integer>[] graph, int vertex, boolean[] visited, List<Integer> reachable) {
		if (!visited[vertex]) {
			visited[vertex] = true;
			reachable.add(vertex);
			graph[vertex].forEach(neighbor -> {
				if (!visited[neighbor]) {
					DFS(graph, neighbor, visited, reachable);
				}
			});
		}
	}

}
