import java.util.*;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    int last = -1;
    boolean[] dp = new boolean[K + 1];
    dp[0] = true;
    for (int i = N - 1; i >= 0 ; i--) {
      for (int j = K; j >= 0; j--) {
        if (dp[j]) {
          if (j + A[i] >= K) {
            last = i;
          } else {
            dp[j + A[i]] = true;
          }
        }
      }
    }
    System.out.println(last == -1 ? N : last);
  }

}
