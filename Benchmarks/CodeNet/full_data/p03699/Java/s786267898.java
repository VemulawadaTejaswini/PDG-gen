import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int[] s = new int[N+1];
    for (int i = 1; i <= N; i++) {
      s[i] = sc.nextInt();
    }
    
    boolean[][]dp = new boolean[N+1][10000+1];
    dp[0][0] = true;
    for (int i = 1; i <= N; i++) {
      for (int j = 0; j+s[i] <= 10000; j++){
        if (dp[i-1][j]) {
          dp[i][j] = true;
          dp[i][j+s[i]] = true;
        }
      }
    }

    int ans = 0;
    for (int j = 10000; j >= 0; j--) {
      if (dp[N][j] && j % 10 != 0) {
        ans = j;
        break;
      }
    }
    
    System.out.println(ans);
  }
}