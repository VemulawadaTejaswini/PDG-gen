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

    static int maxn = 200005;


    static void solve() {
        int n = ni();
        int x = ni();
        int l[] = new int[n];
        for (int i = 0; i < n; i++)
            l[i] = ni();
        int d = 0, cnt = 0;
        if (d <= x)
            cnt += 1;
        for (int i = 1; i <= n; i++) {
            d = d + l[i - 1];
            if (d <= x)
                cnt += 1;
        }
        out.println(cnt);
    }
}