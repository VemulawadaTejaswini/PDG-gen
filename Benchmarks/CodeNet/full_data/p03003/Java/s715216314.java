
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int m = in.nextInt();
        final int n = in.nextInt();
        final long[] ms = new long[m];
        final long[] ns = new long[n];
        for (int i = 0; i < m; i++) {
            ms[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            ns[i] = in.nextInt();
        }
        final long[][] sum = new long[m + 1][n + 1];
//        final long[][] dp = new long[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
//                if (ms[i] == ns[j]) {
//                    dp[i][j] = sum[i][j] + 1;
//                } else {
//                    dp[i][j] = 0;
//                }
                sum[i + 1][j + 1] += sum[i + 1][j];
                sum[i + 1][j + 1] += sum[i][j + 1];
                sum[i + 1][j + 1] -= sum[i][j];                
                sum[i + 1][j + 1] %= 1_000_000_007;
                if (ms[i] == ns[j]) {
                    sum[i + 1][j + 1] += sum[i][j] + 1;
                }
                sum[i + 1][j + 1] %= 1_000_000_007;
//                dp[i][j] %= 1_000_000_007;
            }
        }
        System.out.println((sum[m][n] + 1) % 1_000_000_007);
    }
}
