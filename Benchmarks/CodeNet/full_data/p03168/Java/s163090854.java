import java.util.Scanner;

class Main {
    static Scanner sc;

    private static void nextArr(int[] h) {
        for(int i = 0; i < h.length; i++) h[i] = sc.nextInt();
    }

    private static int nextInt() {
        return sc.nextInt();
    }

    private static void print(Object... vals) {
        for(int i = 0; i < vals.length; i++) {
            if (i != vals.length - 1) {
                System.out.print(vals[i] + ",");
            } else {
                System.out.print(vals[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] p = new double[n];
        for(int i = 0; i < n; i++) p[i] = sc.nextDouble();

        double[][] dp = new double[n + 1][n + 1];
        dp[1][0] = (1 - p[0]);
        dp[1][1] = p[0];
        for(int i = 2; i <= n; i++) dp[1][i] = 0;
        for(int i = 2; i <= n; i++) dp[i][0] = dp[i - 1][0] * (1 - p[i - 1]);
                
        for(int i = 2; i <= n; i++) {
            for(int j = 1; j<= n; j++) {
                dp[i][j] = p[i - 1] * dp[i - 1][j - 1] + (1 - p[i - 1]) * dp[i - 1][j];
            }
        }

        double ans = 0;
        for(int i = (n + 1) / 2; i <= n; i++) {
            ans += dp[n][i];
        }
        print(ans);
    }
}
