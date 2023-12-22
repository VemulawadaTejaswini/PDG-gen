import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        BBackfront solver = new BBackfront();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBackfront {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n + 2];
            a[0] = 0;
            for (int i = 1; i < n + 1; i++) {
                a[i] = in.nextInt();
            }
            a[n + 1] = n + 1;
            // より大きいのがある数
            int max = 0;
            int cmp = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] < max) cmp = Math.max(cmp, a[i]);
                else max = a[i];
            }

            int min = n + 1;
            int cmp2 = n + 1;
            for (int i = n + 1; i >= 0; i--) {
                if (a[i] > min) cmp2 = Math.min(cmp2, a[i]);
                else min = a[i];
            }

            out.println(Math.min(cmp, n + 1 - cmp2));
        }

    }
}

