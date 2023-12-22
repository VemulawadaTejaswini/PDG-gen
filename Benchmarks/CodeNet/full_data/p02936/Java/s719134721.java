import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  private static class Node {

    public Node(int node) {
      this.node = node;
    }

    int node;

    long value = 0L;

    Set<Node> children = new HashSet<>();
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
    int q = sc.nextInt();

    Map<Integer, Set<Integer>> graph = new HashMap<>();

    for (int i = 1; i <= n; i++) {
      graph.put(i, new HashSet<>());
    }

    for (int i = 0; i < n - 1; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      graph.get(a).add(b);
      graph.get(b).add(a);
    }

    Node root = toTree(graph, 1, 0);
    Map<Integer, Node> nodes = traversal(root);

    for (int i = 0; i < q; i++) {
      int p = sc.nextInt();
      long x = sc.nextInt();
      nodes.get(p).value += x;
    }

    traversal(root, 0);

    List<String> list = new ArrayList<>(n);
    for (int i = 1; i <= n; i++) {
      list.add(String.valueOf(nodes.get(i).value));
    }
    os.println(String.join(" ", list));
  }

  private static Node toTree(Map<Integer, Set<Integer>> graph, int n, int parent) {
    Node node = new Node(n);

    for (int child : graph.get(n)) {
      if (child == parent) continue;
      node.children.add(toTree(graph, child, n));
    }
    return node;
  }

  private static Map<Integer, Node> traversal(Node root) {
    Map<Integer, Node> nodes = new HashMap<>();
    nodes.put(root.node, root);
    for (Node child : root.children) {
      nodes.putAll(traversal(child));
    }
    return nodes;
  }

  private static void traversal(Node root, long inherit) {
    root.value += inherit;
    for (Node child : root.children) {
      traversal(child, root.value);
    }
  }

}
