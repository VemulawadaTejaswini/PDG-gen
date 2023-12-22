import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String a = scan.nextLine();
    String b = scan.nextLine();
    scan.close();

    System.out.println(LCS(a, b));
  }

  private static String LCS(String a, String b) {
    if (a.length() == 0 || b.length() == 0)
      return "";
    int[][] dp = new int[a.length() + 1][b.length() + 1];

    for (int i = 0; i < dp.length; i++)
      dp[i][0] = i;

    for (int j = 0; j < dp[0].length; j++)
      dp[0][j] = j;

    for (int i = 1; i < dp.length; i++)
    for (int j = 1; j < dp[0].length; j++) {
      if (a.charAt(i - 1) == b.charAt(j - 1)) {
        dp[i][j] = dp[i-1][j-1];
      } else {
        dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + 1;
      }
    }

    StringBuilder sb = new StringBuilder();

    int i = dp.length - 1;
    int j = dp[0].length - 1;

    while (i >= 0 && j >= 0) {
      int strI = i - 1;
      int strJ = j - 1;
      if (strI >= 0 && strJ >= 0 && a.charAt(strI) == b.charAt(strJ)) {
        sb.append(a.charAt(strI));
        i--;
        j--;
      } else {
        int top = i > 0 ? dp[i - 1][j] : Integer.MAX_VALUE;
        int left  = j > 0 ? dp[i][j - 1] : Integer.MAX_VALUE;

        if (left > top) i--;
        else j--;
      }
    }
    return sb.reverse().toString();
  }

}