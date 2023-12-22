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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int res = -1;
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.nextInt();
            }
            int[] gcd_nat = new int[n];
            int[] gcd_rev = new int[n];
            gcd_nat[0] = ar[0];
            gcd_rev[n - 1] = ar[n - 1];
            for (int i = 1; i < n; i++) {
                gcd_nat[i] = gcd(gcd_nat[i - 1], ar[i]);
                gcd_rev[n - 1 - i] = gcd(gcd_rev[n - i], ar[n - 1 - i]);
            }
            for (int i = 1; i < n - 1; i++) {
                res = Math.max(gcd(gcd_nat[i - 1], gcd_rev[i + 1]), res);
            }
            res = Math.max(res, gcd_nat[n - 2]);
            res = Math.max(res, gcd_rev[1]);

            out.println(res);
        }

        public static int gcd(int a, int b) {
            if (b == 0) {
                return a;
            } else {
                return gcd(b, a % b);
            }
        }

    }
}

