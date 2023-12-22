import javax.swing.*;
import java.io.*;
import java.sql.Struct;
import java.text.DecimalFormat;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long[][][] dp = new long[n + 1][n + 1][2];

        for (int i = 0; i < n + 1; i++) {
            dp[i][i][0] = 0;
            dp[i][i][1] = 0;
        }

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n; j++) {
                int start = j;
                int end = start + i;
                if ((start == end) || end > n ) {
                    continue;
                }
                long f1 = dp[start + 1][end][1];
                long s1 = dp[start][end -1][1];
                long f2 = dp[start + 1][end][0];
                long s2 = dp[start][end -1][0];
                dp[start][end][0] = Math.max((f1 + arr[start]), s1 + arr[end - 1]);
                dp[start][end][1] = Math.min((f2 - arr[start]), s2 - arr[end - 1]);

            }
        }

        System.out.println(dp[0][n][0]);
    }
}