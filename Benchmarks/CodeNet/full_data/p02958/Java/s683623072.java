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
        ABC135_b solver = new ABC135_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC135_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] p = new int[N];
            int[] p_sorted = new int[N];

            int wk = 0;
            for (int i = 0; i < N; i++) {
                //if (i == 0) {
                //    p[i] = 0;
                //    p_sorted[i] = 0;
                //} else {
                p[i] = in.nextInt();
                p_sorted[i] = p[i];
                //}
            }
            Arrays.sort(p_sorted);
            if (Arrays.equals(p, p_sorted)) {
                out.println("YES");
                return;
            }
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    wk = p[j];
                    p[j] = p[i];
                    p[i] = wk;

                    if (Arrays.equals(p, p_sorted)) {
                        out.println("YES");
                        return;
                    }
                    p[i] = p[j];
                    p[j] = wk;

                }
            }
            out.println("NO");
        }

    }
}

