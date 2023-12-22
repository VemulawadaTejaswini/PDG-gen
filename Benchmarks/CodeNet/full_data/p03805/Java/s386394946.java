import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int N = scanner.nextInt();
		final int M = scanner.nextInt();
		boolean [][] graph = new boolean [N][N];
		int [] visited = new int[N];
		
		for (int i = 0; i < M; i++) {
			int a = scanner.nextInt()-1;
			int b = scanner.nextInt()-1;
			graph[a][b] = true;
			graph[b][a] = true;			
		}
		System.out.println(paths(graph,0,visited));
		scanner.close();
	}

	private static int paths(boolean[][] graph, int start, int[] visited) {
		int count = 0;
		visited[start] += 1;
		switch (checkPath(visited)) {
		case -1:
			return 0;
		case 1:
			return 1;
		default:
			for (int i = 0; i < graph.length; i++) {
				if (graph[start][i] == true && visited[i] ==0) {
					count += paths(graph, i, Arrays.copyOf(visited, visited.length));
				}
			}
			return count;
		}
	}

	private static int checkPath(int[] visited) {
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] >= 2) {
				return -1;
			} else if (visited[i] == 0) {
				return 0;
			}
		}
		return 1;
	}

}
