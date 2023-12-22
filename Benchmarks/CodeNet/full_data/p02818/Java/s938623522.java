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
        BGreedyTakahashi solver = new BGreedyTakahashi();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGreedyTakahashi {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long a = in.nextLong();
            long b = in.nextLong();
            long k = in.nextLong();
            out.println(Math.max(0, a - k) + " " + Math.min(Math.max(0, a + b - k), b));
        }

    }
}

