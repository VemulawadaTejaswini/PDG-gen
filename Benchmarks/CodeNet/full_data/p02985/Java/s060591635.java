import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static final long M = 1_000_000_007;
  private static long[] fact;
  private static long[] factinv;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();

    fact = new long[K + 1];
    fact[0] = 1;
    for (int i = 1; i <= K; i++) fact[i] = fact[i - 1] * i % M;
    factinv = new long[K + 1];
    factinv[0] = 1;
    for (int i = 1; i <= K; i++) factinv[i] = factinv[i - 1] * inverse(i, M) % M;

    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node(i);
    for (int i = 0; i < N - 1; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      nodes[a].adjacents.add(nodes[b]);
      nodes[b].adjacents.add(nodes[a]);
    }
    System.out.println(dfs(nodes[0], K));
  }

  private static long dfs(Node node, int K) {
    node.visited = true;
    long d = 1;
    int numChildren = 0;
    for (Node n : node.adjacents) {
      if (!n.visited) {
        d *= dfs(n, K);
        d %= M;
        numChildren++;
      }
    }
    if (node.id == 0) {
      d *= perm(K, numChildren + 1);
    } else {
      d *= perm(K - 2, numChildren);
    }
    d %= M;
    return d;
  }

  private static long perm(int n, int k) {
    if (k > n) return 0;
    return fact[n] * factinv[n - k] % M;
  }

  private static class Node {
    final int id;
    boolean visited;
    final List<Node> adjacents = new ArrayList<>();

    private Node(int id) {
      this.id = id;
    }
  }

  private static long inverse(long a, long mod) {
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
}
