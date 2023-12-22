import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int[] dp = null;

    //https://atcoder.jp/contests/dp/tasks/dp_b
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        dp = new int[n + 1];
        Arrays.fill(dp, -1);

        int val = solveTopDown(n - 1, arr, k);
        System.out.println(val);
    }

    private static int solveTopDown( int i, int[] arr, int k ) {
        if (dp[i] != -1) {
            return dp[i];
        }

        if (i == 0) { //if one element left
            dp[i] = 0;
            return dp[i];
        }

        int min = Integer.MAX_VALUE;

        //for each stone frog want to Jump K steps..
        for (int p = k; p >= 1; p--) {

            //if frog can jump at-least one stone..using zero bcz we are using zero based indexing
            if (i - p >= 0) {
                min = Math.min(min, solveTopDown(i - p, arr, k) + Math.abs(arr[i] - arr[i - p]));
            }
        }

        return dp[i] = min;
    }
}