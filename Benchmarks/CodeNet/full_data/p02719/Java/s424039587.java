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
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            long n = Long.parseLong(in.next());
            long k = Long.parseLong(in.next());
            long ans = 0;
            long x = 0;

            x = n;
            long tmp = Long.MAX_VALUE;
            if (n == 0) {
                out.println(0);
                return;
            } else if (k == 1) {
                out.println(0);
                return;
            } else if (n < k) {
                x = Math.abs(n - k);
                if (x < n) {
                    out.println(x);
                } else {
                    out.println(n);
                }
                return;
            } else if (n > k) {
                if (n % k == 0) {
                    out.println(0);
                    return;

                } else if (n % k == 1) {
                    out.println(1);
                    return;

                } else {
                    x = Math.abs(n % k - k);
                    if (n % k > x) {
                        out.println(x);
                        return;

                    } else {
                        out.println(n % k);
                        return;

                    }

                }
            } else {
                out.println(0);
                return;
            }

        }

    }
}

