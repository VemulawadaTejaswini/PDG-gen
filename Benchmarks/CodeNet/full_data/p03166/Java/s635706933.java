import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] x = new int[M];
    int[] y = new int[M];
    for (int i = 0; i < M; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    sc.close();

    int[][] edge = new int[N + 1][N + 1];
    for (int i = 0; i < M; i++) edge[x[i]][y[i]] = y[i];

    int[] memo = new int[N + 1];
    Arrays.fill(memo, -1);

    int ans = 0;
    for (int xi = 1; xi < N + 1; xi++)
      ans = Math.max(ans, count(edge, memo, xi));

    System.out.println(ans);
  }

  private static int count(int[][] edge, int[] memo, int xi) {
    int count = 0;
    int[] dest = edge[xi];
    for (int yi = 1; yi < dest.length; yi++)
      if (dest[yi] != 0) {
        int nxi = dest[yi];
        count = Math.max(count,
            (memo[nxi] != -1 ? memo[nxi] : count(edge, memo, nxi)) + 1);
      }
    memo[xi] = count;
    return count;
  }
}