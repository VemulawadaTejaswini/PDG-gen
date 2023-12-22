import java.io.InputStream;
import java.io.PrintStream;
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
    Node[] nodes = new Node[n + 10];
    IntStream.range(0, n).forEach(i -> nodes[i] = new Node(new int[n + 10]));
    for (int i = 0; i < n - 1; i++) {
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      nodes[a - 1].addChild(b - 1);
    }
    for (int i = 0; i < q; i++) {
      int p = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      nodes[p - 1].add(x, nodes);
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
    int numOfChild = 0;
    int[] childNodeIndexes;

    Node(int[] childNodeIndexes) {
      this.childNodeIndexes = childNodeIndexes;
    }

    void addChild(int child) {
      childNodeIndexes[numOfChild] = child;
      numOfChild++;
    }

    void add(int value, Node[] nodes) {
      score += value;
      for (int i = 0; i < numOfChild; i++) {
        nodes[childNodeIndexes[i]].add(value, nodes);
      }
    }
  }
}
