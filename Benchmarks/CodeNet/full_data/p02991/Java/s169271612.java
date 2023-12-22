import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node(i);

    int M = scanner.nextInt();
    for (int i = 0; i < M; i++) {
      int u = scanner.nextInt() - 1;
      int v = scanner.nextInt() - 1;
      nodes[u].adjacents.add(nodes[v]);
    }
    int S = scanner.nextInt() - 1;
    int T = scanner.nextInt() - 1;

    int shortest = bfs(N, nodes, S, T);
    System.out.println(shortest >= 0 ? shortest / 3 : -1);
  }

  private static int bfs(int N, Node[] nodes, int s, int t) {
    int[][] dist = new int[N][3];
    boolean[][] visited = new boolean[N][3];
    for (int i = 0; i < N; i++) for (int j = 0; j < 3; j++) dist[i][j] = -1;
    Queue<Pair<Node, Integer>> queue = new LinkedList<>();
    queue.add(new Pair<>(nodes[s], 0));
    dist[s][0] = 0;
    visited[s][0] = true;
    while (!queue.isEmpty()) {
      Pair<Node, Integer> p = queue.poll();
      Node n = p.first;
      int r = p.second;
      int rn = (r + 1) % 3;
      for (Node a : n.adjacents) {
        if (!visited[a.id][rn]) {
          dist[a.id][rn] = dist[n.id][r] + 1;
          visited[a.id][rn] = true;
          queue.add(new Pair<>(a, rn));
        }
      }
    }
    return dist[t][0];
  }

  private static class Node {
    private final int id;
    List<Node> adjacents = new ArrayList<>();
    Node(int id) {
      this.id = id;
    }
  }
  
  private static class Pair<F, S> {
    private final F first;
    private final S second;
    
    public Pair(F f, S s) {
      this.first = f;
      this.second = s;
    }
  }
}
