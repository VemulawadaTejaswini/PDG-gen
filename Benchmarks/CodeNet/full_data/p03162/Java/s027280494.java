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
        int[] dp = new int[N];
        int[] indices = new int[N];

        dp[0] = -1;
        indices[0] = -1;
        for (int k = 0; k < 3; k++) {
            if (dp[0] < hs[0][k]) {
                dp[0] = hs[0][k];
                indices[0] = k;
            }
        }

        for (int i = 1; i < N; i++) {
            int max = -1;
            for (int k = 0; k < 3; k++) {
                if (k != indices[i-1] && max < hs[i][k]) {
                    max = hs[i][k];
                    indices[i] = k;
                }
            }
            dp[i] = max + dp[i-1];

            if (i >= 2) {
                int unused = -1;
                for (int k = 0; k < 3; k++) {
                    if (k != indices[i-1] && k != indices[i-2]) {
                        unused = k;
                    }
                }
                int c = dp[i-2] + hs[i-1][unused] + hs[i][indices[i-1]];
                if (dp[i] < c) {
                    dp[i-1] = dp[i-2] + hs[i-1][unused];
                    indices[i] = unused;
                    dp[i] = c;
                    indices[i] = indices[i-1];
                }
            }
        }

        return dp[N-1];
    }
}

public class Main {
    public static void main(String[] args) {
        int ans = new Problem().solve();
        System.out.println(ans);
    }
}
