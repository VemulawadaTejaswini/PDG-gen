import java.util.Scanner;
public class Main {
    static final long MOD = 998_244_353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        long ans = 0;
        long[] dp = new long[S + 1]; // dp[S]:= f(L,R) when A_i is used or not.
        for (int i = 0; i < N; i++) {
            // Case when A[i] is not used. This is a seed scaffold.
            dp[0] += 1;

            for (int j = S; j >= A[i]; j--) {
                dp[j] += dp[j - A[i]];
                dp[j] %= MOD;
            }
            ans += dp[S];
            ans %= MOD;
        }
        System.out.println(ans);
    }
}