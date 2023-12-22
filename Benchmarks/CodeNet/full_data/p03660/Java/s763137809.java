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
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      nodes[a].edges.add(nodes[b]);
      nodes[b].edges.add(nodes[a]);
    }

    List<Node> path = findPath(null, nodes[0], nodes[N - 1]);
    Node endWhite = path.get(path.size() / 2 - 1);
    Node endBlack = path.get(path.size() / 2);
    endBlack.edges.remove(endWhite);
    endWhite.edges.remove(endBlack);

    int countBlack = count(null, nodes[0]);
    int countWhite = count(null, nodes[N - 1]);

    if (countBlack > countWhite) {
      System.out.println("Fennec");
    } else {
      System.out.println("Snuke");
    }
  }

  private static List<Node> findPath(Node from, Node node, Node goal) {
    if (node == goal) {
      List<Node> path = new ArrayList<>();
      path.add(node);
      return path;
    }
    for (Node e : node.edges) {
      if (e != from) {
        List<Node> found = findPath(node, e, goal);
        if (found != null) {
          found.add(node);
          return found;
        }
      }
    }
    return null;
  }

  private static int count(Node from, Node node) {
    int count = 1;
    for (Node e : node.edges) if (e != from) count += count(node, e);
    return count;
  }

  static class Node {
    final int id;
    List<Node> edges = new ArrayList<>();

    Node(int id) {
      this.id = id;
    }
  }
}
