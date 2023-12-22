import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int w = sc.nextInt();
        int[][] item = new int[n][2];

        for (int i=0; i<n; i++) {
            item[i][0] = sc.nextInt();
            item[i][1] = sc.nextInt();
        }

        long[][] dp = new long[n+1][w+1];

        for (int i=1; i<=n; i++) {
            int weigh = item[i-1][0];
            int val = item[i-1][1];
            inner:
            for (int j=1; j<=w; j++) {
//                if (j < dp[i-1][j]+weigh) continue inner;
                if (0<=j-weigh && j-weigh<=w) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weigh]+val);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

//        System.out.println(dp[1][3]);
//        System.out.println(dp[2][3]);
//        System.out.println(dp[n-2][w]);
//        System.out.println(dp[n-1][w]);
        System.out.println(dp[n][w]);

    }
}


