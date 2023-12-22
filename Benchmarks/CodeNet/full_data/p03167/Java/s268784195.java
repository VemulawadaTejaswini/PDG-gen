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
        HGrid1 solver = new HGrid1();
        solver.solve(1, in, out);
        out.close();
    }

    static class HGrid1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int h = in.nextInt();
            int w = in.nextInt();
            char[][] c = new char[h][w];
            ModInt[][] m = new ModInt[h][w];
            for (int i = 0; i < h; i++) {
                c[i] = in.next().toCharArray();
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    m[i][j] = new ModInt(0);
                }
            }

            m[0][0] = new ModInt(1);

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (c[i][j] == '.') {
                        if (i > 0) {
                            // 左からこれる
                            m[i][j] = m[i][j].add(m[i - 1][j]);
                        }
                        if (j > 0) {
                            m[i][j] = m[i][j].add(m[i][j - 1]);
                        }
                    }
                }
            }

            out.println(m[h - 1][w - 1].getVal());


        }

    }

    static class ModInt {
        long val;
        int MOD = (int) 1e9 + 7;

        public ModInt(long i) {
            this.val = (int) ((i + MOD) % MOD);
        }

        public ModInt add(ModInt m) {
            return new ModInt(this.val + m.getVal());
        }

        public long getVal() {
            return val;
        }

    }
}

