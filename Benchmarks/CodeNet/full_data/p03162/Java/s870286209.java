
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static int[][] a = new int[100010][3];
    static int[][] dp = new int[100010][3];
    static int k;

    static int chmin(int a, int b) {
        if (a > b) {
            a = b;
            return a;
        }
        return a;
    }

    static int chmax(int a, int b) {
        if (a < b) {
            a = b;
            return a;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (j == k)
                        continue;
                    dp[i + 1][k] = chmax(dp[i + 1][k], dp[i][j] + a[i][k]);
                }

            }
        }
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            ans = chmax(ans, dp[n][i]);
        }
        System.out.println(ans);
    }
}
