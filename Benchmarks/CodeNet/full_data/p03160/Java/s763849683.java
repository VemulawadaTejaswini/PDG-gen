import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //https://atcoder.jp/contests/dp/tasks/dp_a

    private static int[] dp = null;

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        //System.out.println(dfs(arr, n, 0));

        dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(solve(n - 1, arr));
    }

    private static int dfs( int[] arr, int n, int i ) {

        if (i > n) {
            return 0;
        }

        if (i < n) {
            int val = arr[i] - dfs(arr, n, i + 1);
            int val_1 = arr[i] - dfs(arr, n, i + 2);

            return Math.max(Math.abs(val), Math.abs(val_1));
        }
        return 0;
    }

    private static int solve( int i, int[] h ) {
        if (dp[i] != -1)
            return dp[i];

        if (i == 1) //if only element in an array then
            return 0;

        else if (i == 2) //if two elements in array then difference of two will be the cost.
            return Math.abs(h[i] - h[i - 1]);

        else return dp[i] = Math.min(Math.abs(h[i] - h[i - 1]) + solve(i - 1, h)
                    , Math.abs(h[i] - h[i - 2]) + solve(i - 2, h));
    }
}