import java.util.*;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

    static final Scanner in = new Scanner(System.in);
    static final PrintWriter out = new PrintWriter(System.out,false);
    static boolean debug = false;

    static void solve() {
        int n = in.nextInt();
        long l = in.nextInt();
        long t = in.nextInt();
        
        long[] ans = new long[n];
        long[] w = new long[n];
        long[] x = new long[n];

        for (int i=0; i<n; i++) {
            ans[i] = in.nextInt();
            x[i] = ans[i];
            w[i] = in.nextInt();
            if (w[i] == 1) {
                ans[i] = (ans[i] + t)%l;
            } else {
                ans[i] = (ans[i] - t + l)%l;
            }
        }

        dump(ans);
        int cnt = 0;
        dump(w);

        for (int i=1; i<n; i++) {
            if (w[0] == 1 && w[i] == 2) {
                if (x[0] < x[i] && x[i]-t < x[0]+t) {
                    cnt++;
                }
            }
            else if (w[0] == 2 && w[i] == 1) {
               if (t <= l || ans[i] < ans[0]) {
                    cnt++;
               } 
            }
        }

        // out.println(cnt);

        for (int i=(w[0] == 1 ? n-cnt : cnt), j=0; j<n; i=(i+1)%n, j++) {
            out.println(ans[i]);
        }
    }

    public static void main(String[] args) {
        debug = args.length > 0;
        long start = System.nanoTime();

        solve();
        out.flush();

        long end = System.nanoTime();
        in.close();
        out.close();
    }

    static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}