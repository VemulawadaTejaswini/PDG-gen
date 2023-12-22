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

    static class up implements Comparable<up> {
        int a;
        long b;

        up(int a, long b) {
            this.a = a;
            this.b = b;
        }

        public int compareTo(up o) {
            return (int) (this.b - o.b);
        }
    }

    static void solve() {
        int n = ni();
        int m = ni();
        long sum = 0;
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nlo();
        }
        Arrays.sort(a);
        up p[] = new up[m];
        for (int i = 0; i < m; i++) {
            int b = ni();
            long c = nlo();
            p[i] = new up(b, c);
        }
        Arrays.sort(p);
        int cur = m - 1;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (cur >= 0 && p[cur].b > a[i]) {
                a[i] = p[cur].b;
                cnt += 1;
                if (cnt == p[cur].a) {
                    cnt = 0;
                    cur -= 1;
                }
            } else
                break;
        }
        for (int i = 0; i < n; i++)
            sum += a[i];
        out.println(sum);
    }
}