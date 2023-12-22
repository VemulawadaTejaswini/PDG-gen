import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static int dp[][][][] = new int [101][4][4][4];

    public static void main(String[] args) {
        int N = sc.nextInt();
        int mod = 1000000007;

        dp[0][3][3][3] = 1;

        for (int len = 0; len < N; len++) {
            // 最後から1文字目
            for (int c1 = 0; c1 < 4; c1++) {
                // 最後から2文字目
                for (int c2 = 0; c2 < 4; c2++) {
                    // 最後から3文字目
                    for (int c3 = 0; c3 < 4; c3++) {

                        // 条件に当てはるものがなければスキップ
                        if (dp[len][c1][c2][c3] == 0) continue;

                        // 新しく追加する。A,G,C,Tの全パターン　
                        for (int a = 0; a < 4; a++) {

                            if (a == 2 && c1 == 1 && c2 == 0) continue;
                            if (a == 2 && c1 == 0 && c2 == 1) continue;
                            if (a == 1 && c1 == 2 && c2 == 0) continue;
                            if (a == 2 && c1 == 1 && c3 == 0) continue;
                            if (a == 2 && c2 == 1 && c3 == 0) continue;

                            dp[len+1][a][c1][c2] += dp[len][c1][c2][c3];
                            dp[len+1][a][c1][c2] = dp[len+1][a][c1][c2] % mod;
                        }


                    }
                }
            }
        }

        int ans = 0;
        for (int c1 = 0; c1 < 4; c1++) {
            for (int c2 = 0; c2 < 4; c2++) {
                for (int c3 = 0; c3 < 4; c3++) {
                    ans += dp[N][c1][c2][c3];
                    ans %= mod;
                }
            }
        }
        System.out.println(ans);

    }
}