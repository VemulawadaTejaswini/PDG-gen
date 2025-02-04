import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int q = Integer.parseInt(sc.next());
    Node[] nodes = new Node[n + 1];
    for (int i = 1; i <= n; i++) {
      nodes[i] = new Node(i);
    }
    for (int i = 0; i < n - 1; i++) {
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      nodes[a].addChild(nodes[b]);
    }
    for (int i = 0; i < q; i++) {
      int p = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      nodes[p].addCount(BigInteger.valueOf(x));
    }
    nodes[1].propagateCountToChildren();
    pw.println(
      Arrays.stream(nodes, 1, n + 1)
        .map(node -> String.valueOf(node.count))
        .collect(Collectors.joining(" ")));
  }

  static class Node {

    int id;
    List<Node> children = new ArrayList<>();
    BigInteger count = BigInteger.ZERO;

    public Node(int id) {
      this.id = id;
    }

    void addChild(Node n) {
      children.add(n);
    }

    void addCount(BigInteger x) {
      count = count.add(x);
    }

    void propagateCountToChildren() {
      children.forEach(c -> c.addCount(count));
      children.forEach(Node::propagateCountToChildren);
    }
  }
}
