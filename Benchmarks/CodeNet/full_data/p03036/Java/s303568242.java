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
            int r = Integer.parseInt(in.next());
            int d = Integer.parseInt(in.next());
            int x_2000 = Integer.parseInt(in.next());
            int x = 0;

            // 出力
            x = x_2000;
            for (int i = 0; i < 10; i++) {
                x = r * x - d;
                out.println(x);
            }

        }

    }
}

