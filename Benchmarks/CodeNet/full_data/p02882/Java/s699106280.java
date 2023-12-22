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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            double a = Double.parseDouble(in.next());
            double b = Double.parseDouble(in.next());
            double x = Double.parseDouble(in.next());
            double ans = 0;
            x /= a;

            if (x > (a * b) / 2) {
                ans = Math.atan2((a * b - x) * 2, a * a) * 180 / Math.PI;
            } else {
                ans = Math.atan2(b * b, x * 2) * 180 / Math.PI;
            }

            // 出力
            out.printf("%.10f\n", ans);

        }

    }
}

