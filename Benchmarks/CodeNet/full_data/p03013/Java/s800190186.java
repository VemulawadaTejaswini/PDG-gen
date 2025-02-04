import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private static BigInteger[] dp;
    private static int goal;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        dp = new BigInteger[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = BigInteger.ZERO;
        }

        goal = n;

        for (int i = 0; i < m; i++) {
            dp[sc.nextInt()] = new BigInteger("-1");
        }

        solve(0);

        System.out.println(dp[0].mod(new BigInteger("1000000007")));
    }

    private static BigInteger solve(int step) {
        if (step == goal) {
            return BigInteger.ONE;
        } else if (step > goal || dp[step].signum() < 0) {
            return BigInteger.ZERO;
        }

        if (dp[step].signum() > 0) {
            return dp[step];
        }

        return dp[step] = solve(step + 1).add(solve(step + 2));
    }
}