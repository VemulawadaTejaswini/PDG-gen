import java.util.Scanner;

class Problem {
    int N;
    int[][] hs;

    Problem() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        hs = new int[N][3];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < 3; k++) {
                hs[i][k] = sc.nextInt();
            }
        }
    }

    int solve() {
        int[][] dp = new int[N][3];

        for (int k = 0; k < 3; k++) {
            dp[0][k] = hs[0][k];
        }

        for (int i = 1; i < N; i++) {
            for (int k = 0; k < 3; k++) {
                dp[i][k] = -1;
                for (int j = 0; j < 3; j++) {
                    if (k == j) continue;
                    dp[i][k] = Math.max(dp[i][k], dp[i-1][j]);
                }
                dp[i][k] += hs[i][k];
            }
        }

        int max = -1;
        for (int k = 0; k < 3; k++) {
            if (max < dp[N-1][k]) {
                max = dp[N-1][k];
            }
        }

        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        int ans = new Problem().solve();
        System.out.println(ans);
    }
}
