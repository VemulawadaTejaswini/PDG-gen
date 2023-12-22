import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        System.out.println(solve(S));
    }

    private static long solve(String S) {
        int[][] dp = new int[S.length()+1][13];

        dp[S.length()][0] = 1;
        int mul = 1;

        for (int i=S.length()-1; i>=0; i--) {
            if (S.charAt(i) == '?') {
                for (int k=0; k<10; k++) {
                    for (int j=0; j<13; j++) {
                        int p = (mul*k + j) % 13;

                        dp[i][p] += dp[i+1][j];
                        dp[i][p] %= MOD;
                    }
                }
            } else {
                int k = S.charAt(i)-'0';

                for (int j=0; j<13; j++) {
                    int p = (mul*k + j)%13;
                    dp[i][p] += dp[i+1][j];
                    dp[i][p] %= MOD;
                }
            }

            mul *= 10;
            mul %= 13;
        }

        return dp[0][5]%MOD;
    }
}