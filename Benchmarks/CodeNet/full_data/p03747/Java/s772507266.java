import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;

import lib.io.ExtendedScanner;
import lib.io.Out;

public class Main {
    public static void main(String[] args) throws Exception {
        Field f = System.out.getClass().getDeclaredField("autoFlush");
        f.setAccessible(true);
        f.set(System.out, false);
        execute(System.in, System.out);
    }

    public static void execute(InputStream in, OutputStream out) {
        ExtendedScanner s = new ExtendedScanner(in);
        Out o = new Out(out);
        solve(s, o);
        o.flush();
        o.close();
    }

    public static void solve(ExtendedScanner sc, Out out) {
        int n = sc.nextInt();
        int l = sc.nextInt();
        int t = sc.nextInt();
        int[] x = new int[n];
        boolean[] clk = new boolean[n];
        int m = 0;
        int v = -1;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            clk[i] = sc.nextInt() == 1;
            if (!clk[i]) m++;
            else v = i;
        }
        int col = 0;
        if (0 < m && m < n) {
            int[] rvs = new int[m];
            for (int i = 0, idx = 0; i < n; i++) {
                if (!clk[i]) {
                    rvs[idx++] = v > i ? x[i] - x[v] + l : x[i] - x[v];
                }
            }
            Arrays.sort(rvs);
            for (int j = 0; j < m; j++) {
                long ll = -1, rr = 2 * t + 1;
                while (rr - ll > 1) {
                    long mm = (ll + rr) >> 1;
                    if (2 * t > rvs[j] + mm * l) ll = mm;
                    else rr = mm;
                }
                col += rr % n;
                if (col >= n) col -= n;
            }
        }
        int dv = (x[(v - col + n) % n] + t) % l;
        int[] dst = new int[n];
        for (int i = 0; i < n; i++) {
            if (clk[i]) {
                dst[i] = (x[i] + t) % l;
            } else {
                dst[i] = (x[i] - t) % l;
                if (dst[i] < 0) dst[i] += l;
            }
            dst[i] -= dv;
            if (dst[i] < 0) dst[i] += l;
        }
        Arrays.sort(dst);
        for (int i = 0; i < n; i++) {
            out.writeln((dst[(i + n - v) % n] + dv) % l);
        }
    }
}
