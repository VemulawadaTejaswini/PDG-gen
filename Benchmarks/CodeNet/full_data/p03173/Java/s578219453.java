import java.util.Scanner;

public class Main {
    public long solve(int n, int []arr) {
        long [][]dp = new long[n][n];

        for(int i = 0; i < n - 1; i++) {
            dp[i][i + 1] = arr[i] + arr[i + 1];
        }

        long []sum = new long[n];
        sum[0] = arr[0];
        for(int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }

        for(int len = 2; len < n; len++) {
            for(int start = 0; start + len < n; start++) {
                int end = start + len;
                dp[start][end] = (long) 1e18;

                for(int cut = start; cut < end; cut++) {
                    long rangeSum = sum[end] - (start == 0 ? 0 : sum[start - 1]);
                    dp[start][end] = Math.min(dp[start][cut] + dp[cut + 1][end] + rangeSum, dp[start][end]);
                }
            }
        }

        return dp[0][n - 1];
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(new Main().solve(n, arr));
    }
}