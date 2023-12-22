import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int[] h = new int[N];
        int[] dp = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = s.nextInt();
            dp[i] = 10_000;
        }

        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            for (int k = i + 1; k <= i + K; k++) {
                if (k < N) {
                    // @formatter:off
                    System.err.printf("i%s k%s dp%s dp[%s]%s dp[%s]%s + abs%s = %s\n",
                            i,
                            k,
                            toStringArr(dp),
                            k, dp[k],
                            i, dp[i],
                            Math.abs(h[i] - h[k]),
                            dp[i] + Math.abs(h[i] - h[k]));
                    dp[k] = Math.min(dp[k], dp[i] + Math.abs(h[i] - h[k]));
                    // @formatter:on
                }
            }
        }
        System.out.println(dp[N - 1]);
    }

    public static String toStringArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i : arr) {
            sb.append(i);
            sb.append(" ");
        }
        sb.append("]");

        return sb.toString();
    }
}
