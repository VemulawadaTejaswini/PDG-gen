
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int INF = 1000000;
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[INF];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] dp = new int[INF];
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
