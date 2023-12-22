import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node(i);
    for (int i = 0; i < M; i++) {
      int x = scanner.nextInt() - 1;
      int y = scanner.nextInt() - 1;
      nodes[x].to.add(nodes[y]);
    }

    for (int i = 0; i < N; i++) {
      List<Node> tsort = new ArrayList<>();
      dfs(nodes[i], tsort);

      for (Node node : tsort) for (Node t : node.to) node.len = Math.max(node.len, t.len + 1);
    }
    int max = 0;
    for (int i = 0; i < N; i++) max = Math.max(max, nodes[i].len);
    System.out.println(max);
  }

  private static void dfs(Node n, List<Node> comp) {
    if (n.visited) return;
    for (Node t : n.to) dfs(t, comp);
    n.visited = true;
    comp.add(n);
  }

  private static class Node {
    final int id;
    final List<Node> to = new ArrayList<>();
    boolean visited = false;
    int len = 0;

    private Node(int id) {
      this.id = id;
    }

    @Override public String toString() {
      return Integer.toString(id);
    }
  }
}
