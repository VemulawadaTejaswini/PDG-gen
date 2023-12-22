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
        SemiCommonMultiple solver = new SemiCommonMultiple();
        solver.solve(1, in, out);
        out.close();
    }

    static class SemiCommonMultiple {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long m = in.nextLong();

            long x = 1;
            for (int i = 0; i < n; i++) {
                x = lcm(x, in.nextLong());
            }

            long result = 0;
            while (true) {
                if (x * (10 * result + 5) > 10 * m) {
                    break;
                }
                result++;
            }
            out.print(result);

        }

        static long lcm(long a, long b) {
            return a * b / gcd(a, b);
        }

        static long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

    }
}

