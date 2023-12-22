import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        ABC094_C solver = new ABC094_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC094_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] l = new long[n];
            long[] sorted = new long[n];
            long med1, med2;
            for (int i = 0; i < n; i++) {
                long tmp = in.nextLong();
                l[i] = tmp;
                sorted[i] = tmp;
            }

            Arrays.sort(sorted);

            med1 = sorted[n / 2 - 1];
            med2 = sorted[n / 2];

            for (int i = 0; i < n; i++) {
                if (l[i] <= med1) {
                    out.println(med2);
                } else {
                    out.println(med1);
                }

            }

        }

    }
}

