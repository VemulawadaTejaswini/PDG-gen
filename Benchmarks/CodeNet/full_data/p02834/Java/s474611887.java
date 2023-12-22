import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node();
    int u = scanner.nextInt() - 1;
    int v = scanner.nextInt() - 1;
    for (int i = 0; i < N - 1; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      nodes[a].adjacent.add(nodes[b]);
      nodes[b].adjacent.add(nodes[a]);
    }

    dfs(nodes[v], null);
    List<Node> path = dfs2(nodes[v], null, nodes[u]);
    Collections.reverse(path);
    int max = 0;
    for (int i = path.size() - path.size() / 2; i < path.size(); i++) {
      max = Math.max(max, i + path.get(i).level - 1);
    }
    System.out.println(max);
  }

  private static int dfs(Node node, Node from) {
    int level = -1;
    for (Node a : node.adjacent) {
      if (a != from) {
        level = Math.max(level, dfs(a, node));
      }
    }
    node.level = level + 1;
    return node.level;
  }

  private static List<Node> dfs2(Node node, Node from, Node target) {
    if (node == target) {
      List<Node> list = new ArrayList<>();
      list.add(target);
      return list;
    }
    for (Node a : node.adjacent) {
      if (a != from) {
        List<Node> list = dfs2(a, node, target);
        if (list != null) {
          list.add(node);
          return list;
        }
      }
    }
    return null;
  }

  private static class Node {
    private final List<Node> adjacent = new ArrayList<>();
    private int level;
  }
}
