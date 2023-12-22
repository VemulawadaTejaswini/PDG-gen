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
        int n = nextInt();
        int[][] cost = new int[n][3];
        for(int i = 0; i < n; i++) nextArr(cost[i]);
        int[][] dp = new int[n][3];

        for(int i = 0; i < 3; i++) dp[0][i] = cost[0][i];
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    if (j != k) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + cost[i][j]);
                    }
                }
            }

        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 3; i++) {
            max = Math.max(max, dp[n - 1][i]);
        }
        print(max);


    }
}
