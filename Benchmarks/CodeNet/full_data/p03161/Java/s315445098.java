
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int INF = 10000000;
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[INF];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        long[] dp = new long[INF];
        Arrays.fill(dp,INF);
        dp[0] = 0;

        for(int j = 0; j < N; j++) {
            for(int k = 1; k <= K; k++) {
                dp[j+k] = Math.min(dp[j+k],dp[j] + Math.abs(arr[j] - arr[j+k]));
            }
        }
        System.out.println(dp[N-1]);
    }
}
