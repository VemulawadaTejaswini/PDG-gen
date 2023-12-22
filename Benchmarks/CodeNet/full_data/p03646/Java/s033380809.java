import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.LongStream;
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
        DDecreaseContestantVer solver = new DDecreaseContestantVer();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDecreaseContestantVer {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long k = in.nextLong();
            int n = 50;
            long[] a = new long[n];
            Arrays.fill(a, 49);
            a = Arrays.stream(a).map(x -> x + k / n).toArray();
            for (int i = 0; i < n; i++) {
                if (i < k % n) {
                    a[i] += (n - k % n + 1);
                } else {
                    a[i] -= k % n;
                }
            }

            for (int i = 0; i < n; i++) {
                out.print(a[i] + " ");
            }
            out.println();


        }

    }
}

