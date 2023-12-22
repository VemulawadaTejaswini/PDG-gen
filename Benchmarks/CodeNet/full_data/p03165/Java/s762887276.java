import java.util.Scanner;

/**
 * LCS
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            char[] S = sc.next().toCharArray();
            char[] T = sc.next().toCharArray();

            String[][] dp = new String[S.length + 1][T.length + 1];

            for (int i = 0; i <= S.length; i++) {
                dp[i][0] = "";
            }
            for (int j = 0; j <= T.length; j++) {
                dp[0][j] = "";
            }

            for (int i = 1; i <= S.length; i++) {
                for (int j = 1; j <= T.length; j++) {
                    if (S[i - 1] == T[j - 1]) {
                        dp[i][j] = dp[i - 1][j - 1] + S[i - 1];
                    } else {
                        dp[i][j] = dp[i][j - 1].length() > dp[i - 1][j].length() ? dp[i][j - 1] : dp[i - 1][j];
                    }
                }
            }

            System.out.println(dp[S.length][T.length]);
        }
    }

}
