import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BResale solver = new BResale();
        solver.solve(1, in, out);
        out.close();
    }

    static class BResale {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] v = new int[n];
            int[] c = new int[n];
            int[] diff = new int[n];
            for (int i = 0; i < n; i++)
                v[i] = in.nextInt();
            for (int i = 0; i < n; i++)
                c[i] = in.nextInt();

            int res = 0;
            for (int i = 0; i < n; i++) {
                diff[i] = v[i] - c[i];
                if (diff[i] > 0)
                    res += diff[i];
            }
            out.println(res);
        }

    }
}

