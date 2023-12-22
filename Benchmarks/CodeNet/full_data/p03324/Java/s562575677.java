import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPatisserieABC solver = new DPatisserieABC();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPatisserieABC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            long[] x = new long[n];
            long[] y = new long[n];
            long[] z = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextLong();
                y[i] = in.nextLong();
                z[i] = in.nextLong();
            }
            long mv = 0;
            for (int xd : new int[]{1, -1}) {
                for (int yd : new int[]{1, -1}) {
                    for (int zd : new int[]{1, -1}) {
                        long v = 0;
                        for (int i = 0; i < n; i++) {
                            v = Math.max(v, v + (x[i] * xd) + (y[i] * yd) + (z[i] * zd));
                        }
                        if (v < mv) {
                            System.out.println(xd + "," + yd + "," + zd);
                        }
                        mv = Math.max(mv, v);
                    }
                }
            }
            out.println(mv);
        }

    }
}

