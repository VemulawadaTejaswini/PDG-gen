import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int P = scanner.nextInt();

    final long INF = 1_000_000_000;
    long[] dist = new long[N];
    Arrays.fill(dist, INF);
    dist[0] = 0;
    int[][] edges = new int[M][2];
    int[] cost = new int[M];
    Node[] forwardNodes = new Node[N];
    Node[] backNodes = new Node[N];
    for (int i = 0; i < N; i++) forwardNodes[i] = new Node();
    for (int i = 0; i < N; i++) backNodes[i] = new Node();
    for (int i = 0; i < M; i++) {
      edges[i][0] = scanner.nextInt() - 1;
      edges[i][1] = scanner.nextInt() - 1;
      cost[i] = -scanner.nextInt() + P;
      forwardNodes[edges[i][0]].adjacent.add(forwardNodes[edges[i][1]]);
      backNodes[edges[i][1]].adjacent.add(backNodes[edges[i][0]]);
    }

    dfs(forwardNodes[0]);
    dfs(backNodes[N - 1]);
    Set<Integer> possiblePath = new HashSet<>();
    for (int i = 0; i < N; i++) if (forwardNodes[i].reachable && backNodes[i].reachable) possiblePath.add(i);

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        int u = edges[j][0];
        int v = edges[j][1];
        long newValue = dist[u] + cost[j];
        if (dist[v] > newValue) dist[v] = newValue;
      }
    }

    for (int i = 0; i < M; i++) {
      int u = edges[i][0];
      int v = edges[i][1];
      if (dist[v] > dist[u] + cost[i] && possiblePath.contains(v)) {
        System.out.println(-1);
        return;
      }
    }

    System.out.println(Math.max(0, -dist[N - 1]));
  }

  private static void dfs(Node node) {
    node.reachable = true;
    for (Node n : node.adjacent) if (!n.reachable) dfs(n);
  }

  private static class Node {
    private boolean reachable;
    private final List<Node> adjacent = new ArrayList<>();
  }
}
