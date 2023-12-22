import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long r = sc.nextLong();
    long s = sc.nextLong();
    long p = sc.nextLong();
    String t = sc.next(); 
    ArrayList[] list = new ArrayList[k];
    for(int i = 0; i < k; i++) {
      list[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < t.length(); i++) {
      if(t.charAt(i) == 'r') {
        list[(i % k)].add(0);
      } else if(t.charAt(i) == 's') {
        list[(i % k)].add(1);
      } else {
        list[(i % k)].add(2);
      }
    }
    long ans = 0;
    for(int i = 0; i < k; i++) {
      int q = list[i].size();
      long[][] dp = new long[q][3];
      if((int)list[i].get(0) == 0) {
        dp[0][2] = p;
      } else if((int)list[i].get(0) == 1) {
        dp[0][0] = r;
      } else {
        dp[0][1] = s;
      }
      for(int j = 1; j < q; j++) {
        for(int l = 0; l < 3; l++) {
          if(l == 0) {
            if((int)list[i].get(j) == 1) {
              dp[j][l] = r + Math.max(dp[j - 1][1], dp[j - 1][2]);
            } else {
              dp[j][l] = Math.max(dp[j - 1][1], dp[j - 1][2]);
            }
          } else if(l == 1) {
            if((int)list[i].get(j) == 2) {
              dp[j][l] = s + Math.max(dp[j - 1][0], dp[j - 1][2]);
            } else {
              dp[j][l] = Math.max(dp[j - 1][0], dp[j - 1][2]);
            }
          } else {
            if((int)list[i].get(j) == 0) {
              dp[j][l] = p + Math.max(dp[j - 1][0], dp[j - 1][1]);
            } else {
              dp[j][l] = Math.max(dp[j - 1][0], dp[j - 1][1]);
            }
          }         
        }
      }
      long w = Math.max(dp[q - 1][0], dp[q - 1][1]);
      w = Math.max(w, dp[q - 1][2]);
      ans += w;
    }
    System.out.println(ans);
  }
}