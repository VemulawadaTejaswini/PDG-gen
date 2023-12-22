import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++)
      a[i] = sc.nextInt();
    sc.close();

    long[][] dp = new long[N][N];
    for (int head = N - 1; 0 <= head; head--) {
      for (int tail = 0; tail < N; tail++) {
        if (dp[head][tail] != 0) continue;
        if (head == tail) {
          dp[head][tail] = a[head];
        } else {
          if (tail == 0) {
            dp[head][tail] = a[tail];
          } else if (head == N - 1) {
            dp[head][tail] = a[head];
          } else {
            dp[head][tail] = Math.max(
                a[head] - dp[head + 1][tail],
                a[tail] - dp[head][tail - 1]);
          }
        }
      }
    }

    long ans = dp[0][N - 1];
    System.out.println(ans);
  }
}