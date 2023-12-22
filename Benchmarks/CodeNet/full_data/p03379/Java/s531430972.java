import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        CManyMedians solver = new CManyMedians();
        solver.solve(1, in, out);
        out.close();
    }

    static class CManyMedians {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] x = new int[n];
            int[] sort = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                sort[i] = x[i];
            }
            Arrays.sort(sort);
            for (int i = 0; i < n; i++) {
                if (x[i] <= sort[n / 2 - 1]) {
                    out.println(sort[n / 2]);
                } else {
                    out.println(sort[n / 2 - 1]);
                }
            }

        }

    }
}

