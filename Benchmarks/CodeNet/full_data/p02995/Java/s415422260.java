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
        AntiDivision solver = new AntiDivision();
        solver.solve(1, in, out);
        out.close();
    }

    static class AntiDivision {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            long d = in.nextLong();

            long cdiv = (b / c) - ((a - 1) / c);
            long ddiv = (b / d) - ((a - 1) / d);
            long cddiv = (b / lcm(c, d)) - ((a - 1) / lcm(c, d));

            out.println(b - a + 1 - cdiv - ddiv + cddiv);
        }

        static long lcm(long a, long b) {
            return a * b / gcd(a, b);
        }

        static long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

    }
}

