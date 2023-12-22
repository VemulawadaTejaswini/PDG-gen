import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node(i);

    for (int i = 0; i < N - 1; i++) {
      int u = scanner.nextInt() - 1;
      int v = scanner.nextInt() - 1;
      int w = scanner.nextInt();
      Edge e = new Edge(u ^ v, w);
      nodes[u].edges.add(e);
      nodes[v].edges.add(e);
    }

    dfs(nodes[0], null, 0, nodes);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      sb.append(nodes[i].color).append('\n');
    }
    System.out.print(sb.toString());
  }

  private static void dfs(Node node, Node from, int color, Node[] nodes) {
    node.color = color;
    for (Edge e : node.edges) {
      Node to = nodes[e.d ^ node.id];
      if (to != from) {
        int c = e.w % 2 == 0 ? node.color : 1 - node.color;
        dfs(to, node, c, nodes);
      }
    }
  }

  private static class Node {
    private final int id;
    private int color;
    List<Edge> edges = new ArrayList<>();

    private Node(int id) {
      this.color = -1;
      this.id = id;
    }
  }

  private static class Edge {
    private final int w;
    private final int d;

    private Edge(int d, int w) {
      this.d = d;
      this.w = w;
    }
  }
}
