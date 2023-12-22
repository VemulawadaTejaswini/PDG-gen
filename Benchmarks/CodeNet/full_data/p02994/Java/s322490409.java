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
        ABC131_b solver = new ABC131_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC131_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int L = in.nextInt();

            int small = 999;
            int small_noneabs = 0;
            int ttl = 0;
            for (int i = 0; i < N; i++) {
                if (small > Math.abs(L + i)) {
                    small = Math.abs(L + i);
                    small_noneabs = L + i;
                }
                ttl += L + i;
            }
            out.println(ttl - small_noneabs);

        }

    }
}

