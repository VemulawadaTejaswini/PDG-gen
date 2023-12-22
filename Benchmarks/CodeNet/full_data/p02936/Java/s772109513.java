import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int q = Integer.parseInt(sc.next());
    Node[] nodes = new Node[n];
    IntStream.range(0, n).forEach(i -> nodes[i] = new Node());
    for (int i = 0; i < n - 1; i++) {
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      nodes[a - 1].children.add(nodes[b - 1]);
    }
    for (int i = 0; i < q; i++) {
      int p = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      nodes[p - 1].add(x);
    }
    for (int i = 0; i < n; i++) {
      pw.print(nodes[i].score);
      if (i != n - 1) {
        pw.print(" ");
      }
    }
  }

  static class Node {

    long score = 0;
    List<Node> children = new ArrayList<>();

    void add(int value) {
      score += value;
      children.forEach(child -> child.add(value));
    }

  }
}
