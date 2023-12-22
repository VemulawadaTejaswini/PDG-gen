import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        long max = 0;

        int cnt = n / 2;
        long[][] dp = new long[cnt+1][3];

        for (int i=1; i<=cnt; i++) {
            dp[i][0] = dp[i-1][0] + arr[2*i-2];
        }
        
        max = Math.max(max, dp[cnt][0]);

        for (int i=1; i<=cnt; i++) {
            dp[i][1] = Math.max( (dp[i-1][1]+arr[2*i-1]) , (dp[i-1][0]+arr[2*i-1]) );
        }

        max = Math.max(max, dp[cnt][1]);

        if (n%2 == 1) {
            for (int i=1; i<=cnt; i++) {
                dp[i][2] = Math.max((dp[i-1][2]+arr[2*i]), (
                        Math.max((dp[i-1][0]+arr[2*i]), (dp[i-1][1]+arr[2*i]))
                        ));
            }
            max = Math.max(max, dp[cnt][2]);
        }

        System.out.println(max);

    }

}
