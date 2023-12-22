import java.util.*;

public class Main {
  private static final int[] mnum = { 0, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[M];
    for (int i = 0; i < M; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    
    int[] dp = new int[N+1];
    for (int i = 1; i <= N; i++) {
      for (int j = 0; j < M; j++) {
        if (i - mnum[A[j]] >= 0) {
          dp[i] = Math.max(dp[i], dp[i-mnum[A[j]]]+1);
        }
      }
    }
    
    String ans = "";
    int len = dp[N];
    int remain = N;
    for (int i = len; i > 0; i--) {
      for (int j = M-1; j >= 0; j--) {
        if (i == 1) {
          // last one
          if (remain == mnum[A[j]]) {
            ans = ans + Integer.toString(A[j]);
            break;
          }
        } else {
          if (remain-mnum[A[j]] > 0 && dp[remain-mnum[A[j]]] == i-1) {
            ans = ans + Integer.toString(A[j]);
            remain -= mnum[A[j]];
            break;
          }
        }
      }
    }
    
    System.out.println(ans);
  }
}