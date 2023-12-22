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
        String s = sn();
        int n = s.length();
        int mask = 1 << (n - 1);
        long ans = 0;
        for (int i = 0; i < mask; i++) {
            long sum = 0;
            int prev = 0;
            for (int j = 0; j < n - 1; j++) {
                if ((i & (1 << j)) == 0) continue;
                long val = Long.parseLong(s.substring(prev, j + 1));
                sum += val;
                prev = j + 1;
            }
            sum += Long.parseLong(s.substring(prev, n));
            ans += sum;
        }
        out.println(ans);
    }
}