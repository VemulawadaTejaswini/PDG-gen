import java.util.*;
public class Main {
  
  private static int X = 1000000007;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    int[][] memo = new int[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        memo[i][j] = -1;
      }
    }
    for (int i = 1; i <= K; i++) {
      int count = (comb(N-K+1, i, memo) * comb(K-1, i-1, memo)) % X;
      System.out.println(count);
    }
  }
  
  private static int comb(int n, int r, int[][] memo) {

    if (n == 0) {
      return 0;
    }

    if (r == n || r == 0) {
      return 1;
    }
    if (r == 0) {
      return 1;
    }

    if (memo[n][r] != -1) {
      return memo[n][r];
    }
        
    memo[n][r] = (comb(n-1, r-1, memo) + comb(n-1, r, memo)) % X;
    
    return memo[n][r];
  }
}