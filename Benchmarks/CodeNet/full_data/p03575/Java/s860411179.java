import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();

    int[][] edges = new int[M][2];
    int[][] graph = new int[N][N];
    for (int i = 0; i < M; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      graph[a][b] = 1;
      graph[b][a] = 1;
      edges[i][0] = a;
      edges[i][1] = b;
    }

    int count = 0;
    for (int i = 0; i < M; i++) {
      int a = edges[i][0];
      int b = edges[i][1];
      graph[a][b] = 0;
      graph[b][a] = 0;

      boolean[] visited = new boolean[N];
      dfs(graph, visited, N, 0);
      boolean bridge = false;
      for (int j = 0; j < N; j++) if (!visited[j]) bridge = true;
      if (bridge) count++;

      graph[a][b] = 1;
      graph[b][a] = 1;
    }
    System.out.println(count);
  }

  private static void dfs(int[][] graph, boolean[] visited, int N, int i) {
    visited[i] = true;
    for (int j = 0; j < N; j++) if (graph[i][j] > 0 && !visited[j]) dfs(graph, visited, N, j);
  }
}
