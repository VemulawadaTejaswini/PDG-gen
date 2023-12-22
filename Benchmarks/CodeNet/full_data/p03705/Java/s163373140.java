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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            long n = Long.parseLong(in.next());
            long a = Long.parseLong(in.next());
            long b = Long.parseLong(in.next());
            long ans = 0;

            // 出力
            if (a > b) {
                ans = 0;
            } else {
                if (n == 1 && a == b) {
                    ans = 1;
                } else if (n == 1 && a != b) {
                    ans = 0;
                } else {
                    ans = (b - a) * (n - 2) + 1;
                    if (ans < 0) ans = 0;
                }
            }
            out.println(ans);

        }

    }
}

