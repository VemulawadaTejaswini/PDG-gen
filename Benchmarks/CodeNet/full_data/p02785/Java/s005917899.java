import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        ABC153_c solver = new ABC153_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC153_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            long H[] = new long[N];
            for (int i = 0; i < N; i++) {
                H[i] = in.nextInt();

            }
            Arrays.sort(H);
            long att = 0;
            for (int i = N - K - 1; i >= 0; i--) {
                att += H[i];
            }
            out.println(att);
        }

    }
}

