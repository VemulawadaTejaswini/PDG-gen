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
        SumofgcdofTuples solver = new SumofgcdofTuples();
        solver.solve(1, in, out);
        out.close();
    }

    static class SumofgcdofTuples {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int k = in.nextInt();

            long result = 0;
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= k; j++) {
                    for (int l = 1; l <= k; l++) {
                        result += gcd(gcd(i, j), l);
                    }
                }
            }
            out.append(String.valueOf(result));
        }

        static long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

    }
}

