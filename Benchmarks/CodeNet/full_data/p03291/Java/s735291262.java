import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        char[] data = S.toCharArray();
        int len = data.length;
        long mod = 1000000007;
        long[][] dp = new long[len+1][4];
        dp[0][0] = 1;
        for (int i = 0; i < len; i++) {
            if (data[i] != '?') {
                dp[i + 1][0] += dp[i][0];
                dp[i + 1][0] %= mod;
                dp[i + 1][1] += dp[i][1];
                dp[i + 1][1] %= mod;
                dp[i + 1][2] += dp[i][2];
                dp[i + 1][2] %= mod;
                dp[i + 1][3] += dp[i][3];
                dp[i + 1][3] %= mod;
            } else {
                dp[i + 1][0] += dp[i][0] * 3;
                dp[i + 1][0] %= mod;
                dp[i + 1][1] += dp[i][1] * 3;
                dp[i + 1][1] %= mod;
                dp[i + 1][2] += dp[i][2] * 3;
                dp[i + 1][2] %= mod;
                dp[i + 1][3] += dp[i][3] * 3;
                dp[i + 1][3] %= mod;
            }
            if (data[i] == 'A' || data[i] == '?') {
                dp[i + 1][1] += dp[i][0];
                dp[i + 1][1] %= mod;
            }
            if (data[i] == 'B' || data[i] == '?') {
                dp[i + 1][2] += dp[i][1];
                dp[i + 1][2] %= mod;
            }
            if (data[i] == 'C' || data[i] == '?') {
                dp[i + 1][3] += dp[i][2];
                dp[i + 1][3] %= mod;
            }
        }
        System.out.println(dp[len][3]);
    }
}
