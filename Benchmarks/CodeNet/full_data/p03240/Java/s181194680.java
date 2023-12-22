import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author naruse
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Pyramid solver = new Pyramid();
        solver.solve(1, in, out);
        out.close();
    }

    static class Pyramid {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long x[] = new long[n];
            long y[] = new long[n];
            long h[] = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
                h[i] = in.nextInt();
            }
            for (int i = 0; i < 101; i++) {
                for (int j = 0; j < 101; j++) {
                    long nowh = Math.max(h[0] + Math.abs(i - x[0]) + Math.abs(j - y[0]), 0);
                    boolean ok = (nowh > 0);
                    for (int k = 1; k < n; k++) {
                        if (nowh != Math.max(h[k] + Math.abs(i - x[k]) + Math.abs(j - y[k]), 0)) {
                            ok = false;
                        }
                    }
                    if (ok) {
                        out.println(i + " " + j + " " + nowh);
                        return;
                    }
                }
            }
        }

    }
}

