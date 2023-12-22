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
        Skip solver = new Skip();
        solver.solve(1, in, out);
        out.close();
    }

    static class Skip {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long x = in.nextLong();

            long[] city = new long[n];
            for (int i = 0; i < n; i++) {
                city[i] = Math.abs(x - Long.parseLong(in.next()));
            }
            long result = city[0];
            for (int i = 1; i < n; i++) {
                result = gcd(result, city[i]);
            }
            out.print(result);

        }

        static long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

    }
}

