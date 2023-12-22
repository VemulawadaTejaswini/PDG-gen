import java.util.Scanner;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }


    // int N = Integer.parseInt(scanner.nextLine());
    // int N = scanner.nextInt(), M = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());
        // 0: Null, 1: A, 2: G, 3: C, 4: T
        long[][][][] dp = new long[N + 1][5][5][5];
        dp[0][0][0][0] = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= 4; j++) {
                for (int k = 0; k <= 4; k++) {
                    for (int l = 0; l <= 4; l++) {
                        for (int m = 1; m <= 4; m++) {
                            // AGC, ACG, GAC, A*GC, AG*C
                            if ((k == 1 && l == 2 && m == 3)
                                    || (k == 1 && l == 3 && m == 2)
                                    || (k == 2 && l == 1 && m == 3)
                                    || (j == 1 && l == 2 && m == 3)
                                    || (j == 1 && k == 2 && m == 3)) {
                                continue;
                            }
                            dp[i][k][l][m] += dp[i - 1][j][k][l];
                            dp[i][k][l][m] %= MOD;
                        }

                    }
                }
            }
        }
        long ans = 0;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                for (int k = 0; k <= 4; k++) {
                    ans += dp[N][i][j][k];
                    ans %= MOD;
                }
            }
        }
        System.out.println(ans);
    }

}
