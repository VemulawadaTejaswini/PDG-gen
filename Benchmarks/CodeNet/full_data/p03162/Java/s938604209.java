import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
            c[i] = scan.nextInt();
        }
        int[][] dp = new int[n+1][3];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][0] = Math.max(dp[i-1][1]+a[i-1],dp[i-1][2]+a[i-1]);
                dp[i][1] = Math.max(dp[i-1][0]+b[i-1],dp[i-1][2]+b[i-1]);
                dp[i][2] = Math.max(dp[i-1][0]+c[i-1],dp[i-1][1]+c[i-1]);
            }
        }
        System.out.println(Math.max(dp[n][0],Math.max(dp[n][1],dp[n][2])));
    }
}
