import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        String str = sc.next();
        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = str.charAt(i) - '0';
        }

        int[][] dp = new int[2][p];

        for (int j = 0; j < p; j++) {
            dp[0][j] = 0;
            if ((s[0] % p) == j) {
                dp[0][j] = 1;
            }
        }

        long ans = dp[0][0];
        for (int i = 1; i < n; i++) {
            int next = i%2;
            int prev = 1-next;
            for(int j = 0; j < p; j++){
                dp[next][j] = 0;
            }
            for (int j = 0; j < p; j++) {
                dp[next][(j * 10 + s[i]) % p] += dp[prev][j];
                if ((s[i] % p) == j) {
                    dp[next][j] += 1;
                }
            }
            ans += dp[next][0];
        }

        System.out.println(ans);
    }
}
