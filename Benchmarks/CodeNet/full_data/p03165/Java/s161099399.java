import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    String t = scanner.next();
    int sn = s.length();
    int tn = t.length();
    String[][] dp = new String[sn + 1][tn + 1];
    for (int i = 0; i < sn + 1; i++) {
      dp[i][0] = "";
    }
    for (int i = 0; i < tn + 1; i++) {
      dp[0][i] = "";
    }
    String[] di, di2;
    for (int i = 0; i < sn; i++) {
      di = dp[i];
      di2 = dp[i + 1];
      for (int j = 0; j < tn; j++) {
        if (s.charAt(i) == t.charAt(j)) {
          dp[i + 1][j + 1] = di[j] + s.charAt(i);
        } else {
          if (di[j + 1].length() > di2[j].length()) {
            dp[i + 1][j + 1] = di[j + 1];
          } else {
            dp[i + 1][j + 1] = di2[j];
          }
        }
      }
      System.gc();
    }
    System.out.println(dp[sn][tn]);
  }
}
