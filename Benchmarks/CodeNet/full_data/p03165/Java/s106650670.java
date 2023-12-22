import java.util.*;

class Main {
  public static void main(String[] args) {
    String s, t;
    Scanner sc = new Scanner(System.in);
    s = sc.nextLine();
    t = sc.nextLine();
    int[][] dp = new int[s.length()+1][t.length()+1];
    char[] res = new char[Math.min(s.length(), t.length())];

    for(int i = 1; i <= s.length(); i++) {
      for(int j = 1; j <= t.length(); j++) {
        if(s.charAt(i-1) == t.charAt(j-1))
          dp[i][j] = 1;
      }
    }
    int lastIndex = -1;
    for(int i = 1; i <= s.length(); i++) {
      for(int j = 1; j <= t.length(); j++) {
        dp[i][j] += Math.max(dp[i-1][j-1], Math.max(dp[i-1][j], dp[i][j-1]));
  
        if(s.charAt(i-1) == t.charAt(j-1) && dp[i][j] != dp[i-1][j]
           && dp[i][j] != dp[i][j-1] && dp[i][j] != dp[i-1][j-1] && j-1 > lastIndex) {
          res[dp[i][j]-1] = s.charAt(i-1);
          lastIndex = j-1;
        }
      }
    }
    System.out.println(String.valueOf(res));
  }
}