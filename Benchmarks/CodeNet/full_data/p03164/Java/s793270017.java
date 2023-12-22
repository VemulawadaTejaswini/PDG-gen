
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner itr = new Scanner(System.in);
        int N = itr.nextInt();
        int W = itr.nextInt();

        int[] weight = new int[N];
        int[] value = new int[N];

        for (int i = 0; i < N; i++) {
            weight[i] = itr.nextInt();
            value[i] = itr.nextInt();
        }

        int[] dp = new int[100001];

        Arrays.fill(dp, Integer.MAX_VALUE);

        //dp[value[0]] = weight[0];

        for (int i = 0; i < N; i++) {
            int[] newdp = Arrays.copyOf(dp, 100001);

            if (weight[i] <= W)
                newdp[value[i]] = Math.min(dp[value[i]], weight[i]);

            for (int j = 0; j <= 100000; j++) {
                if ((dp[j] != Integer.MAX_VALUE) && (dp[j] + weight[i] <= W)) {
                    newdp[j + value[i]] = Math.min(dp[j + value[i]], dp[j] + weight[i]);
                }
            }
            dp = newdp;
        }

        int res = 0;
        for (int i = 0; i <= 100000; i++) {
            if (dp[i] != Integer.MAX_VALUE)
                res = i;
        }
        System.out.println(res);
    }
}
