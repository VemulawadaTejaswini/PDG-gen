import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();

    final long INF = -1_000_000_000_000_000L;
    long[] dist = new long[N];
    for (int i = 1; i < N; i++) dist[i] = INF;
    int[][] edges = new int[M][2];
    int[] costs = new int[M];

    for (int i = 0; i < M; i++) {
      edges[i] = new int[] {scanner.nextInt() - 1, scanner.nextInt() - 1};
      costs[i] = scanner.nextInt();
    }

    for (int i = 0; i < N - 1; i++) {
      for (int j = 0; j < M; j++) {
        int from = edges[j][0];
        int to = edges[j][1];
        int cost = costs[j];
        if (dist[from] > INF) {
          long newValue = dist[from] + cost;
          if (newValue > dist[to]) dist[to] = newValue;
        }
      }
    }

    boolean[] negative = new boolean[N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        int from = edges[j][0];
        int to = edges[j][1];
        int cost = costs[j];
        if (dist[from] > INF && dist[from] + cost > dist[to]) negative[from] = true;
        if (negative[from]) negative[to] = true;
      }
    }
    if (negative[N - 1]) System.out.println(-1);
    else System.out.println(dist[N - 1]);
  }
}
