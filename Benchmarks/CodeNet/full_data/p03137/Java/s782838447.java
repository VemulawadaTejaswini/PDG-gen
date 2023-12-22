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
        CStreamline solver = new CStreamline();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStreamline {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // サボれる区間はn-1個

            int n = in.nextInt();
            int m = in.nextInt();
            int[] x = new int[m];
            int[] dif = new int[m - 1];

            for (int i = 0; i < m; i++) {
                x[i] = in.nextInt();
            }
            Arrays.sort(x);
            for (int i = 0; i < m - 1; i++) {
                dif[i] = x[i + 1] - x[i];
            }
            Arrays.sort(dif);

            int think = Math.max(0, m - n);
            long sum = 0;
            for (int i = 0; i < think; i++) {
                sum += dif[i];
            }
            out.println(sum);

        }

    }
}

