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

    List<Integer>[] g, gg;
    boolean vis[];
    int dist[], ans;
    void dfs(int x, int depth) {
        dist[x] = max(dist[x], depth);
        if(vis[x]) return;
        vis[x] = true;
        for(int edge: g[x]) dfs(edge, depth + 1);
    }

    void dfs2(int x, int depth) {
        ans = max(ans, depth + dist[x]);
        if(vis[x]) return;
        vis[x] = true;
        for(int edge: gg[x]) dfs2(edge, depth + 1);
    }

    void solve() throws Exception {
        int n = nextInt(), m = nextInt();
        g = new ArrayList[n];
        gg = new ArrayList[n];
        dist = new int[n];
        vis = new boolean[n];
        boolean leaf[] = new boolean[n];
        for(int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
            gg[i] = new ArrayList<>();
        }
        while (m-->0) {
            int x = nextInt() - 1, y = nextInt() - 1;
            g[x].add(y);
            gg[y].add(x);
            leaf[y] = true;
        }
        for(int i = 0; i < n; i++) dfs(i, 0);
        for(int i = 0; i < n; i++) leaf[i] = leaf[i] && g[i].size() == 0;
//        for(int i = 0; i < n; i++) out.println(i+1 + " " + dist[i]);
        Arrays.fill(vis, false);
        for(int i = 0; i < n; i++)
            if(leaf[i]) dfs2(i, 0);
        out.print(ans);
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