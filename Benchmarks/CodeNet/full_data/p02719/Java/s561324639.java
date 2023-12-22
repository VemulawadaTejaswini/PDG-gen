import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CReplacingInteger solver = new CReplacingInteger();
        solver.solve(1, in, out);
        out.close();
    }

    static class CReplacingInteger {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();
            long k = in.nextLong();

            if (k == 1) {
                out.println(0);
            } else {
                out.println(Arith.gcd(n, k));
            }

        }

    }

    static class Arith {
        public static long gcd(long a, long b) {
            if (b == 0) return a;
            return a % b == 0 ? b : gcd(b, a % b);
        }

    }
}

