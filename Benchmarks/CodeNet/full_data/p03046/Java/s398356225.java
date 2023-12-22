import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int M = scanner.nextInt();
    int K = scanner.nextInt();
    int[] ans = solve(M, K);
    if (ans == null) {
      System.out.println("-1");
      return;
    }
    StringBuilder sb = new StringBuilder();
    for (int n : ans) sb.append(n).append(' ');
    sb.setLength(sb.length() - 1);
    System.out.println(sb.toString());
  }

  private static int[] solve(int M, int K) {
    if (K >= (1 << M)) return null;
    if (M == 0) {
      if (K == 0) return new int[]{0, 0};
      return null;
    } else if (M == 1) {
      if (K == 0) return new int[]{0, 0, 1, 1};
      return null;
    } else {
      int[] res = new int[1 << (M + 1)];
      int p = 0;
      for (int i = 0; i < (1 << M); i++) {
        if (i != K) {
          res[p++] = i;
        }
      }
      res[p++] = K;
      for (int i = (1 << M) - 1; i >= 0; i--) {
        if (i != K) {
          res[p++] = i;
        }
      }
      res[p] = K;
      return res;
    }
  }
}
