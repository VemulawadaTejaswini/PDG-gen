import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[][] red = new int[N][2];
    int[][] blue = new int[N][2];
    for (int i = 0; i < N; i++) {
      red[i][0] = scanner.nextInt();
      red[i][1] = scanner.nextInt();
    }
    for (int i = 0; i < N; i++) {
      blue[i][0] = scanner.nextInt();
      blue[i][1] = scanner.nextInt();
    }

    List<Edge>[] graph = new List[N * 2 + 2];
    for (int i = 0; i < N * 2 + 2; i++) graph[i] = new ArrayList<>();
    for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) if (red[i][0] < blue[j][0] && red[i][1] < blue[j][1]) addEdge(graph, i + 1, j + N + 1, 1);
    for (int i = 1; i <= N; i++) addEdge(graph, 0, i, 1);
    for (int i = 1; i <= N; i++) addEdge(graph, i + N, N * 2 + 1, 1);
    System.out.println(fordFulkerson(graph, N * 2 + 2));
  }

  private static void addEdge(List<Edge>[] graph, int from, int to, int cap) {
    Edge e1 = new Edge(cap, to);
    Edge e2 = new Edge(0, from);
    e1.rev = e2;
    e2.rev = e1;
    graph[from].add(e1);
    graph[to].add(e2);
  }

  private static int fordFulkerson(List<Edge>[] graph, int N) {
    int flow = 0;
    while (true) {
      boolean[] visited = new boolean[N];
      int d = dfs(graph, visited, 0, N - 1, N);
      if (d == 0) break;
      flow += d;
    }
    return flow;
  }

  private static int dfs(List<Edge>[] graph, boolean[] visited, int s, int t, int f) {
    if (s == t) return f;
    visited[s] = true;
    for (Edge e : graph[s]) {
      if (e.cap > 0 && !visited[e.to]) {
        int d = dfs(graph, visited, e.to, t, Math.min(e.cap, f));
        e.cap -= d;
        e.rev.cap += d;
        if (d > 0) return d;
      }
    }
    return 0;
  }

  private static class Edge {
    private int cap;
    private final int to;
    private Edge rev;

    private Edge(int cap, int to) {
      this.cap = cap;
      this.to = to;
    }
  }
}
