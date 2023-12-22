import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author bcools
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] spots = new int[n + 2];
            int total = 0;
            spots[0] = 0;
            spots[n + 1] = 0;
            for (int i = 1; i <= n; ++i) {
                spots[i] = in.nextInt();
                total += Math.abs(spots[i] - spots[i - 1]);
            }
            total += Math.abs(spots[n]);
            for (int i = 1; i <= n; ++i) {
                if ((spots[i - 1] <= spots[i] && spots[i] <= spots[i + 1]) || (spots[i - 1] >= spots[i] && spots[i] >= spots[i + 1]))
                    System.out.println(total);
                else {
                    System.out.println(total - Math.abs(spots[i] - spots[i - 1]) - Math.abs(spots[i] - spots[i + 1]) + Math.abs(spots[i - 1] - spots[i + 1]));
                }
            }
        }

    }
}

