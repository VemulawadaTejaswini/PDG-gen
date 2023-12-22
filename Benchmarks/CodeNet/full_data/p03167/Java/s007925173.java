import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] arr = new char[h][w];
    long[][] dp = new long[h+1][w+1];
    int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<h; i++) arr[i] = sc.next().toCharArray();

        dp[1][1] = 1;

        for (int i=1; i<=h; i++) {
            for (int j=1; j<=w; j++) {
                if (arr[i-1][j-1] == '#') continue;
                if (i == 1 && j == 1) continue;
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
                dp[i][j] %= MOD;
            }
        }

        System.out.println(dp[h][w]);

    }

}

