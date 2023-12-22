import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long[] x = new long[N];
    for (int i = 0; i < N; i++) {
      x[i] = sc.nextLong();
    }
    long ans = Long.MAX_VALUE;
    for (int i = 0; i < N - K + 1; i++) {
      long tmp = Math.min(Math.abs(x[i]), Math.abs(x[i + K - 1]));
      for (int j = i; j < i + K - 1; j++) {
        tmp += Math.abs(x[j] - x[j + 1]);
      }
      if (ans > tmp) {
        ans = tmp;
      }
    }
    System.out.println(ans);
  }
}