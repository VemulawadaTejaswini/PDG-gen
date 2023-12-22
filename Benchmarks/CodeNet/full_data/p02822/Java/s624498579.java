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
    long res = N * modpow(2, M - 2, M) % M;
    for (Node node : nodes) {
      res += (node.adjacent.size() - 1) * modinv(modpow(2, N, M), M) % M;
      if (res >= M) res -= M;
      for (Node c : node.children) {
        res -= modinv(modpow(2, N - c.size, M), M);
        if (res < 0) res += M;
      }
      if (node.parent != null) {
        res -= modinv(modpow(2, node.size, M), M);
        if (res < 0) res += M;
      }
    }
    System.out.println(res);
  }

  private static long modinv(long a, long mod) {
    return modpow(a, mod - 2, mod);
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
