import java.util.Scanner;

public class Main {

    private static long[] dp;
    private static int goal;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();


//        a = new int[m];
//        for (int i = 0; i < m; i++) {
//            a[i] = sc.nextInt();
//        }

        dp = new long[n + 1];
        goal = n;

        for (int i = 0; i < m; i++) {
            dp[sc.nextInt()] = -1;
        }

        solve(0);

        System.out.println(dp[0] % 1000000007);
    }

    private static long solve(int step) {
        if (step == goal) {
            return 1;
        } else if (step > goal || dp[step] < 0) {
            return 0;
        }

        if (dp[step] > 0) {
            return dp[step];
        }

        return dp[step] = solve(step + 1) + solve(step + 2);
    }
}