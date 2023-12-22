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
        ESumOfGcdOfTuplesHard solver = new ESumOfGcdOfTuplesHard();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESumOfGcdOfTuplesHard {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // gcd(a,b,c) -> x となるような組の数をメモしておく
            int n = in.nextInt();
            int k = in.nextInt();
            ModInt[] mem = new ModInt[k + 1];
            ModInt res = new ModInt(0);
            for (int i = k; i >= 1; i--) {
                mem[i] = new ModInt(k / i).pow(n);
                for (int j = i * 2; j <= k; j += i) {
                    mem[i] = mem[i].sub(mem[j]);
                }
                res = res.add(mem[i].mul(i));
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

        public ModInt add(ModInt m) {
            return new ModInt(this.val + m.getVal());
        }

        public ModInt sub(ModInt m) {
            return new ModInt(this.val - m.getVal());
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

        public long getVal() {
            return val;
        }

        public String toString() {
            return Long.toString(val);
        }

    }
}

