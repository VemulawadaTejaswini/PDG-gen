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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] l = new int[n];

            for (int i = 0; i < n; i++) {
                l[i] = in.nextInt();
            }

            Arrays.sort(l);
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                sum += l[i];
            }

            if (l[n - 1] < sum) {
                out.print("Yes");
            } else {
                out.print("No");
            }

        }

    }
}

