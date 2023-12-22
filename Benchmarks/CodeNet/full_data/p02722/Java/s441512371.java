import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

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
        FDivisionOrSubstraction solver = new FDivisionOrSubstraction();
        solver.solve(1, in, out);
        out.close();
    }

    static class FDivisionOrSubstraction {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();
            long cnt = 0;

            long m = n - 1;

            //case1
            for (int i = 1; i <= Math.sqrt(m); i++) {
                if (m % i == 0) {
                    if (i >= 2) {
                        cnt++;
                    }
                    if (i < m / i) {
                        cnt++;
                    }
                }
            }

            // case2
            ArrayList<Long> divisor = new ArrayList<>();
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    divisor.add((long) i);
                    if (i < n / i) {
                        divisor.add(n / (long) i);
                    }
                }

            }
            divisor.add(n);

            //out.println(cnt);
            //out.println(divisor);

            for (Long l : divisor) {
                long cmp = n;
                while (cmp % l == 0) {
                    cmp /= l;
                }
                if (cmp % l == 1) {
                    //out.println(l);
                    cnt++;
                }
            }

            out.println(cnt);
        }

    }
}

