import java.io.*;
import java.util.*;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.*;
import static java.lang.Long.parseLong;
import static java.lang.Math.abs;
import static java.lang.System.exit;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws Exception {
        int n = nextInt(), k = nextInt();
        int[] h = na(n), dp = new int[n];
        Arrays.fill(dp, MAX_VALUE);
        dp[0] = 0; dp[1] = abs( h[1] - h[0]);
        for(int i = 2; i < n; i++) {
            for(int j = 1; j <= k; j++)
                if(i - j >= 0)
                    dp[i] = min(dp[i], abs( h[i] - h[i-j]) + dp[i-j]);
        }
        out.println(dp[n-1]);
    }

    // call it like this: lower_bound(a, x + 1) ( /!\ + 1 )
    public static int lower_bound(int[] a, int v) {
        int low = -1, high = a.length;
        while (high - low > 1) {
            int h = high + low >>> 1;
            if (a[h] >= v) {
                high = h;
            } else {
                low = h;
            }
        }
        return high;
    }

    private String getFraction(int a, int b) {
        assert b != 0;
        String sign = (a > 0 && b > 0) || (a < 0) && (b < 0) ? "+" : "-";
        a = abs(a);
        b = abs(b);
        int gcd = gcd(a, b);
        return sign + (a / gcd) + "/" + (b / gcd);
    }

    private int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static int[] radixSort(int[] f) {
        if (f.length < 100) {
            Arrays.sort(f);
            return f;
        }
        int[] to = new int[f.length];
        {
            int[] b = new int[65537];
            for (int i = 0; i < f.length; i++) b[1 + (f[i] & 0xffff)]++;
            for (int i = 1; i <= 65536; i++) b[i] += b[i - 1];
            for (int i = 0; i < f.length; i++) to[b[f[i] & 0xffff]++] = f[i];
            int[] d = f;
            f = to;
            to = d;
        }
        {
            int[] b = new int[65537];
            for (int i = 0; i < f.length; i++) b[1 + (f[i] >>> 16)]++;
            for (int i = 1; i <= 65536; i++) b[i] += b[i - 1];
            for (int i = 0; i < f.length; i++) to[b[f[i] >>> 16]++] = f[i];
            int[] d = f;
            f = to;
            to = d;
        }
        return f;
    }

    public static long pow(long a, long n, long mod) {
        long ret = 1;
        int x = 63 - Long.numberOfLeadingZeros(n);
        for (; x >= 0; x--) {
            ret = ret * ret % mod;
            if (n << 63 - x < 0)
                ret = ret * a % mod;
        }
        return ret;
    }

    public static boolean nextPermutation(Integer[] a) {
        int n = a.length;
        int i;
        for (i = n - 2; i >= 0 && a[i] >= a[i + 1]; i--) ;
        if (i == -1)
            return false;
        int j;
        for (j = i + 1; j < n && a[i] < a[j]; j++) ;
        int d = a[i];
        a[i] = a[j - 1];
        a[j - 1] = d;
        for (int p = i + 1, q = n - 1; p < q; p++, q--) {
            d = a[p];
            a[p] = a[q];
            a[q] = d;
        }
        return true;
    }

    void print(Object x) {
        out.print(String.valueOf(x));
        out.flush();
    }

    void println(Object x) {
        out.println(String.valueOf(x));
        out.flush();
    }

    // for Map with custom key/value, override toString in your custom class
    void printMap(Map map) {
        if (map.keySet().size() == 0) return;
        Object firstValue = map.keySet().iterator().next();
        if (map.get(firstValue) instanceof Queue || map.get(firstValue) instanceof List) {
            for (Object key : map.keySet()) {
                out.print(String.valueOf(key) + ": ");
                Collection values = (Collection) map.get(key);
                for (Object value : values) out.print(String.valueOf(value) + " ");
                out.println();
            }
        } else if (map.get(firstValue).getClass().isArray()) {
            for (Object key : map.keySet()) {
                out.print(String.valueOf(key) + ": ");
                Object[] values = (Object[]) map.get(key);
                for (Object value : values) out.print(String.valueOf(value) + " ");
                out.println();
            }
        } else {
            for (Object key : map.keySet()) {
                out.println(String.valueOf(key) + ": " + map.get(key));
            }
        }
    }

    private int[] na(int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = nextInt();
        return a;
    }

    private long[] nal(int n) throws IOException {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = nextLong();
        return a;
    }

    int nextInt() throws IOException {
        return parseInt(next());
    }

    long nextLong() throws IOException {
        return parseLong(next());
    }

    double nextDouble() throws IOException {
        return parseDouble(next());
    }

    String next() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    public static void main(String[] args) throws Exception {
        try {
            boolean isLocal = false;
            if (isLocal) {
                in = new BufferedReader(new FileReader("solution.in"));
                out = new PrintWriter(new BufferedWriter(new FileWriter("solution.out")));
            } else {
                in = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(new OutputStreamWriter(System.out));
            }

            //long lStartTime = System.currentTimeMillis();
            new Main().solve();
            //long lEndTime = System.currentTimeMillis();
            //out.println("Elapsed time in seconds: " + (double)(lEndTime - lStartTime) / 1000.0);
            in.close();
            out.close();
        } catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}