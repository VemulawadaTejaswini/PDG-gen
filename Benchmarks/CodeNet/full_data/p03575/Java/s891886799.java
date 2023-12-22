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
      int[][] g = new int[N][N];
      for (int j = 0; j < N; j++) System.arraycopy(graph[j], 0, g[j], 0, N);
      int a = edges[i][0];
      int b = edges[i][1];
      g[a][b] = 0;
      g[b][a] = 0;

      boolean[] visited = new boolean[N];
      visited[0] = true;
      dfs(g, visited, N, 0);
      for (int j = 0; j < N; j++) {
        if (!visited[j]) {
          count++;
          break;
        }
      }
    }
    System.out.println(count);
  }

  private static void dfs(int[][] graph, boolean[] visited, int N, int i) {
    for (int j = 0; j < N; j++) {
      if (graph[i][j] > 0 && !visited[j]) {
        visited[j] = true;
        dfs(graph, visited, N, j);
      }
    }
  }
}
