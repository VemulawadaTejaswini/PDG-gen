import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Map<Integer, List<Edge>> g = new HashMap<>();
    int[] color = new int[N-1];
    int[] a = new int[N-1];
    int[] b = new int[N-1];
    for (int i = 0; i < N-1; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
      Edge e = new Edge(i, a[i], b[i]);
      g.computeIfAbsent(a[i], k -> new ArrayList<>()).add(e);
      g.computeIfAbsent(b[i], k -> new ArrayList<>()).add(e);
    }
    int K = g.values().stream().map(List::size).max(Comparator.comparingInt(a2 -> a2)).get();
    dfs(a[0], -1, -1, g, color);

    System.out.println(K);
    for (int i = 0; i < color.length; i++) {
      System.out.println(color[i]);
    }
  }

  static void dfs(int cur, int usedColor, int parent, Map<Integer, List<Edge>> g, int[] color) {
    List<Edge> edges = g.getOrDefault(cur, Collections.emptyList());
    edges.sort(Comparator.comparingInt(e2 -> e2.color));
    int col = 1;
    for (Edge e : edges) {
      if (e.e1 == parent || e.e2 == parent) {
        continue;
      }
      if (col == usedColor) col++;
      e.color = col++;
      color[e.idx] = e.color;
      int next = e.e1 == cur ? e.e2 : e.e1;
      dfs(next, e.color, cur, g, color);
    }
  }

  static class Edge {
    int idx;
    int e1, e2;
    int color = 0;

    Edge(int idx, int e1, int e2) {
      this.idx = idx;
      this.e1 = e1;
      this.e2 = e2;
    }
  }
}
