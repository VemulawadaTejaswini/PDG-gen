import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hakamada
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC115_c solver = new ABC115_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC115_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            int h[] = new int[N];
            int diffMin = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                h[i] = in.nextInt();
            }

            Arrays.sort(h);

            for (int i = 0; i < N - (K - 1); i++) {
                int diff = h[i + (K - 1)] - h[i];
                if (diffMin > diff) {
                    diffMin = diff;
                }
            }
            out.println(diffMin);
        }

    }
}

