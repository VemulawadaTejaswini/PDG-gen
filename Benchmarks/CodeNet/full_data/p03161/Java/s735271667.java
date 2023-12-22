import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int[] dp = null;
    private static final int INF = 1000000005;

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
        //Arrays.fill(dp, -1);

        int val1 = solveBottomUp(arr, k);
        System.out.println(val1);
    }

     private static int solveBottomUp( int[] arr, int k ) {

        //INF : bcz we are comparing Math.min(dp[j] here..
        Arrays.fill(dp, INF);

        //this indicate to reach first stone cost is zero..
        dp[0] = 0;

        for (int i = 0; i < arr.length; i++) {

            //from each stone : frog can jump to next k stones.
            for (int j = i + 1; j <= i + k; j++) {

                if (j < arr.length) {
                    dp[j] = Math.min(dp[j]
                            , dp[i] + Math.abs(arr[i] - arr[j]));
                }
            }
        }

        return dp[arr.length - 1];
    }
}