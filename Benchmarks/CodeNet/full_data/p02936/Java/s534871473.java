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

    Map<Integer, Node> nodes = new HashMap<>();

    for (int i = 1; i <= n; i++) {
      nodes.put(i, new Node(i));
    }

    for (int i = 0; i < n - 1; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      nodes.get(a).children.add(nodes.get(b));
      nodes.get(b).children.add(nodes.get(a));
    }

    Node root = nodes.get(1);

    for (int i = 0; i < q; i++) {
      int p = sc.nextInt();
      long x = sc.nextInt();
      nodes.get(p).value += x;
    }

    traversal(root, null, 0);

    List<String> list = new ArrayList<>(n);
    for (int i = 1; i <= n; i++) {
      list.add(String.valueOf(nodes.get(i).value));
    }
    os.println(String.join(" ", list));
  }

  private static void traversal(Node root, Node parent, long inherit) {
    root.value += inherit;
    for (Node child : root.children) {
      if (child == parent) continue;
      traversal(child, root, root.value);
    }
  }

}
