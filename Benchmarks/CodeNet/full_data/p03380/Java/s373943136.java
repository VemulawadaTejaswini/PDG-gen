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
        ABC094_D solver = new ABC094_D();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC094_D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }

            Arrays.sort(a);
            long max = a[n - 1];
            long ideal = max / 2 + max % 2;
            long min = 0;
            for (int i = 0; i < n; i++) {
                if (Math.abs(ideal - a[i]) < Math.abs(ideal - min)) {
                    min = a[i];
                }
            }

            out.println(max + " " + min);
        }

    }
}

