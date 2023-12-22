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
        DSumOfLargeNumbers solver = new DSumOfLargeNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSumOfLargeNumbers {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // K種類選ぶ時の最小は 0~ K-1の総和、つまり(k-1)k/2
            // 最大はn,n-1...n-k+1なので(2n-k+1)*k/2
            // よってつくれるのは(2n-k+1)*k/2 - (k-1)k/2 + 1

            int n = in.nextInt();
            int k = in.nextInt();
            ModInt res = new ModInt(0);
            for (int i = k; i <= n + 1; i++) {
                res = res.add((long) (2 * n - i + 1) * i / 2 - (long) (i - 1) * i / 2 + 1);
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

        public ModInt add(long l) {
            return new ModInt(this.val + l);
        }

        public long getVal() {
            return val;
        }

        public String toString() {
            return Long.toString(val);
        }

    }
}

