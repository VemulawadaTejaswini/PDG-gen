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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = in.nextInt();
            int[] res = new int[n];
            res[0] = 0;
            for (int i = 1; i < n; i++) {
                res[i] = Integer.MAX_VALUE;
                for (int j = 1; j <= k; j++) {
                    if (i - j >= 0) {
                        res[i] = Math.min(res[i - j] + Math.abs(arr[i] - arr[i - j]), res[i]);
                    }
                }
            }
            out.println(res[n - 1]);
        }

    }
}

