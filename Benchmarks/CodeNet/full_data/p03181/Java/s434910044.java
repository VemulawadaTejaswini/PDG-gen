import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();

    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node(i);

    for (int i = 0; i < N - 1; i++) {
      int x = scanner.nextInt() - 1;
      int y = scanner.nextInt() - 1;
      nodes[x].adjacent.add(nodes[y]);
      nodes[y].adjacent.add(nodes[x]);
    }

    long[] dp = new long[N];
    dfs1(nodes[0], dp, M);
    for (int i = 0; i < N; i++) nodes[i].visited = false;
    dfs2(nodes[0], 1, dp, M);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) sb.append(dp[i]).append('\n');
    System.out.println(sb.toString());
  }

  private static void dfs2(Node node, long parent, long[] dp, long M) {
    node.visited = true;
    dp[node.id] = parent;
    for (Node a : node.adjacent) {
      if (!a.visited) {
        dp[node.id] *= (dp[a.id] + 1) % M;
        dp[node.id] %= M;
      }
    }
    List<Node> children = node.adjacent.stream().filter(n -> !n.visited).collect(Collectors.toList());
    long[] acc1 = new long[children.size() + 1];
    long[] acc2 = new long[children.size() + 1];
    acc1[0] = 1;
    acc2[children.size()] = 1;
    for (int i = 1; i <= children.size(); i++) {
      acc1[i] = acc1[i - 1] * ((dp[children.get(i - 1).id] + 1) % M);
      acc1[i] %= M;
      acc2[children.size() - i] = acc2[children.size() - i + 1] * ((dp[children.get(children.size() - i).id] + 1) % M);
      acc2[children.size() - i] %= M;
    }
    for (int i = 0; i < children.size(); i++) {
      long a = acc1[i] * acc2[i + 1];
      a %= M;
      a *= parent;
      a %= M;
      a++;
      a %= M;
      dfs2(children.get(i), a, dp, M);
    }
  }

  private static void dfs1(Node node, long[] dp, long M) {
    node.visited = true;
    dp[node.id] = 1;
    for (Node a : node.adjacent) {
      if (!a.visited) {
        dfs1(a, dp, M);
        dp[node.id] *= (dp[a.id] + 1) % M;
        dp[node.id] %= M;
      }
    }
  }

  private static class Node {
    public final int id;
    public boolean visited;
    public List<Node> adjacent = new ArrayList<>();

    private Node(int id) {
      this.id = id;
    }
  }
}
