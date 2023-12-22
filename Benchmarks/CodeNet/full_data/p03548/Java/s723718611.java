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
            int x = Integer.parseInt(in.next());
            int y = Integer.parseInt(in.next());
            int z = Integer.parseInt(in.next());
            int ans = 0;

            int tmp = x / (y + z);
            if (x % (y + z) == 0) {
                out.println(tmp - 1);
            } else {
                if (x - tmp * (y + z) >= z) {
                    out.println(x / (y + z));
                } else {
                    out.println(tmp - 1);
                }
            }

        }

    }
}

