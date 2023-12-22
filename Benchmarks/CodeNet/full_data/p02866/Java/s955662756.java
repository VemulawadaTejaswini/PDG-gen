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
        BCountingOfTrees solver = new BCountingOfTrees();
        solver.solve(1, in, out);
        out.close();
    }

    static class BCountingOfTrees {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            // cntする
            // 0->1, 1->x, 2->yなら1^x * x^yとなる
            // 0の根付き木だと思えばいい.
            int n = in.nextInt();
            int[] cnt = new int[n];
            ModInt res = new ModInt(1);
            int max = 0;
            for (int i = 0; i < n; i++) {
                int d = in.nextInt();
                if (i > 0 ^ d > 0) {
                    out.println(0);
                    return;
                }
                cnt[d]++;
                max = Math.max(max, d);
            }
            res.changeMOD(998244353);
            for (int i = 1; i < max; i++) {
                res = res.mul((long) Math.pow(cnt[i], cnt[i + 1]));
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

        public void changeMOD(int nMOD) {
            this.MOD = nMOD;
        }

        public String toString() {
            return Long.toString(val);
        }

    }
}

