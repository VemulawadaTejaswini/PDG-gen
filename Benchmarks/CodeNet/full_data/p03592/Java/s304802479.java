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
            int m = Integer.parseInt(in.next());
            int k = Integer.parseInt(in.next());

            boolean ok = false;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (i * (m - j) + (n - i) * j == k) ok = true;
                }
            }
            out.println(ok ? "Yes" : "No");

        }

    }
}

