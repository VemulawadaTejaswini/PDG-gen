import java.util.Scanner;

import java.lang.Math;

public class Main {
  private static int gcd(int x, int y) {
    if (x == 0)
      return y;
    return gcd(y % x, x);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++)
      A[i] = scanner.nextInt();

    int[] pre = new int[N];
    pre[0] = A[0];
    for (int i = 1; i < N; i++)
      pre[i] = gcd(pre[i - 1], A[i]);

    int[] post = new int[N];
    post[N - 1] = A[N - 1];
    for (int i = N - 2; i >= 0; i--)
      post[i] = gcd(post[i + 1], A[i]);

    int ans = Math.max(pre[N - 2], post[1]);
    for (int i = 1; i < N - 1; i++)
      ans = Math.max(ans, gcd(pre[i - 1], post[i + 1]));

    System.out.println(ans);
  }
}
