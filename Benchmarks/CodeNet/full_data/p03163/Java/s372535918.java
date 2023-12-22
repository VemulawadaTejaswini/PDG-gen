import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        int n, wt;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        wt = sc.nextInt();

        List<Long> wts = new ArrayList<>(), vals = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long wx, vx;
            wx = sc.nextLong();
            vx = sc.nextLong();
            wts.add(wx);
            vals.add(vx);
        }

        long[][] dp = new long[wt + 1][n + 1];
        for (int i = 1; i <= wt; i++) {
            for (int j = 1; j <= n; j++) {
                // get item
                long item_wt = wts.get(j - 1);
                long item_val = vals.get(j - 1);

                // case 1: item is not part of the knapsack
                dp[i][j] = dp[i][j - 1];

                // case 2: item is part of the knapsack
                if (item_wt <= i) {
                    dp[i][j] = Math.max(dp[i - (int)item_wt][j - 1] + item_val, dp[i][j]);
                }
            }
        }

//        for(int[] x: dp) {
//            System.out.println(Arrays.toString(x));
//        }

        System.out.println(dp[wt][n]);
    }
}