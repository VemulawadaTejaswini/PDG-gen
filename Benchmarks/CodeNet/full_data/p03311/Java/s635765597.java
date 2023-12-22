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
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CLinearApproximation solver = new CLinearApproximation();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLinearApproximation {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] d = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                d[i] = in.nextInt() - i;
                sum += d[i];
            }
            Arrays.sort(d);
            long psum = 0;
            long kanasimi = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                psum += d[i];
                kanasimi = Math.min(kanasimi, sum - (psum * 2) + (((2 * i) + 2 - n) * d[i]));
            }
            out.println(kanasimi);
        }

    }
}

