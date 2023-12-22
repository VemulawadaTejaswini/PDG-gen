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
        CSuccessiveSubtraction solver = new CSuccessiveSubtraction();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSuccessiveSubtraction {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            Arrays.sort(a);
            StringBuilder sb = new StringBuilder();
            int m;
            if (a[0] > 0) {
                // all > 0
                int pr = a[0];
                for (int i = 1; i < n - 1; i++) {
                    sb.append(pr).append(" ").append(a[i]).append("\n");
                    pr -= a[i];
                }
                sb.append(a[n - 1]).append(" ").append(pr).append("\n");
                m = a[n - 1] - pr;
            } else if (a[n - 1] < 0) {
                // all < 0
                int tmp = a[n - 1];
                for (int i = 0; i < n - 1; i++) {
                    sb.append(tmp).append(" ").append(a[i]).append("\n");
                    tmp -= a[i];
                }
                m = tmp;
            } else {
                m = a[n - 1];
                int tmp = a[0];
                for (int i = 1; i < n - 1; i++) {
                    if (a[i] < 0) {
                        sb.append(m).append(" ").append(a[i]).append("\n");
                        m -= a[i];
                    } else {
                        sb.append(tmp).append(" ").append(a[i]).append("\n");
                        tmp -= a[i];
                    }
                }
                sb.append(m).append(" ").append(tmp).append("\n");
                m -= tmp;
            }

            out.println(m);
            out.print(new String(sb));
        }

    }
}

