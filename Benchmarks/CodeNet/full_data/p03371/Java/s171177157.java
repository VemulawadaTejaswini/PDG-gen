import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
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
            int A = Integer.parseInt(in.next());
            int B = Integer.parseInt(in.next());
            int C = Integer.parseInt(in.next());
            int X = Integer.parseInt(in.next());
            int Y = Integer.parseInt(in.next());

            long ans = 1L << 60;
            for (int i = 0; i < 100001; i++) {
                ans = Math.min(ans, 2 * C * i + A * Math.max(0, X - i) + B * Math.max(0, Y - i));
            }
            out.println(ans);
        }

    }
}

