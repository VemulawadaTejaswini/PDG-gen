import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node(i + 1);
    for (int i = 0; i < N + M - 1; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      nodes[a].to.add(nodes[b]);
      nodes[b].from.add(nodes[a]);
    }

    Node root = findRoot(nodes);
    List<Node> tsort = new ArrayList<>();
    topologySort(root, tsort);
    Collections.reverse(tsort);
    int i = 0;
    for (Node n : tsort) {
      n.position = i;
      i++;
    }
    for (Node n : tsort) {
      if (n.from.size() > 1) {
        Node min = null;
        for (Node p : n.from) {
          if (min == null || min.position < p.position) min = p;
        }
        n.parent = min;
      } else if (n.from.size() == 1) {
        n.parent = n.from.get(0);
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int j = 0; j < N; j++) {
      if (nodes[j].parent == null) sb.append(0).append("\n");
      else sb.append(nodes[j].parent.id).append("\n");
    }
    System.out.println(sb.toString());
  }

  private static Node findRoot(Node[] nodes) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(nodes[0]);
    while (!queue.isEmpty()) {
      Node n = queue.poll();
      if (n.from.isEmpty()) return n;
      queue.addAll(n.from);
    }
    throw new IllegalStateException();
  }

  private static void topologySort(Node n, List<Node> comp) {
    if (n.visited) return;
    for (Node t : n.to) topologySort(t, comp);
    n.visited = true;
    comp.add(n);
  }

  private static class Node {
    final int id;
    final List<Node> to = new ArrayList<>();
    final List<Node> from = new ArrayList<>();
    int position = 0;
    Node parent = null;
    boolean visited = false;

    private Node(int id) {
      this.id = id;
    }
  }
}