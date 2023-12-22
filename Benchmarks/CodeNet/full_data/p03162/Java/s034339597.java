import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();

        int[][] point = new int[n][3];
        for (int i=0; i<n; i++) {
            point[i][0] = sc.nextInt();
            point[i][1] = sc.nextInt();
            point[i][2] = sc.nextInt();
        }

        int[][] dp = new int[n+1][3];

        for (int i=0; i<n; i++) {
            dp[i+1][0] = Math.max(dp[i][1]+point[i][1], dp[i][2]+point[i][2]);
            dp[i+1][1] = Math.max(dp[i][0]+point[i][0], dp[i][2]+point[i][2]);
            dp[i+1][2] = Math.max(dp[i][1]+point[i][1], dp[i][0]+point[i][0]);
        }

        int ans = 0;

        ans = Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2]));

//        System.out.println(dp[1][0]);
//        System.out.println(dp[1][1]);
//        System.out.println(dp[1][2]);

        System.out.println(ans);
    }
}


