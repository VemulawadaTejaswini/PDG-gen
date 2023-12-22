import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] hapiness = new int[N][3];
        int[][] dp = new int[N][3];
        for(int i = 0; i < N ; i++) {
            hapiness[i][0] = scanner.nextInt();
            hapiness[i][1] = scanner.nextInt();
            hapiness[i][2] = scanner.nextInt();
        }

        dp[0][0] = hapiness[0][0];
        dp[0][1] = hapiness[0][1];
        dp[0][2] = hapiness[0][2];
        for(int i = 1; i < N; i++) {
            for(int j = 0; j < 3; j++) {
                if(j != 0) dp[i][j] = Math.max(dp[i][j], dp[i-1][0] +  hapiness[i][j]);
                if(j != 1) dp[i][j] = Math.max(dp[i][j], dp[i-1][1] +  hapiness[i][j]);
                if(j != 2) dp[i][j] = Math.max(dp[i][j], dp[i-1][2] +  hapiness[i][j]);
            }
        }
        int ret = 0;
        ret = Math.max(dp[N-1][0], dp[N-1][1]);
        ret = Math.max(ret, dp[N-1][2]);
        System.out.println(ret);
    }
}
