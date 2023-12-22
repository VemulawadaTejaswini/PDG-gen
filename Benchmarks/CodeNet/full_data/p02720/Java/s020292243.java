

import java.io.*;
import java.text.*;
import java.util.*;

public class Main {

    static InputReader sc = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        solver s = new solver();
        int t = 1;
        while (t > 0) {
            s.solve();
            t--;
        }
        out.close();
    }

    static class InputReader {

        public BufferedReader br;
        public StringTokenizer token;

        public InputReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream), 32768);
            token = null;
        }

        public String sn() {
            while (token == null || !token.hasMoreTokens()) {
                try {
                    token = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return token.nextToken();
        }

        public int ni() {
            return Integer.parseInt(sn());
        }

        public String snl() throws IOException {
            return br.readLine();
        }

        public long nlo() {
            return Long.parseLong(sn());
        }

        public double nd() {
            return Double.parseDouble(sn());
        }

        public int[] na(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.ni();
            return a;
        }

        public long[] nal(int n) {
            long a[] = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nlo();
            return a;
        }
    }

    static int inf = 5000013;

    static class solver {
        DecimalFormat df = new DecimalFormat("0.00000000");
        long max = 1000000000000l, min = -10000000000000l;
        long mod = (long) 1e9 + 7;

        long pro(long a, long b) {
            return (a % mod * b % mod) % mod;
        }

        long add(long a, long b) {
            return (a + b) % mod;
        }

        long ncr3(long n) {
            return (n * (n - 1) * (n - 2)) / 6l;
        }

        long ncr2(long n) {
            return n * (n - 1) / 2l;
        }

        long modPow(long x, long y) {
            long res = 1l;
            x = x % mod;
            while (y > 0) {
                if (y % 2 != 0)
                    res = pro(res, x);
                x = pro(x, x);
                y = y >> 1;
            }
            return res;
        }

        int MAXN = 200005;
        int n = 10, k;

        void solve() {
            k = sc.ni();
            digit(0, 0, 0, "");
            out.println(ans);
        }

        long ans = -1;
        int cnt = 0;

        void digit(int i, int last, int f, String s) {
            if (i == n) {
                long t = Long.parseLong(s);
                if (t > 0)
                    cnt += 1;
                if (cnt == k)
                    ans = t;
                return;
            }
            for (int j = 0; j <= 9; j++) {
                if (last == 0 && f == 0) {
                    int f1 = f;
                    if (j > 0)
                        f1 = 1;
                    digit(i + 1, j, f1, s + j);
                } else if (Math.abs(last - j) <= 1) {
                    digit(i + 1, j, f, s + j);
                }
            }
        }
    }
}
