import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            double[] x = new double[n];
            String u[] = new String[n];
            for (int i = 0; i < n; i++) {
                x[i] = Double.parseDouble(in.next());
                u[i] = in.next();
            }
            double ans = 0.0;
            final double parbtc = 380000.0;

            for (int i = 0; i < n; i++) {
                if ("JPY".equals(u[i])) {
                    ans += x[i];
                } else {
                    ans += x[i] * parbtc;
                }
            }
            // 出力
            out.printf("%f\n", ans);

        }

    }
}

