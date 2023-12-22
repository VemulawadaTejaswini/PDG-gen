import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        CSkip solver = new CSkip();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSkip {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int x = in.nextInt();
            int ans = Math.abs(in.nextInt() - x);
            for (int i = 1; i < n; i++) {
                ans = gcd(ans, Math.abs(in.nextInt() - x));
            }
            out.print(ans);
        }

        static int gcd(int u, int v) {
            int r;
            while (0 != v) {
                r = u % v;
                u = v;
                v = r;
            }
            return u;
        }

    }
}

