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
        DWeLikeAGC solver = new DWeLikeAGC();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWeLikeAGC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            ModInt[][] dp = new ModInt[n + 1][64];
            ModInt[] tmp = new ModInt[64];
            ModInt res = new ModInt(0);

            for (int i = 0; i < 64; i++) {
                if (i == 6 || i == 9 || i == 33) {
                    dp[3][i] = new ModInt(0);
                } else {
                    dp[3][i] = new ModInt(1);
                }
            }

            for (int i = 3; i < n; i++) {
                Arrays.fill(tmp, new ModInt(0));
                for (int j = 0; j < 64; j++) {
                    for (int k = 0; k < 4; k++) {
                        if ((j / 4 == 2 || (j / 16 == 0 && j % 4 == 2)) && k == 1) {
                            continue;
                        }
                        tmp[(j * 4 + k) % 64] = tmp[(j * 4 + k) % 64].add(dp[i][j]);
                    }
                }

                for (int j = 0; j < 64; j++) {
                    if (j != 33 && j != 6 && j != 9) {
                        dp[i + 1][j] = tmp[j];
                    } else {
                        dp[i + 1][j] = new ModInt(0);
                    }
                }
            }


            for (int i = 0; i < 64; i++) {
                res = res.add(dp[n][i]);
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

        public ModInt add(ModInt m) {
            return new ModInt(this.val + m.getVal());
        }

        public long getVal() {
            return val;
        }

        public String toString() {
            return Long.toString(val);
        }

    }
}

