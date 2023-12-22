import java.util.*;

class Main {
    Scanner sc = new Scanner(System.in);
    int[][] dp = new int[201][201];

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    private void run() {
        int k = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                for (int l = 1; l <= k; l++) {
                    sum += gcd(gcd(i, j),l);
                }
            }
        }
        System.out.println(sum);
    }

    private int gcd(int m, int n) {
        if (dp[m][n] > 0) return dp[m][n];
        if (n == 0) {
            dp[m][n] = dp[n][m] = m;
            return m;
        }
        return gcd(n, m % n);
    }
}
