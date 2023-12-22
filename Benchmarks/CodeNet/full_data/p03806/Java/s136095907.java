import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int N = Integer.parseInt(sc.next());
    int Ma = Integer.parseInt(sc.next());
    int Mb = Integer.parseInt(sc.next());
    
    int a[] = new int[N];
    int b[] = new int[N];
    int c[] = new int[N];
    int sub[] = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = Integer.parseInt(sc.next());
      b[i] = Integer.parseInt(sc.next());
      c[i] = Integer.parseInt(sc.next());
      sub[i] = Mb * a[i] - Ma * b[i];
    }
    
    int origin = 10 * 10 * N;
    int length = origin * 2 + 1;
    int dp[][] = new int[N + 1][length];
    int maxSumCost = 100 * N + 1000;
    for (int i = 0; i < N + 1; i++) {
      for (int j = 0; j < length; j++) {
        dp[i][j] = maxSumCost;
      }
    }
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < length; j++) {
        if (dp[i][j] < maxSumCost) {
          dp[i + 1][j] = Math.min(dp[i][j], dp[i + 1][j]);
          dp[i + 1][j + sub[i]] = Math.min(dp[i][j] + c[i], dp[i + 1][j + sub[i]]);
        } else if (j == origin) {
          dp[i + 1][origin + sub[i]] = Math.min(dp[i][origin + sub[i]], c[i]);
        }
      }
    }
    if (dp[N][origin] == maxSumCost) {
      System.out.println(-1);
    } else {
      System.out.println(dp[N][origin]);
    }
  }
}