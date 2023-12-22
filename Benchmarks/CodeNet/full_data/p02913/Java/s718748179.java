import java.util.*;

public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = Integer.parseInt(sc.next());
      String str = sc.next();
      
      int res = 0;
      for (int len = num / 2; len > 0; len--) {
        int[] dp = new int[num];
        for (int i = num - len - 1; i >= 0; i--) {
          if (str.charAt(i) == str.charAt(i + len)) {
          	dp[i] = Math.min(dp[i + 1] + 1, len);
            res = Math.max(res, dp[i]);
          } else {
          	dp[i] = 0;
          }
        }
      }
      
      System.out.println(res);
    }
}