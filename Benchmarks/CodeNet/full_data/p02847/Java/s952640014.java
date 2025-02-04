import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = 85_000_000;
        /*int[] test = new int[n];
        for (int i=0; i<n; i++) {
            test[i] = i;
        }*/
            long[] test = new long[n];
            for (int i = 0; i < n; i++)
                test[i] = i;

            out.println(test[9]);
        }

    }
}

