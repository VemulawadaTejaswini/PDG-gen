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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        static final int inf = 1001001001;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int h[] = new int[n + 1];
            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(in.next());
                if (h[i] > 1) --h[i];
            }
            h[n] = inf;
            int diff = 0;
            for (int i = 0; i < n - 1; i++) {
                if (h[i] - h[i + 1] > 0) {
                    out.println("No");
                    return;
                }
            }

            // 出力
            out.println("Yes");

        }

    }
}

