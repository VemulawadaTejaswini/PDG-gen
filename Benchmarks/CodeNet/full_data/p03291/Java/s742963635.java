import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        DWeLoveABC solver = new DWeLoveABC();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWeLoveABC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            String s = in.next();
            ModInt[] mi = new ModInt[4];
            Arrays.fill(mi, new ModInt(0));
            ModInt res = new ModInt(0);

            if (s.charAt(0) == 'A') {
                mi[0] = mi[0].add(1);
                mi[1] = mi[1].add(1);
            }
            if (s.charAt(0) == '?') {
                mi[0] = mi[0].add(3);
                mi[1] = mi[1].add(1);
            }

            for (int i = 1; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '?') {
                    mi[3] = mi[3].mul(3).add(mi[2]);
                    mi[2] = mi[2].mul(3).add(mi[1]);
                    mi[1] = mi[1].mul(3).add(mi[0]);
                    mi[0] = mi[0].mul(3);
                }
                if (c == 'C') {
                    mi[3] = mi[3].add(mi[2]);
                }
                if (c == 'B') {
                    mi[2] = mi[2].add(mi[1]);
                }
                if (c == 'A') {
                    mi[1] = mi[1].add(mi[0]);
                }
            }

            out.println(mi[3].getVal());

        }

    }

    static class ModInt {
        long val;
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

        public ModInt add(ModInt m) {
            return new ModInt(this.val + m.getVal());
        }

        public long getVal() {
            return val;
        }

        public String toString() {
            return "ModInt{" +
                    "val=" + val +
                    ", MOD=" + MOD +
                    '}';
        }

    }
}

