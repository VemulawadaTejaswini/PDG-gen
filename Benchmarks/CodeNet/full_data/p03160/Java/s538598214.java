import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }

        if (N <= 1) {
            System.out.println(0);
            return;
        }
        if (N == 2) {
            System.out.println(Math.abs(h[0] - h[1]));
            return;
        }

        int cur = h[0];
        // calc

        //Math.abs(h[cur] - h[next]);
        int[] dp = new int[N];
        dp[0] = 0;
        dp[1] = Math.abs(h[0] - h[1]);

        for (int i = 2; i < N; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(h[i] - h[i - 1]),
                             dp[i - 2] + Math.abs(h[i] - h[i - 2]));
        }

        int min = dp[N - 1];
        System.out.println(min);
    }
}
