import java.util.*;

public class Main {

    int[] stones;

    private int getDist(int i, int j) {
        return Math.abs(stones[i] - stones[j]);
    }

    private void run() {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        stones = new int[N];
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) stones[i] = sc.nextInt();
        
        dp[N-1] = 0;
        dp[N-2] = getDist(N-1, N-2);

        for (int i = N-3; i >= 0; i--) {
            int min = dp[i+1] + getDist(i,i+1);
            for (int j = 2; j <= K; j++) {
                if (i + j >= N) break;
                int dist = dp[i+j] + getDist(i,i+j);
                if (dist < min) min = dist;
            }
            dp[i] = min;
        }
        System.out.println(dp[0]);
    }
    public static void main(String[] args) {
        Main solver = new Main();
        solver.run();
    }
}
