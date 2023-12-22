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
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int k = Integer.parseInt(in.next());

            if ((b - a + 1 <= k) || (b - a + 1 <= k * 2)) {
                for (int i = 0; i < b - a + 1; i++) {
                    out.println(a + i);
                }
                return;
            }

            for (int i = 0; i < k; i++) {
                out.println(a + i);
            }
            for (int i = 0; i < k; i++) {
                out.println(b - k + 1 + i);
            }

        }

    }
}

