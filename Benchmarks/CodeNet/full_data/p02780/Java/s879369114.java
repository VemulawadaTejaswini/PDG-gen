import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author varunvats32
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDiceInLine solver = new DDiceInLine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDiceInLine {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            double[] arr = new double[n + 1];
            double sum = 0;

            for (int i = 1; i <= n; i++) {
                arr[i] = (in.nextInt() + 1) / 2.0;
                if (i <= k) sum += arr[i];
            }

            double max = Math.max(sum, 0);
            for (int j = 1, i = k + 1; i <= n; i++, j++) {
                sum += arr[i] - arr[j];
                max = Math.max(sum, max);
            }

            out.printf("%.12f", max);
        }

    }
}

