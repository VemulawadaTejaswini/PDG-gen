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
        XORWorld solver = new XORWorld();
        solver.solve(1, in, out);
        out.close();
    }

    static class XORWorld {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long a = in.nextLong();
            long b = in.nextLong();

            out.println(calc(b) ^ calc(a - 1));
        }

        static long calc(long n) {
            if (n < 0) {
                return 0;
            }
            if (n % 4 == 0) {
                return n;
            } else if (n % 4 == 1) {
                return 1;
            } else if (n % 4 == 2) {
                return 1 ^ n;
            } else {
                return 0;
            }
        }

    }
}

