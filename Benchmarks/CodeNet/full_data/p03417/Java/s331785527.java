import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC090C solver = new ABC090C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC090C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long N = in.nextInt();
            long M = in.nextInt();
            long ans = 0;
            if (N == 1 && M == 1) {
                ans = 1;
            } else if (N == 1 || M == 1) {
                ans = Math.max(N, M) - 2;
                ans = ans < 0 ? 0 : ans;
            } else {
                ans = (N - 2) * (M - 2);
            }
            out.println(ans);
        }

    }
}

