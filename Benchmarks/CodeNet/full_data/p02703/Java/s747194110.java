import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int S = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node();
    int[] A = new int[M];
    int[] B = new int[M];
    int[] E = new int[M];
    for (int i = 0; i < M; i++) {
      int u = scanner.nextInt() - 1;
      int v = scanner.nextInt() - 1;
      A[i] = scanner.nextInt();
      B[i] = scanner.nextInt();
      nodes[u].edges.add(i);
      nodes[v].edges.add(i);
      E[i] = u ^ v;
    }
    int[] C = new int[N];
    int[] D = new int[N];
    for (int i = 0; i < N; i++) {
      C[i] = scanner.nextInt();
      D[i] = scanner.nextInt();
    }

    long INF = 10_000_000_000_000L;
    int G = 2500;
    long[][] dp = new long[N][G + 1];
    for (int i = 0; i < N; i++) Arrays.fill(dp[i], INF);
    for (int i = 0; i <= S && i <= G; i++) dp[0][i] = 0;
    for (int k = 0; k < N * 2; k++) {
      for (int i = 0; i < N; i++) {
        for (int j = 0; j <= G; j++) {
          if (j >= C[i]) dp[i][j] = Math.min(dp[i][j], dp[i][j - C[i]] + D[i]);
          for (int e : nodes[i].edges) if (j + A[e] <= G) dp[i][j] = Math.min(dp[i][j], dp[E[e] ^ i][j + A[e]] + B[e]);
        }
      }
    }
    for (int i = 1; i < N; i++) {
      long min = INF;
      for (int j = 0; j <= 2500; j++) {
        min = Math.min(min, dp[i][j]);
      }
      System.out.println(min);
    }
  }

  private static class Node {
    private final List<Integer> edges = new ArrayList<>();
  }
}
