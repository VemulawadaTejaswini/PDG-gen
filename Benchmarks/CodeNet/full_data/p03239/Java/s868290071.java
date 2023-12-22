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
        BTimeLimitExceeded solver = new BTimeLimitExceeded();
        solver.solve(1, in, out);
        out.close();
    }

    static class BTimeLimitExceeded {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int tl = in.nextInt();
            int mincost = 10000;
            for (int i = 0; i < n; i++) {
                int c = in.nextInt();
                int t = in.nextInt();
                if (tl >= t) {
                    mincost = Math.min(mincost, c);
                }
            }
            if (mincost > 1000) {
                out.println("TLE");
            } else {
                out.println(mincost);
            }
        }

    }
}

