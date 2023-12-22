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
            int a[] = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
            }

            int ans = 1;

            for (int i = 0; i < n; i++) {
                if (a[i] == ans) ++ans;
            }

            if (ans == 1) out.println(-1);
            else out.println(n - ans + 1);

        }

    }
}

