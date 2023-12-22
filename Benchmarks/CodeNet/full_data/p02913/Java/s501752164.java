import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  static class Node {
    Map<Character, Node> children = new HashMap<>();
    int min;
    int max;

    Node(int min) {
      this.min = min;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    ArrayList<Node> nodes = new ArrayList<>(N);
    Node root = new Node(0);
    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      nodes.add(root);

      ArrayList<Node> next = new ArrayList<>(N);
      for (Node node : nodes) {
        int tmp = i;
        Node child = node.children.computeIfAbsent(c, u -> new Node(tmp));
        child.max = i;
        next.add(child);
      }
      nodes = next;
    }

    System.out.println(max(root, 0));
  }

  public static int max(Node node, int depth) {
    if (node.max - node.min < depth) {
      return 0;
    }
    IntStream stream = node.children.values().stream().mapToInt(child -> max(child, depth + 1));
    return IntStream.concat(stream, IntStream.of(depth)).max().getAsInt();
  }
}
