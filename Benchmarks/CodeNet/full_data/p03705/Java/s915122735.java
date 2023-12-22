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
        static Integer n;
        static Integer a;
        static Integer b;
        static Long ans;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = Integer.parseInt(in.next());
            a = Integer.parseInt(in.next());
            b = Integer.parseInt(in.next());
            ans = 0L;
            if (a > b) {
                ans = 0L;
            } else {
                if (n == 1 && a == b) {
                    ans = 1L;
                } else if (n == 1 && a != b) {
                    ans = 0L;
                } else {
                    ans = a + b * (n - 1) - a * (n - 1) - b + 1L;
                    if (ans < 0) ans = 0L;
                }
            }
            out.println(ans);

        }

    }
}

