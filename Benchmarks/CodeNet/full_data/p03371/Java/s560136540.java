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
        CHalfAndHalf solver = new CHalfAndHalf();
        solver.solve(1, in, out);
        out.close();
    }

    static class CHalfAndHalf {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), x = in.nextInt(), y = in.nextInt();
            int ans = 0;
            if (a + b > c * 2) {
                int ab = Math.min(x, y);
                ans += ab * c * 2;
                x -= ab;
                y -= ab;
            }
            if (a > c * 2) {
                ans += x * c * 2;
            } else {
                ans += x * a;
            }
            if (b > c * 2) {
                ans += y * c * 2;
            } else {
                ans += y * b;
            }
            out.println(ans);
        }

    }
}

