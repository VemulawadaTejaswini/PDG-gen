import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

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
        DisjointSetofCommonDivisors solver = new DisjointSetofCommonDivisors();
        solver.solve(1, in, out);
        out.close();
    }

    static class DisjointSetofCommonDivisors {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long a = in.nextLong();
            long b = in.nextLong();
            long g = gcd(a, b);
            HashMap<Long, Long> gmap = primeFactorize(g);
            out.println(gmap.keySet().size() + 1);
        }

        static long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

        static HashMap<Long, Long> primeFactorize(long x) {
            HashMap<Long, Long> result = new HashMap<>();
            for (long i = 2; i * i <= x; i++) {
                if (x % i != 0) {
                    continue;
                }
                long ex = 0;
                while (x % i == 0) {
                    ex++;
                    x /= i;
                }
                result.put(i, ex);
            }
            if (x != 1) {
                result.put(x, 1L);
            }
            return result;
        }

    }
}

