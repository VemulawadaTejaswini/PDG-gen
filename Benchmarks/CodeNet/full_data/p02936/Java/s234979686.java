import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
  static class Node {
    private int index;
    private List<Node> children;
    private long count;
    public Node(int index) {
      this.index = index;
      this.children = new ArrayList<Node>();
      this.count = 0;
    }
    public void addChild(Node node) {
      this.children.add(node);
    }
    public void addCount(int v) {
      this.count += v;
      this.children.forEach(n -> n.addCount(v));
    }
    public long getCount() {
      return this.count;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();
    List<Node> nodes = new ArrayList<Node>();
    for (int i = 1; i <= N; i++)
      nodes.add(new Node(i));
    for (int i = 1; i < N; i++)
      nodes.get(sc.nextInt() - 1).addChild(nodes.get(sc.nextInt() - 1));
    for (int i = 0; i < Q; i++)
      nodes.get(sc.nextInt() - 1).addCount(sc.nextInt());
    System.out.println(nodes.stream().map(n -> String.valueOf(n.getCount())).collect(Collectors.joining(" ")));
  }
}