import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[n][2];
    int[][] dp = new int[n+1][n*1000+1];

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        for (int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i=0; i<n+1; i++) {
            for (int j=0; j<n*1000+1; j++) {
                dp[i][j] = (int)1e9 + 50000;
            }
        }

        dp[0][0] = 0;

        for (int i=1; i<=n; i++) {
            for (int j=0; j<=n*1000; j++) {
                if (j < arr[i-1][1]) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-arr[i-1][1]]+arr[i-1][0]);
                }
            }
        }

        int ret = 0;

//        System.out.println(dp[1][5]);

        for (int i=0; i<=n*1000; i++) {
//            System.out.println(dp[n][i]);
            if (dp[n][i] <= m) {
                ret = Math.max(ret, i);

            }
        }

        System.out.println(ret);

    }
}

