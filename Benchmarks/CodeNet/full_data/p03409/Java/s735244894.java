import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();

    int[][] red = new int[N][2];
    int[][] blue = new int[N][2];

    for (int i = 0; i < N; i++) for (int j = 0; j < 2; j++) red[i][j] = scanner.nextInt();
    for (int i = 0; i < N; i++) for (int j = 0; j < 2; j++) blue[i][j] = scanner.nextInt();

    boolean[][] connectivity = new boolean[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (red[i][0] < blue[j][0] && red[i][1] < blue[j][1]) connectivity[i][j] = true;
      }
    }

    System.out.println(solveFF(N, N, connectivity).length);
  }

  public static int[][] solveFF(int N, int M, boolean[][] connectivity) {
    int NN = N + M + 2;
    int[][] graph = new int[NN][NN];
    for (int i = 0; i < N; i++) graph[0][i + 1] = 1;
    for (int i = 0; i < N; i++)
      for (int j = 0; j < M; j++)
        if (connectivity[i][j]) graph[i + 1][j + N + 1] = 1;
    for (int j = 0; j < M; j++) graph[j + N + 1][NN - 1] = 1;

    int[][] flow = new FordFulkerson().solve(NN, graph, 0, NN - 1);
    List<int[]> pairs = new ArrayList<>();
    for (int i = 0; i < N; i++)
      for (int j = 0; j < M; j++)
        if (flow[i + 1][j + N + 1] > 0) pairs.add(new int[] {i, j});
    return pairs.toArray(new int[pairs.size()][2]);
  }

  private static class FordFulkerson {
    public int[][] solve(int N, int[][] graph, int src, int dst) {
      int[][] flow = new int[N][N];

      int[] path = findPath(N, graph, flow, src, dst);
      while (path != null) {
        int inc = Integer.MAX_VALUE;
        int v = dst;
        while (v != src) {
          int u = path[v];
          int cf = graph[u][v] - flow[u][v];
          if (cf < inc) inc = cf;
          v = u;
        }

        v = dst;
        while (v != src) {
          int u = path[v];
          flow[u][v] += inc;
          flow[v][u] -= inc;
          v = u;
        }

        path = findPath(N, graph, flow, src, dst);
      }

      for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) if (flow[i][j] < 0) flow[i][j] = 0;
      return flow;
    }

    private int[] findPath(int N, int[][] graph, int[][] flow, int src, int dst) {
      Queue<Integer> queue = new LinkedList<>();
      int[] path = new int[N];
      for (int i = 0; i < N; i++) path[i] = -1;
      path[src] = src;
      queue.add(src);
      while (!queue.isEmpty()) {
        int from = queue.poll();
        if (from == dst) {
          return path;
        }
        for (int to = 0; to < N; to++) {
          if (path[to] >= 0) continue;
          if (graph[from][to] - flow[from][to] > 0
              || flow[to][from] > 0) {
            path[to] = from;
            queue.add(to);
          }
        }
      }
      return null;
    }
  }
}
