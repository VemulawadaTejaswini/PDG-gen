import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int P = scanner.nextInt();

    final int INF = 1_000_000_000;
    int[] dist = new int[N];
    Arrays.fill(dist, INF);
    dist[0] = 0;
    int[] pred = new int[N];
    Arrays.fill(pred, -1);
    int[][] edges = new int[M][2];
    int[] cost = new int[M];
    for (int i = 0; i < M; i++) {
      edges[i][0] = scanner.nextInt() - 1;
      edges[i][1] = scanner.nextInt() - 1;
      cost[i] = -scanner.nextInt() + P;
    }

    for (int i = 0; i < 2 * N; i++) {
      for (int j = 0; j < M; j++) {
        int u = edges[j][0];
        int v = edges[j][1];
        int newValue = dist[u] + cost[j];
        if (dist[v] > newValue) {
          dist[v] = newValue;
          pred[v] = j;
        }
      }
    }

    int v = N - 1;
    while (true) {
      int e = pred[v];
      if (e == -1) break;
      int u = edges[e][0];
      if (dist[u] + cost[e] < dist[v]) {
        System.out.println(-1);
        return;
      }
      v = u;
    }
    System.out.println(Math.max(0, -dist[N - 1]));
  }
}
