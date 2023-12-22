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
        abc158_b solver = new abc158_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc158_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long N = in.nextLong();
            long A = in.nextLong();
            long B = in.nextLong();

            long sum = A + B;
            long mul = (long) N / sum;
            long mod = N % sum;

            if (A >= mod) {
                out.println(mul * A + mod);
            } else {
                out.println((mul * A) + A);
            }
        }

    }
}

