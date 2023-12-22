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
        CHalfAndHalf solver = new CHalfAndHalf();
        solver.solve(1, in, out);
        out.close();
    }

    static class CHalfAndHalf {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long a = in.nextInt();
            long b = in.nextInt();
            long c = in.nextInt();
            long x = in.nextInt();
            long y = in.nextInt();
            long min = Long.MAX_VALUE;
            for (int i = 0; i <= Math.max(x, y); i++) {
                min = Math.min(min, a * Math.max(0, x - i) + b * Math.max(0, y - i) + c * 2 * i);
            }
            out.println(min);

        }

    }
}

