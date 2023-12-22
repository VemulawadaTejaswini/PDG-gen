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
        AMultipleArray solver = new AMultipleArray();
        solver.solve(1, in, out);
        out.close();
    }

    static class AMultipleArray {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] ar = new long[n];
            long[] mod = new long[n];
            long res = 0;
            for (int i = 0; i < n; i++) {
                ar[i] = in.nextLong();
                mod[i] = in.nextLong();
            }
            for (int i = 0; i < n; i++) {
                ar[n - 1 - i] += res;
                long tmp = (mod[n - 1 - i] - ar[n - 1 - i] % mod[n - 1 - i]) % mod[n - 1 - i];
                res += tmp;
            }
            out.println(res);
        }

    }
}

