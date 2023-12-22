import java.util.*;

public class Main {
    static int A = 0;
    static int C = 1;
    static int G = 2;
    static int T = 3;
    static long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // A => 0, C => 1, G => 2, T => 3
        // AGC, ACG, GAC
        // 021, 012, 201

        // dp[n][i][i - 1][i - 2]

        long[][][][] dp = new long[N][4][4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if ((i == 0 && j == 2 && k == 1) || (i == 0 && j == 1 && k == 2) || (i == 2 && j == 0 && k == 1)) {
                        dp[2][k][j][i] = 0;
                    } else {
                        dp[2][k][j][i] = 1;
                    }
                }
            }
        }


        // A => 0, C => 1, G => 2, T => 3
        // おしり <- CGA, GCA, CAG
        //          120, 210, 102

        // dp[n][i][i - 1][i - 2]

        for (int n = 3; n < N; n++) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        for (int l = 0; l < 4; l++) {
//                            System.out.println((isValid(i, j, k, l) ? "isValid" : "isNotValid") + ".... i:" + i + " ,j:" + j + " , k:" + k + ", l:" + l);

                            if (isValid(k, j, i, l)) {
                                dp[n][k][j][i] += dp[n - 1][j][i][l];
                                dp[n][k][j][i] %= MOD;
                            }
                        }
                    }
                }
            }
        }

        long count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    count += dp[N - 1][k][j][i];
                    count %= MOD;
                }
            }
        }

        System.out.println(count);
    }

    static boolean isValid(int k, int j, int i, int l) {
        // AGC, ACG, GAC
        if ((i == A && j == G && k == C)
                || (i == A && j == C && k == G)
                || (i == G && j == A && k == C)
        ) {
            return false;
        } else if ((k == C && j == G && l == A) || (k == C && i == G && l == A)) {
            // 4文字
            return false;
        } else {
            return true;
        }
    }
}
