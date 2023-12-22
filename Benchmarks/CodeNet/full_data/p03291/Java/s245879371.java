
import java.util.Scanner;

/**
 *
 */
public class Main {
    public static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        System.out.println(solve2(S));
    }

    /**
     * 参考実装のJava移植
     * @param S
     * @return
     */
    private static int solve2(String S) {
        int N = S.length();
        long[][] dp = new long[N+1][4];

        for (int i=N; i>=0; i--) {
            for (int j=3; j>=0; j--) {
                if (i == N) {
                    // 正常処理完了or手遅れ
                    dp[N][j] = (j == 3) ? 1 : 0;
                } else {
                    if (j == 3) {
                        //丸を付け終わったので丸を置換していく
                        dp[i][j] = dp[i + 1][j] * (S.charAt(i) == '?' ? 3 : 1);
                    } else {
                        // 丸をつけない場合
                        dp[i][j] = dp[i + 1][j] * (S.charAt(i) == '?' ? 3 : 1);

                        // 丸をつける場合
                        if (S.charAt(i) == '?' || S.charAt(i) == "ABC".charAt(j)) {
                            dp[i][j] += dp[i+1][j+1];
                        }
                    }

                    dp[i][j] %= MOD;
                }
            }
        }

        return (int)dp[0][0];
    }

    /**
     * コンテスト中の回答(サンプル3が一致しない)
     * @param S
     * @return
     */
    private static int solve(String S) {
        long[][] count = new long[4][S.length()+1];

        for (int i=0; i<S.length(); i++) {
            if (S.charAt(i) == 'A') {
                count[0][i+1] = count[0][i] == 0 ? 1 : count[0][i];

                count[1][i+1] += count[1][i];
                count[1][i+1] += count[0][i] == 0 ? 1 : count[0][i];

                count[2][i+1] = count[2][i];
                count[3][i+1] = count[2][i];
            } else if (S.charAt(i) == 'B') {
                count[0][i+1] = count[0][i] == 0 ? 1 : count[0][i];
                count[1][i+1] = count[1][i];

                count[2][i+1] += count[2][i] + count[1][i];

                count[3][i+1] = count[2][i];
            } else if (S.charAt(i) == 'C') {
                count[0][i+1] = count[0][i] == 0 ? 1 : count[0][i];
                count[1][i+1] = count[1][i];
                count[2][i+1] = count[2][i];

                count[3][i+1] += count[3][i];
                count[3][i+1] += count[2][i];
            } else if (S.charAt(i) == '?') {
                count[0][i+1] = count[0][i] == 0 ? 3 : count[0][i]*3;

                count[1][i+1] += count[1][i]*3;
                count[1][i+1] += count[0][i] == 0 ? 1 : count[0][i];

                count[2][i+1] += count[2][i]*3;
                count[2][i+1] += count[1][i];

                count[3][i+1] += count[3][i]*3;
                count[3][i+1] += count[2][i];
            }

            /*
            count[0][i+1] %= MOD;
            count[1][i+1] %= MOD;
            count[2][i+1] %= MOD;
            count[3][i+1] %= MOD;
            System.err.println("[" + (i+1) + "]" + count[0][i+1] + "," + count[1][i+1] + "," + count[2][i+1] + "," + count[3][i+1]);
            */
        }

        System.err.println(count[3][S.length()]);
        return (int)(count[3][S.length()]%MOD);
    }
}
