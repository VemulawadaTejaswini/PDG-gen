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
        AtCoder solver = new AtCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class AtCoder {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] lucas = new long[87];
            lucas[0] = 2;
            lucas[1] = 1;

            if (n == 1) {
                out.println(lucas[1]);
            } else if (n == 2) {
                out.println(lucas[0] + lucas[1]);
            } else {
                for (int i = 2; i < n + 1; i++) {
                    lucas[i] = lucas[i - 1] + lucas[i - 2];
                }
                out.println(lucas[n]);
            }
        }

    }
}

