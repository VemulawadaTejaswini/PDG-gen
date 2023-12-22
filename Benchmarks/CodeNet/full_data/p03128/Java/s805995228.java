import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[m];
    for(int i = 0; i < m; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int[] hon = {2, 5, 5, 4, 5, 6, 3, 7, 6};
    int[] dp = new int[n + 1];
    int[] b = new int[m];
    for(int i = 0; i < m; i++) {
      b[i] = hon[a[i] - 1];
    }
    for(int i = 1; i < n + 1; i++) {
      dp[i] = -1000000; 
    }
    for(int i = 1; i < n + 1; i++) {
      for(int j = 0; j < m; j++) {
        if(b[j] <= i) {
          dp[i] = Math.max(dp[i], dp[i - b[j]] + 1);
        }
      }
    }
    String ans = "";
    int k = n;
    while(k > 0) {
      for(int j = m - 1; j >= 0; j--) {
        if((k >= b[j]) && (dp[k - b[j]] == (dp[k] - 1))) {
          k -= b[j];
          ans += String.valueOf(a[j]);
          break;
        }
      }
    }
    System.out.println(ans);
  }
}