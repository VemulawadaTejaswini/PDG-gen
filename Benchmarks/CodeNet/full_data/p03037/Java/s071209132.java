import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 32768);
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer t;

    static String sn() {
        while (t == null || !t.hasMoreTokens()) {
            try {
                t = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return t.nextToken();
    }

    static int ni() {
        return Integer.parseInt(sn());
    }

    static long nlo() {
        return Long.parseLong(sn());
    }

    public static void main(String args[]) {
        int t = 1;//ni();
        while (t-- > 0) {
            solve();
        }
        out.close();
    }

    static long mod = 998244353;

    static long pro(long a, long b) {
        return (a % mod * b % mod) % mod;
    }

    static long add(long a, long b) {
        return (a + b) % mod;
    }

    static long maxn = 200005;

    static void solve() {
        int n = ni();
        int m = ni();
        int dp[] = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int l = ni() - 1;
            int r = ni() - 1;
            dp[l]++;
            dp[r + 1] -= 1;
        }
        int ans = 0;
        if (dp[0] == m)
            ans += 1;
        for (int i = 1; i < n + 1; i++) {
            dp[i] += dp[i - 1];
            if (dp[i] == m)
                ans++;
        }
        out.println(ans);
    }
}