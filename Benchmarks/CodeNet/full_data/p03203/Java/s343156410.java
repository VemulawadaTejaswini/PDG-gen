import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;

import lib.io.ExtendedScanner;
import lib.io.Out;
import lib.util.array.IntArrayFactory;
import lib.util.array.sort.ComparativeMergeSort;

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
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] r = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt() - 1;
            c[i] = sc.nextInt() - 1;
        }
        int[] p = IntArrayFactory.indexToInt(n, i -> i);
        ComparativeMergeSort.sort(p, (u, v) -> {
            if (r[u] == r[v]) {
                return c[u] - c[v];
            } else {
                return r[u] - r[v];
            }
        });
        int k = 0;
        int y = 0, i = 0;
        while (y < h && i < n) {
            while (y < h && y < r[p[i]]) {
                y++;
                k = Math.min(k + 1, w - 1);
            }
            if (k > c[p[i]]) {
                out.writeln(y);
                return;
            }
            k = Math.min(k, c[p[i]] - 1);
            while (i < n && r[p[i]] == y) i++;
        }
        out.writeln(h);
    }
}
