import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N];
        for(int i=0; i<N; i++) {
            h[i] = sc.nextInt();
        }

        int[] dp = new int[N];
        for(int i=0; i<N; i++) {
            dp[i] = (int) Math.pow(10, 9);
        }

        dp[0] = 0;

        for(int x=0; x<N-1; x++){
            for(int b=1; b<=K; b++) {
                if(x+b >= dp.length) {
                    continue;
                }
                dp[x+b] = Math.min(dp[x+b], dp[x] + Math.abs(h[x+b] - h[x]));
            }
        }

        System.out.println(dp[N-1]);
    }
}