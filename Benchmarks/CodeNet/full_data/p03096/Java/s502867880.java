import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1_000_000_007;
        int N = sc.nextInt();
        int[] index = new int[200000];
        Arrays.fill(index, -1);
        int before = -1;

        long[] dp = new long[N+1];
        dp[0] = 1;
        for (int i=0;i<N;i++) {
            int C = sc.nextInt()-1;
            if (index[C]==-1) dp[i+1] = dp[i];
            else {
                if (before!=C) dp[i+1] = (dp[i]+dp[index[C]])%mod;
                else dp[i+1] = dp[i];
            }
            before =  C;
            index[C] = i+1;
        }
        System.out.println(dp[N]);
    }
}