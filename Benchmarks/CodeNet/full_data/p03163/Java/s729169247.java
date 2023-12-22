import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static long[][] dp = new long[105][100000 + 5];
    static PrintWriter pw = new PrintWriter(System.out);

    public static long f(int[] arr, int[] w, int n, int sum, int W) {
        if (n == arr.length)
            return 0;
        if (dp[n][sum] != -1)
            return dp[n][sum];
        if (w[n] + sum <= W) {
            return dp[n][sum] = Math.max(arr[n] + f(arr, w, n + 1, sum + w[n], W), f(arr, w, n + 1, sum, W));
        }
        return dp[n][sum] = f(arr, w, n + 1, sum, W);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt();
        int[] arr = new int[n];
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < dp.length; i++)
            for (int j = 0; j < dp[i].length; j++)
                dp[i][j] = -1;
        pw.println(f(arr, w, 0, 0, W));
        pw.flush();
        pw.close();
    }
}