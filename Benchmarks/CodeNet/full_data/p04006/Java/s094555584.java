import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.LongStream;
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
        BColorfulSlimes solver = new BColorfulSlimes();
        solver.solve(1, in, out);
        out.close();
    }

    static class BColorfulSlimes {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), x = in.nextInt();
            long[] a = LongStream.range(0, n).map(z -> in.nextInt()).toArray();
            long pick = 0, magic = 0;
            for (int i = 0; i < n; i++) {
                long minCost = Long.MAX_VALUE;
                int minOffset = 0;
                for (int offset = 0; offset < n; offset++) {
                    long cost = a[(i + n - offset) % n] + offset * x;
                    if (cost < minCost) {
                        minOffset = offset;
                        minCost = cost;
                    }
                }
                magic = Math.max(magic, minOffset);
                pick += a[(i + n - minOffset) % n];
            }
            out.println(pick + magic * x);
        }

    }
}

