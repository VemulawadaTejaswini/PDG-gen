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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            ModComb mc = new ModComb(200005);
            mc.makeFac();
            ModInt res = new ModInt(0);
            for (int i = 0; i < h - a; i++) {
                res = res.add(mc.combFac(b - 1 + i, i).mul(mc.combFac(w - b - 1 + h - 1 - i, h - 1 - i).getVal()).getVal());
            }
            out.println(res.getVal());
        }

    }

    static class ModInt {
        int val;
        int MOD = (int) 1e9 + 7;

        public ModInt(long i) {
            this.val = (int) ((i + MOD) % MOD);
        }

        public ModInt add(long l) {
            return new ModInt(this.val + l);
        }

        public ModInt mul(long l) {
            return new ModInt(this.val * l);
        }

        public ModInt inv() {
            return this.pow(MOD - 2);
        }

        public ModInt pow(long l) {
            ModInt res = new ModInt(1);
            ModInt v = new ModInt(this.val);
            while (l > 0) {
                if (l % 2 != 0) {
                    res = res.mul(v.val);
                }
                v = v.mul(v.val);
                l /= 2;
            }
            return res;
        }

        public int getVal() {
            return val;
        }

    }

    static class ModComb {
        int size;
        ModInt[] fac;
        ModInt[] inv;

        public ModComb(int n) {
            size = n;
            fac = new ModInt[n + 1];
            inv = new ModInt[n + 1];
        }

        public void makeFac() {
            for (int i = 0; i <= size; i++) {
                if (i == 0) {
                    fac[i] = new ModInt(1);
                } else {
                    fac[i] = fac[i - 1].mul(i);
                }
                inv[i] = fac[i].inv();
            }


        }

        public ModInt combFac(int n, int k) {
            if (n < k) {
                return new ModInt(0);
            }
            return fac[n].mul(inv[k].getVal()).mul(inv[n - k].getVal());
        }

    }
}

