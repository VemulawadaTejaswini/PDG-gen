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
            int k = Integer.parseInt(in.next());
            int x = Integer.parseInt(in.next());

            if (k == 1) {
                out.println(x);
                return;
            }
            for (int i = x - k + 1; i < x + k; i++) {
                out.printf("%d", i);
                out.print(" ");
            }
            out.println();

        }

    }
}

