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

            long x = Long.parseLong(in.next()) / 2;
            long div_num = divNum(x);

            for (int i = 1; i < n; i++) {
                long a = Long.parseLong(in.next()) / 2;
                x = lcm(x, a);

                long dnum = divNum(a);
                if (div_num != dnum) {
                    out.print(0);
                    return;
                }
            }
            if (m < x) {
                out.print(0);
                return;
            }

            long p = 0;
            while (1 <= x * (2 * p + 1) && x * (2 * p + 1) <= m) {
                p++;
            }
            out.print(p);
        }

        static long divNum(long a) {
            long num = 0;
            while (a % 2 == 0) {
                num++;
                a /= 2;
            }
            return num;
        }

        static long lcm(long a, long b) {
            return a * b / gcd(a, b);
        }

        static long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

    }
}

