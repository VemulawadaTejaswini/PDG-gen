import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Node[] nodes= new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node(i);
    int[] edges = new int[N - 1];
    int[] colors = new int[N - 1];
    Arrays.fill(colors, -1);

    int k = 0;
    for (int i = 0; i < N - 1; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      edges[i] = a ^ b;
      nodes[a].edges.add(i);
      nodes[b].edges.add(i);
      k = Math.max(k, nodes[a].edges.size());
      k = Math.max(k, nodes[b].edges.size());
    }

    dfs(nodes[0], nodes, edges, colors, -1);
    StringBuilder sb = new StringBuilder();
    sb.append(k).append('\n');
    for (int i = 0; i < N - 1; i++) sb.append(colors[i] + 1).append('\n');
    System.out.print(sb.toString());
  }

  private static void dfs(Node node, Node[] nodes, int[] edges, int[] colors, int color) {
    int c = 0;
    for (int e : node.edges) {
      if (colors[e] >= 0) continue;
      if (c == color) c++;
      colors[e] = c;
      dfs(nodes[edges[e] ^ node.id], nodes, edges, colors, c);
      c++;
    }
  }

  private static class Node {
    private final int id;
    private final List<Integer> edges = new ArrayList<>();

    private Node(int id) {
      this.id = id;
    }
  }
}
