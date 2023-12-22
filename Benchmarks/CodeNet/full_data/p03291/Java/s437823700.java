
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.util.*;

public class Main {
    long MOD = (long) 1e9 + 7;

    InputStream in;
    OutputStream out;

    public Main() {
        this(System.in, System.out);
    }

    public Main(InputStream in, OutputStream out) {
        this.in = in;
        this.out = out;
    }

    void run() {
        Scanner sc = new Scanner(this.in);
        PrintWriter out = new PrintWriter(this.out);

        // write your code
        String s = sc.next();

        int l = s.length();
        int[] a = new int[l + 1], ax = new int[l + 1];
        int[] c = new int[l + 1], cx = new int[l + 1];
        long[] pow = new long[l + 1];
        pow[0] = 1;

        for (int i = 0; i < l; i++) {
            a[i + 1] += a[i];
            ax[i + 1] += ax[i];
            c[l - i - 1] += c[l - i];
            cx[l - i - 1] += cx[l - i];
            pow[i + 1] = pow[i] * 3;

            switch (s.charAt(i)) {
                case 'A':
                    a[i + 1]++;
                    break;
                case '?':
                    ax[i + 1]++;
            }
            switch (s.charAt(l - i - 1)) {
                case 'C':
                    c[l - i - 1]++;
                    break;
                case '?':
                    cx[l - i - 1]++;
            }
        }

//        debug(a, ax);
//        debug(c, cx);

        long ans = 0;
        for (int i = 1; i < l - 1; i++) {
            if (s.charAt(i) == 'B' || s.charAt(i) == '?') {
                long cnt = 0;
                long x1 = 1L * a[i] * c[i + 1] % MOD * pow[ax[i]] % MOD * pow[cx[i + 1]] % MOD;
                long x2 = (cx[i + 1] > 0) ? 1L * a[i] * cx[i + 1] % MOD * pow[ax[i]] % MOD * pow[cx[i + 1] - 1] % MOD : 0;
                long x3 = (ax[i] > 0) ? 1L * ax[i] * c[i + 1] % MOD * pow[ax[i] - 1] % MOD * pow[cx[i + 1]] % MOD : 0;
                long x4 = (ax[i] > 0 && cx[i + 1] > 0) ? 1L * ax[i] * cx[i + 1] % MOD * pow[ax[i] - 1] % MOD * pow[cx[i + 1] - 1] % MOD : 0;
//                debug(x1, x2, x3, x4);
                ans = (ans + x1 + x2 + x3 + x4) % MOD;
            }
        }

        out.println(ans);

        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}