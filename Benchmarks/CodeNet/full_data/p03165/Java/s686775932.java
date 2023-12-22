import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    String a = in.next();
    String b = in.next();
    //    Random random = new Random();
    //    int count = 0;
    //    while (true) {
    //      int maxStringLength = random.nextInt(10) + 1;
    //      StringBuilder A = new StringBuilder();
    //      StringBuilder B = new StringBuilder();
    //      for (int i = 0; i < maxStringLength; ++i) {
    //        char c = (char)(random.nextInt(6) + 97);
    //        A.append(c);
    //        B.append(c);
    //      }
    //      maxStringLength = random.nextInt(10) + 1;
    //      for (int i = 0; i < maxStringLength; ++i) {
    //        char c = (char)(random.nextInt(26) + 97);
    //        B.append(c);
    //      }
    //      String a = A.toString();
    //      String b = B.toString();
    //      String outDP = new Solver().solveDP(a, b, a.length(), b.length());
    //      String outR = new Solver().solve(a, b, a.length(), b.length()).reverse().toString();
    //      int x = outDP.length();
    //      int y = outDP.length();
    //      if (x == y) {
    //        count = count+1;
    //      }
    //      else {
    //        System.out.println(a);
    //        System.out.println(b);
    //        System.out.println(outR);
    //        System.out.println(outDP);
    //        break;
    //      }
    ////      if (count % 10 == 0)
    //      System.out.println(count);
    //    }
    //    System.out.println(new Solver().solve(a, b, a.length(), b.length()).reverse());
    System.out.println(new Solver().solveC(a, b));
  }
}

class Solver {
  public String solve(String a, String b) {
    int n = a.length();
    int m = b.length();
    int[][] dp = new int[m + 1][n + 1];
    int[][] res = new int[m + 1][n + 1];
    for (int i = 0; i <= m; ++i) {
      for (int j = 0; j <= n; ++j) {
        dp[i][j] = -3100;
      }
    }
    dp[0][0] = 0;
    for (int i = 0; i <= m; ++i) {
      for (int j = 0; j <= n; ++j) {
        if (i + 1 <= m) {
          if (dp[i + 1][j] < dp[i][j]) {
            dp[i + 1][j] = dp[i][j];
            res[i + 1][j] = 0;
          }
        }
        if (j + 1 <= m) {
          if (dp[i][j + 1] < dp[i][j]) {
            dp[i][j + 1] = dp[i][j];
            res[i][j + 1] = 1;
          }
        }
        if (i + 1 <= m && j + 1 <= n && a.charAt(i) == b.charAt(j)) {
          if (dp[i + 1][j + 1] < dp[i][j] + 1) {
            dp[i + 1][j + 1] = dp[i][j] + 1;
            res[i + 1][j + 1] = 2;
          }
        }
      }
    }
    int na = m;
    int nb = n;
    StringBuilder sb = new StringBuilder();
    while (na > 0 || nb > 0) {
      if (res[na][nb] == 2) {
        na--;
        nb--;
        sb.append(a.charAt(na));
      } else if (res[na][nb] == 0) {
        na--;
      } else {
        nb--;
      }
    }
    return sb.reverse().toString();
  }

  public String solveC(String s, String t) {
    int n = s.length();
    int m = t.length();
    int[][] dp = new int[n + 1][m + 1];
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        if (s.charAt(i - 1) == t.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
        } else {
          dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
        }
      }
    }
    char[] res = new char[dp[n][m]];
    int index = dp[n][m] - 1;
    int i = n;
    int j = m;
    while (i > 0 && j > 0) {
      if (s.charAt(i - 1) == t.charAt(j - 1)) {
        res[index--] = s.charAt(i - 1);
        i--;
        j--;
      } else if (dp[i - 1][j] > dp[i][j - 1]) {
        i--;
      } else {
        j--;
      }
    }
    return new String(res);
  }

}
