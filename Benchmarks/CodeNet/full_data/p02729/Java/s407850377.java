import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    sc.close();

    int ans = 0;
    if (N == 1 && M == 1) {
      System.out.println(ans);
      return;
    }

    if (1 < N) ans += combination(N, 2);
    if (1 < M) ans += combination(M, 2);

    System.out.println(ans);
  }

  private static int combination(int n, int k) {
    int closer = Math.min(n - k, k);
    int result = 1;
    for (int i = 1; i <= closer; i++)
      result = result * (n - closer + i) / i;
    return result;
  }
}
