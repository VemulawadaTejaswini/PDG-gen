import java.util.Scanner;

/**
 * LCS
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            char[] S = sc.next().toCharArray();
            char[] T = sc.next().toCharArray();

            int[][] dp = new int[S.length + 1][T.length + 1];

            for (int i = 1; i <= S.length; i++) {
                for (int j = 1; j <= T.length; j++) {
                    if (S[i - 1] == T[j - 1]) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                    }
                }
            }

            StringBuilder sb = new StringBuilder();

            for (int len = dp[S.length][T.length] - 1, i = S.length, j = T.length; len >= 0; len--) {
                while (dp[i][j] > len) {
                    i--;
                }

                while (dp[i + 1][j] > len) {
                    j--;
                }

                sb.append(S[i]);
            }

            String lcs = sb.reverse().toString();

            System.out.println(lcs);
        }
    }

}
