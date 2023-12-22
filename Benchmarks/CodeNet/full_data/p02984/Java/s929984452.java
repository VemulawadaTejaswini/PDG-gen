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
        RainFlowsintoDams solver = new RainFlowsintoDams();
        solver.solve(1, in, out);
        out.close();
    }

    static class RainFlowsintoDams {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] dams = new long[n];
            for (int i = 0; i < n; i++) {
                dams[i] = 2 * in.nextLong();
            }

            long[] mountains = new long[n];
            mountains[0] = 0;
            for (int j = 1; j < n; j++) {
                mountains[j] = dams[j - 1] - mountains[j - 1];
            }

            mountains[0] = (dams[n - 1] - mountains[n - 1]) / 2;
            for (int j = 1; j < n; j++) {
                mountains[j] = dams[j - 1] - mountains[j - 1];
            }
            for (int k = 0; k < n; k++) {
                out.print(mountains[k] + " ");
            }

        }

    }
}

