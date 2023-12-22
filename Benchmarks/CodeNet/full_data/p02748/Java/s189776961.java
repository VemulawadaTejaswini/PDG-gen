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
        BNiceShopping solver = new BNiceShopping();
        solver.solve(1, in, out);
        out.close();
    }

    static class BNiceShopping {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 最小値同士か割引を試せばよい
            int a = in.nextInt();
            int b = in.nextInt();
            int m = in.nextInt();
            int[] ref = new int[a];
            int[] wav = new int[b];
            int mre = Integer.MAX_VALUE;
            int mwa = Integer.MAX_VALUE;
            int res = Integer.MAX_VALUE;
            for (int i = 0; i < a; i++) {
                ref[i] = in.nextInt();
                mre = Math.min(mre, ref[i]);
            }
            for (int i = 0; i < b; i++) {
                wav[i] = in.nextInt();
                mwa = Math.min(mwa, wav[i]);
            }

            res = Math.min(res, mre + mwa);

            for (int i = 0; i < m; i++) {
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
                int n = in.nextInt();
                res = Math.min(res, ref[x] + wav[y] - n);
            }

            out.println(res);
        }

    }
}

