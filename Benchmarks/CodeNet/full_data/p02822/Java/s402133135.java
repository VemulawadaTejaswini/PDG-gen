import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node();

    for (int i = 0; i < N - 1; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      nodes[a].adjacent.add(nodes[b]);
      nodes[b].adjacent.add(nodes[a]);
    }
    dfs(nodes[0], null);

    int M = 1_000_000_007;
    long x = 2;
    long y = N;
    for (Node node : nodes) {
      long b = node.adjacent.size() - 1;
      long a = modpow(2, N, M);
      long tx = addd(x, a, M);
      y = addn(x, y, a, b, M);
      x = tx;
      for (Node c : node.children) {
        b = -1;
        a = modpow(2, N - c.size, M);
        tx = addd(x, a, M);
        y = addn(x, y, a, b, M);
        x = tx;
      }
      if (node.parent != null) {
        b = -1;
        a = modpow(2, node.size, M);
        tx = addd(x, a, M);
        y = addn(x, y, a, b, M);
        x = tx;
      }
    }
    System.out.println(y * modpow(x, M - 2, M) % M);
  }

  private static long addd(long x, long a, int M) {
    return a * x % M;
  }

  private static long addn(long x, long y, long a, long b, int M) {
    y = a * y % M;
    y += b * x % M;
    if (y < 0) y += M;
    if (y >= M) y -= M;
    return y;
  }

  private static long modpow(long a, long n, long mod) {
    long res = 1;
    while (n > 0) {
      if (n % 2 == 1) res = (res * a) % mod;
      a = (a * a) % mod;
      n >>= 1;
    }
    return res % mod;
  }

  private static int dfs(Node node, Node parent) {
    node.parent = parent;
    node.size = 1;
    for (Node a : node.adjacent) {
      if (a != parent) {
        node.children.add(a);
        node.size += dfs(a, node);
      }
    }
    return node.size;
  }

  private static class Node {
    private Node parent;
    private int size;
    private List<Node> children = new ArrayList<>();
    private List<Node> adjacent = new ArrayList<>();
  }
}
