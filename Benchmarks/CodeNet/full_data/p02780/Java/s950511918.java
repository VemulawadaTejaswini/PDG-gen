import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        DiceinLine solver = new DiceinLine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DiceinLine {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] p = new int[n];
            long max = 0;
            int pos = 0;
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }

            for (int i = 0; i < n - k + 1; i++) {
                long a = 0;
                for (int j = 0; j < k; j++) {
                    a += p[i + j];
                }
                if (max < a) {
                    max = a;
                    pos = i;
                }
            }
            double result = 0;
            for (int i = pos; i < pos + k; i++) {
                double sum = 0;
                for (int j = 1; j <= p[i]; j++) {
                    sum += j;
                }
                result += (sum / p[i]);
            }
            out.println(result);

        }

    }
}

