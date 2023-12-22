import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static int MAX_GEN_ASCENDANTS = 20;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int Q = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node(i);
    List<ColorChange>[] colors = new List[N];
    for (int i = 0; i < N; i++) colors[i] = new ArrayList<>();

    for (int i = 0; i < N - 1; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      int c = scanner.nextInt();
      int d = scanner.nextInt();
      nodes[a].edges.add(new Edge(c, d, nodes[b]));
      nodes[b].edges.add(new Edge(c, d, nodes[a]));
    }

    dfs(nodes[0], null, 0, 0, 0, colors);

    for (int i = 1; i < MAX_GEN_ASCENDANTS; i++)
      for (int j = 0; j < N; j++)
          if (nodes[j].ascendants[i - 1] != null)
              nodes[j].ascendants[i] = nodes[nodes[j].ascendants[i - 1].id].ascendants[i - 1];

    for (int i = 0; i < N; i++) {
      for (int j = 1; j < colors[i].size(); j++) {
        ColorChange prev = colors[i].get(j - 1);
        ColorChange next = colors[i].get(j);
        next.num += prev.num;
        next.dist += prev.dist;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < Q; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      int u = scanner.nextInt() - 1;
      int v = scanner.nextInt() - 1;
      Node lca = lca(nodes[u], nodes[v]);
      List<ColorChange> c = colors[x];
      sb.append(dist(nodes[u], c, y) + dist(nodes[v], c, y) - 2 * dist(lca, c, y)).append('\n');
    }
    System.out.print(sb.toString());
  }

  private static long dist(Node node, List<ColorChange> changes, int newLen) {
    long d = node.dist;
    ColorChange c = upperBound(changes, node.order);
    if (c != null) {
      d += (long) c.num * newLen - c.dist;
    }
    return d;
  }

  private static ColorChange upperBound(List<ColorChange> a, int k) {
    int left = -1;
    int right = a.size();
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (a.get(mid).pos <= k) {
        left = mid;
      } else {
        right = mid;
      }
    }
    if (left < 0) return null;
    return a.get(left);
  }

  private static Node lca(Node u, Node v) {
    if (u.depth > v.depth) return lca(v, u);
    for (int i = 0; i < MAX_GEN_ASCENDANTS; i++) {
      int diff = v.depth - u.depth;
      if ((diff & (1 << i)) != 0) {
        v = v.ascendants[i];
      }
    }
    if (u == v) return u;
    for (int i = MAX_GEN_ASCENDANTS - 1; i >= 0; i--) {
      if (u.ascendants[i] != v.ascendants[i]) {
        u = u.ascendants[i];
        v = v.ascendants[i];
      }
    }
    return u.ascendants[0];
  }

  private static int dfs(Node node, Node parent, int order, int depth, int dist, List<ColorChange>[] colors) {
    node.ascendants[0] = parent;
    node.order = order;
    node.depth = depth;
    node.dist = dist;
    for (Edge e : node.edges) {
      if (e.to != parent) {
        order++;
        colors[e.color].add(new ColorChange(order, 1, e.length));
        order = dfs(e.to, node, order, depth + 1, dist + e.length, colors);
        colors[e.color].add(new ColorChange(order + 1, -1, -e.length));
      }
    }
    return order;
  }

  private static class Node {
    final int id;
    int order;
    int depth;
    int dist;
    List<Edge> edges = new ArrayList<>();
    Node[] ascendants = new Node[MAX_GEN_ASCENDANTS];

    private Node(int id) {
      this.id = id;
    }
  }

  private static class Edge {
    final int color;
    final int length;
    final Node to;

    private Edge(int color, int length, Node to) {
      this.color = color;
      this.length = length;
      this.to = to;
    }
  }

  private static class ColorChange {
    final int pos;
    int dist;
    int num;

    private ColorChange(int pos, int num, int dist) {
      this.pos = pos;
      this.num = num;
      this.dist = dist;
    }
  }
}
