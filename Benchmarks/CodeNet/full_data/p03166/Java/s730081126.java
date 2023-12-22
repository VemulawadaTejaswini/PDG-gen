import java.util.Scanner;

/**
 * Longest Path
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] X = new int[M];
            int[] Y = new int[M];
            for (int i = 0; i < M; i++) {
                X[i] = sc.nextInt();
                Y[i] = sc.nextInt();
            }

            long[] dp = new long[N + 1];

            for (int k = 0; k < N; k++) {
                for (int i = 0; i < M; i++) {
                    if (dp[X[i]] == k) {
                        dp[Y[i]] = k + 1;
                    }
                }
            }

            long max = 0;
            for (int i = 1; i <= N; i++) {
                max = Math.max(max, dp[i]);
            }

            System.out.println(max);
        }
    }

}
