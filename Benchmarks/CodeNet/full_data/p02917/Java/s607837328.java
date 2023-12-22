import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CMaximalValue solver = new CMaximalValue();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMaximalValue {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] dif = new int[n - 1];
            int[] ar = new int[n];
            long sum = 0;
            for (int i = 0; i < n - 1; i++) {
                dif[i] = in.nextInt();
            }
            ar[0] = dif[0];
            ar[n - 1] = dif[n - 2];
            for (int i = 1; i < n - 1; i++) {
                ar[i] = Math.min(dif[i], dif[i - 1]);
            }

            for (int i = 0; i < n; i++) {
                sum += (long) ar[i];
            }

            out.println(sum);

        }

    }
}

