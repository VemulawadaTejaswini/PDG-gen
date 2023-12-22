import java.util.Arrays;
import java.util.Scanner;

class A {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] h = new int[N];
        for (int i = 0; i < N; i++)
            h[i] = sc.nextInt();
        final int[] dp = new int[N];
        Arrays.setAll(dp, i -> i > 0 ? Integer.MAX_VALUE : 0);
        for (int i = 0; i < N; i++) {
            if (i >= 1)
                dp[i] = Math.min(dp[i], dp[i - 1] + Math.abs(h[i] - h[i - 1]));
            if (i >= 2)
                dp[i] = Math.min(dp[i], dp[i - 2] + Math.abs(h[i] - h[i - 2]));
        }
        System.out.println(dp[N - 1]);
    }
}
public class Main {
    public static void main(String... args) {
        A.main();
    }
}
