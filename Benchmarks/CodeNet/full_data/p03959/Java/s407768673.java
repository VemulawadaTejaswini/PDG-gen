import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CTwoAlpinist solver = new CTwoAlpinist();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTwoAlpinist {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] t = new int[n];
            int[] a = new int[n];
            boolean[] ft = new boolean[n];
            boolean[] fa = new boolean[n];
            ModInt res = new ModInt(1);
            for (int i = 0; i < n; i++) {
                t[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    ft[i] = true;
                } else if (t[i] != t[i - 1]) {
                    ft[i] = true;
                } else {
                    ft[i] = false;
                }
            }

            for (int i = n - 1; i >= 0; i--) {
                if (i == n - 1) {
                    fa[i] = true;
                } else if (a[i] != a[i + 1]) {
                    fa[i] = true;
                } else {
                    fa[i] = false;
                }
            }

            for (int i = 0; i < n; i++) {
                if (ft[i] && fa[i]) {
                    if (t[i] != a[i]) {
                        res = res.mul(0);
                    }
                } else if (ft[i] && !fa[i]) {
                    if (a[i] < t[i]) {
                        res = res.mul(0);
                    }
                } else if (!ft[i] && fa[i]) {
                    if (t[i] < a[i]) {
                        res = res.mul(0);
                    }
                } else {
                    res = res.mul(Math.min(t[i], a[i]));
                }
            }
            out.println(res.getVal());


        }

    }

    static class ModInt {
        long val;
        int MOD = (int) 1e9 + 7;

        public ModInt(long i) {
            this.val = (i + MOD) % MOD;
        }

        public ModInt mul(long l) {
            return new ModInt(this.val * l);
        }

        public long getVal() {
            return val;
        }

        public String toString() {
            return Long.toString(val);
        }

    }
}

