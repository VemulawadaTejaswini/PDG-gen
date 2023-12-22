import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    char[] t = scanner.next().toCharArray();

    int slen = s.length;
    int tlen = t.length;
    int[][] dp = new int[slen + 1][tlen + 1];
    for (int i = 1; i <= slen; i++) {
      for (int j = 1; j <= tlen; j++) {
        dp[i][j] = dp[i - 1][j - 1] + (s[i - 1] == t[j - 1] ? 1 : 0);
        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
        dp[i][j] = Math.max(dp[i][j], dp[i][j - 1]);
      }
    }

    StringBuilder sb = new StringBuilder();
    int i = slen;
    int j = tlen;
    while (i > 0 && j > 0) {
      if (dp[i][j] == dp[i - 1][j - 1] + 1) {
        sb.append(s[i - 1]);
        i--;
        j--;
      } else if (dp[i][j] == dp[i - 1][j]) {
        i--;
      } else {
        j--;
      }
    }
    System.out.println(sb.reverse().toString());
  }
}
