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
            int x = Integer.parseInt(in.next());
            int l[] = new int[n];
            for (int i = 0; i < n; i++) {
                l[i] = Integer.parseInt(in.next());
            }

            int bounds[] = new int[n + 1];
            bounds[0] = 0;
            for (int i = 1; i <= n; i++) {
                bounds[i] = bounds[i - 1] + l[i - 1];
            }
            int ans = 0;
            for (int i = 0; i <= n; i++) {
                if (bounds[i] <= x) ++ans;
            }

            // 出力
            out.println(ans);

        }

    }
}

