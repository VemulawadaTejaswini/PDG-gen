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
            int n = Integer.parseInt(in.next());
            int k = Integer.parseInt(in.next());
            Integer p[] = new Integer[n];
            for (int i = 0; i < n; i++) {
                p[i] = Integer.parseInt(in.next());
            }

            int max = p[0];
            for (int i = 1; i < p.length; i++) {
                int v = p[i];
                if (v > max) {
                    max = v;
                }
            }

            double s[] = new double[n + max];
            s[0] = 0.0;
            s[1] = 1.0;
            for (int i = 1; i < max; i++) {
                s[i + 1] = s[i] + 0.5;
            }

            double ans = 0.0;
            double anstmp = 0.0;
            for (int i = 0; i + k <= n; i++) {
                if (i > 0) anstmp = 0.0;
                for (int j = i; j < i + k; j++) {
                    anstmp += s[p[j]];
                }
                ans = Math.max(anstmp, ans);
            }


            // 出力
            out.println(String.format("%.12f", ans));

        }

    }
}

