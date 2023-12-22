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
        CSumOfGcdOfTuplesEasy solver = new CSumOfGcdOfTuplesEasy();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSumOfGcdOfTuplesEasy {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int k = in.nextInt();
            long sum = 0;
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= k; j++) {
                    for (int l = 1; l <= k; l++) {
                        sum += Arith.gcd(i, Arith.gcd(j, l));
                    }
                }
            }
            out.println(sum);
        }

    }

    static class Arith {
        public static long gcd(long a, long b) {
            if (b == 0) return a;
            return a % b == 0 ? b : gcd(b, a % b);
        }

    }
}

