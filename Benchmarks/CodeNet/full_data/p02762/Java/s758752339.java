import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A, B;

		final int N = scanner.nextInt();

		visited = new boolean[N];
		root = new int[N];
		size = new int[N];
		int[] except = new int[N];
		graph = new ArrayList[N];

		for (int i = 0; i < N; i++) {
			graph[i] = new ArrayList<Integer>();
		}

		final int M = scanner.nextInt();
		final int K = scanner.nextInt();

		for (int i = 0; i < M; i++) {
			A = scanner.nextInt() - 1;
			B = scanner.nextInt() - 1;
			graph[A].add(B);
			graph[B].add(A);
			except[A]++;
			except[B]++;
		}

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				DFS(i, i);
			}
		}

		for (int i = 0; i < K; i++) {
			A = scanner.nextInt() - 1;
			B = scanner.nextInt() - 1;
			if (root[A] == root[B]) {
				except[A]++;
				except[B]++;
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(size[root[i]] - except[i] - 1);
			System.out.print(i == N - 1 ? "\n" : " ");
		}

	}

	static List<Integer>[] graph;
	static boolean[] visited;
	static int[] root;
	static int[] size;

	static void DFS(int rep, int vertex) {
		visited[vertex] = true;
		root[vertex] = rep;
		size[rep]++;
		graph[vertex].forEach(neighbor -> {
			if (!visited[neighbor]) {
				DFS(rep, neighbor);
			}
		});
	}

}
