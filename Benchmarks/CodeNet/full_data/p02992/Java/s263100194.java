import java.util.*;
public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    // Number of pertterns end with N, K
    int[][] dp = new int[N+1][2];
    int[] maxPeer = new int[N+1];
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        if (i*j <= N) {
          dp[i][0]++;
          maxPeer[i] = j;
        } else {
          break;
        }
      }
    }
    
    for (int k = 3; k <= K; k++) {
      for (int n = 1; n <= N; n++) {
        for (int i = 1; i <= maxPeer[n]; i++) {
          dp[n][k%2] = (dp[n][k%2] + dp[i][(k-1)%2]) % 1000000007;
        }
      }
    }
    long ans = 0;
    for (int n = 1; n <= N; n++) {
      ans = (ans + dp[n][K%2]) % 1000000007;
    }
    
    System.out.println(ans);
  }
}
