import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i=0; i<n; i++) h[i] = sc.nextInt();
        int[] dp = new int[n+1];
        for (int i=1; i<n+1; i++) dp[i] = Integer.MAX_VALUE;

        for (int i=0; i<n; i++) {
            for (int j=1; j<=k; j++) {
                if (i+j < n) dp[i+j] = Math.min(dp[i+j], (dp[i]+Math.abs(h[i+j]-h[i])));
            }
        }

        System.out.println(dp[n-1]);

    }
}


