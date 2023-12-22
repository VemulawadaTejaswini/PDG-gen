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
        Streamline solver = new Streamline();
        solver.solve(1, in, out);
        out.close();
    }

    static class Streamline {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] x = new int[m];
            int[] distance = new int[m - 1];

            for (int i = 0; i < m; i++) {
                x[i] = in.nextInt();
            }
            Arrays.sort(x);

            for (int i = 1; i < m; i++) {
                distance[i - 1] = Math.abs(x[i] - x[i - 1]);
            }
            Arrays.sort(distance);

            long result = 0;
            for (int i = 0; i < distance.length - n + 1; i++) {
                result += distance[i];
            }
            out.print(result);

        }

    }
}

