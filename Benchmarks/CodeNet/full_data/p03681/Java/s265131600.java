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
        static final int mod = 1000000007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            long n = Long.parseLong(in.next());
            long m = Long.parseLong(in.next());
            long ans = 0;

            if (Math.abs(n - m) >= 2) {
                ans = 0;
            } else if (n == m) {
                ans = 2 * factorial(n) * factorial(m);
            } else {
                ans = factorial(n) * factorial(m);
            }

            // 出力
            out.println(ans % mod);

        }

        static long factorial(long n) {
            if (n == 1) {
                return 1;
            }
            return n * factorial(n - 1) % mod;
        }

    }
}

