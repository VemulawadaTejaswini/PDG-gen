import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] H = new int[N+1];
        for(int i = 1; i < N+1; i++){
            H[i] = sc.nextInt();
        }
        sc.close();
        int[] dp = new int[N+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;
        for(int i = 2; i <= N; i++){
            for(int j = i-1; j >= Math.max(1, i-K); j--){
                dp[i] = Math.min(dp[j] + Math.abs(H[i] - H[j]), dp[i]);
            }
        }
        System.out.println(dp[N]);

    }

}
