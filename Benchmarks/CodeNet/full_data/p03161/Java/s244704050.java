import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.reverse;
import static java.lang.Long.parseLong;
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.exit;

import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    int n, k, h[], dp[];
    int solve(int i) {
        if(i == n-1) return 0;
        if(dp[i] != -1) return dp[i];
        int ans = 1000000000;
        for(int j = 1; j <= k; j++)
        if(i + j < n) ans = min(ans, abs(h[i] - h[i+j]) + solve(i+j));
        return dp[i] = ans;
    }

    void solve() throws Exception {
        n = nextInt(); k = nextInt();
        h = na(n);
        dp = new int[n];
        Arrays.fill(dp, -1);
        out.print(solve(0));
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

    public static boolean nextPermutation(int[] a) {
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
//            in = new BufferedReader(new FileReader("hello.in"));
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(new OutputStreamWriter(System.out));
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