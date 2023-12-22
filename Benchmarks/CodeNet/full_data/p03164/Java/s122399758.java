public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];

        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        int[][] dp = new int[N][W + 1];
        dp[0][0] = 0;
//        System.out.print(dp[0][0] + "  ,");
        for (int i = 1; i < N; i++) dp[i][0] = 0;
        for (int j = 1; j < W + 1; j++) {
            dp[0][j] = w[0] <= j ? v[0] : 0;
//            System.out.print(dp[0][j] + "  ,");
        }
//        System.out.println();

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < W + 1; j++) {
                int c1 = 0;
                if (w[i] <= j) {
                    c1 = dp[i - 1][W - w[i]] + v[i];
                }
                int c2 = dp[i - 1][W];
                dp[i][j] = Math.max(c1, c2);
//                System.out.print(dp[i][j] + "  ,");
            }
//            System.out.println();
        }
        System.out.println(dp[N - 1][W]);
//        return dp[N - 1][W];
    }
}