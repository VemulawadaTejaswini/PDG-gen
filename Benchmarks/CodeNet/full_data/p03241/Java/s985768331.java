import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

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
        Partition solver = new Partition();
        solver.solve(1, in, out);
        out.close();
    }

    static class Partition {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long m = in.nextLong();
            long result = 0;
            List<Long> list = divisor(m);
            for (Long b : list) {
                long last = m - (b * (n - 1));
                if (b <= last) {
                    result = Math.max(result, b);
                }
            }
            out.println(result);
        }

        static List<Long> divisor(long x) {
            List<Long> result = new ArrayList<>();
            for (long i = 1; i * i <= x; i++) {
                if (x % i == 0) {
                    result.add(i);

                    long j = x / i;
                    if (j != i) {
                        result.add(j);
                    }
                }
            }
            Collections.sort(result);
            return result;
        }

    }
}

