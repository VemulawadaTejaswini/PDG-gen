import java.util.Scanner;

public class Dp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] h = new int[N];
        for(int i=0; i<N; i++) {
            h[i] = sc.nextInt();
        }

        int[] dp = new int[N];
        int x = 1;
        dp[x] = dp[x-1] + Math.abs(h[x] - h[x-1]);

        for(x=2; x<N; x++){
            dp[x] = Math.min(dp[x-1] + Math.abs(h[x] - h[x-1]), dp[x-2] + Math.abs(h[x] - h[x-2]));
        }

        System.out.println(dp[N-1]);
    }
}