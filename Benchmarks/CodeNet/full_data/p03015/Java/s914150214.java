import java.util.*;

public class Main {
    public static void main(String[] args) {
        long MOD = 1000000007;
        Scanner sc = new Scanner(System.in);
        String l = sc.next();
        long[] dp1 = new long[l.length() + 1];
        long[] dp2 = new long[l.length() + 1];
        dp1[0] = 2; // 以下未定
        dp2[0] = 1; // 以下確定
        for (int i = 1; i < l.length(); i++) {
            if (l.charAt(i) == '0') {
                dp1[i] = (dp1[i - 1] + dp1[i]) % MOD;
                dp2[i] = (3 * dp2[i - 1] + dp2[i]) % MOD;
            } else {
                dp1[i] = (2L * dp1[i - 1] + dp1[i]) % MOD;
                dp2[i] = (dp1[i - 1] + 3 * dp2[i - 1]) % MOD;
            }
        }
        System.out.println((dp1[l.length() - 1] + dp2[l.length() - 1]) % MOD);
    }
}