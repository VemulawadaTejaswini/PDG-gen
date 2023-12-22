import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int steps = sc.nextInt();
        int breaks = sc.nextInt();

        int[] br = new int[breaks];
        for (int i = 0; i < breaks; i++) {
            br[i] = sc.nextInt();
        }
        
        long[] dp = new long[steps + 1];
        dp[0] = 1;
        if (steps > 1) {
            if (isBroken(br, 1)) {
                dp[1] = 0;
            } else {
                dp[1] = 1;
            }
        }

        for (int step = 2; step <= steps; step++) {
            dp[step] = 0;
            if (!isBroken(br, step)) {
                dp[step] = dp[step - 1] + dp[step - 2];
            }
        }

        long mod = 1000000007;
        System.out.println(dp[steps] % mod);
    }

    public static boolean isBroken(int[] broken, int step) {
        for (int i = 0; i < broken.length; i++) {
            if (broken[i] == step) {
                return true;
            }
        }
        return false;
    }
}