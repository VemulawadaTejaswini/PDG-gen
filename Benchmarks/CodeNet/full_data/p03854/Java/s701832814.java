import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int len = S.length();
    String ans = "NO";
    if(len >= 5) {
      // dp[i]はインデックスi～末尾までの部分文字列に対する判定結果を返す（出来るなら1、出来ないなら-1）
      int[] dp = new int[len];
      dp[len - 1] = -1;
      dp[len - 2] = -1;
      dp[len - 3] = -1;
      dp[len - 4] = -1;
      dp[len - 5] = -1;
      String str = S.substring(len - 5);
      if(str.equals("dream") || str.equals("erase")) dp[len - 5] = 1;
      for(int i = len - 6; i >= 0; i--) {
        dp[i] = -1;
        String str5 = S.substring(i, i + 5);
        String str6 = S.substring(i, i + 6);
        String str7 = S.substring(i, i + 7);
        if((str5.equals("dream") || str5.equals("erase")) && dp[i + 5] == 1) dp[i] = 1;
        if(str6.equals("eraser") && dp[i + 6] == 1) dp[i] = 1;
        if(str7.equals("dreamer") && dp[i + 7] == 1) dp[i] = 1;
      }
      if(dp[0] == 1) ans = "YES";
    }
    System.out.println(ans);
  }
}