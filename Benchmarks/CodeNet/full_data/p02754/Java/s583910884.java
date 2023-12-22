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
        BCountBalls solver = new BCountBalls();
        solver.solve(1, in, out);
        out.close();
    }

    static class BCountBalls {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = Long.parseLong(in.next());
            long a = Long.parseLong(in.next());
            long b = Long.parseLong(in.next());

            long r1 = n / (a + b);
            long r2tmp = n % (a + b);
            long r2 = Math.min(r2tmp, a);

            out.append(String.valueOf(r1 * a + r2));
        }

    }
}

