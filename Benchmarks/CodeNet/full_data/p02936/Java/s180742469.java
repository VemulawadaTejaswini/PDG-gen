import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int Q = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) {
      nodes[i] = new Node();
    }
    for (int i = 0; i < N - 1; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      nodes[a].adjacent.add(nodes[b]);
      nodes[b].adjacent.add(nodes[a]);
    }
    for (int i = 0; i < Q; i++) {
      int p = scanner.nextInt() - 1;
      int x = scanner.nextInt();
      nodes[p].counter += x;
    }
    dfs(nodes[0], null);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      sb.append(nodes[i].counter).append(' ');
    }
    sb.setLength(sb.length() - 1);
    System.out.println(sb.toString());
  }

  private static void dfs(Node node, Node from) {
    if (from != null) node.counter += from.counter;
    for (Node a : node.adjacent) {
      if (a != from) {
        dfs(a, node);
      }
    }
  }

  private static class Node {
    List<Node> adjacent = new ArrayList<>();
    long counter = 0;
  }
}
