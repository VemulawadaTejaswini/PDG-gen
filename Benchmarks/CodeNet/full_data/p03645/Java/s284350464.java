import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int M = scn.nextInt();
    boolean[][] graph = new boolean[N][N];
    for (boolean[] g : graph) {
      Arrays.fill(g, false);
    }

    for (int i = 0; i < M; i++) {
      int a = scn.nextInt() - 1;
      int b = scn.nextInt() - 1;

      graph[a][b] = true;
      graph[b][a] = true;
    }

    boolean[] arrived = new boolean[N];
    Arrays.fill(arrived, false);
    arrived[0] = true;

    System.out.println(dfs(graph, N, 2, 0));

  }

  public static boolean dfs(boolean[][] graph, int N, int rest, int now) {
    System.out.println(now);
    if (now == N - 1) {
      return true;

    }
    if (rest == 0) {
      return false;
    }

    for (int i = 0; i < N; i++) {
      if (graph[now][i]) {
        boolean found = dfs(graph, N, rest - 1, i);
        if (found) {
          return true;
        }
      }
    }
    return false;

  }
}