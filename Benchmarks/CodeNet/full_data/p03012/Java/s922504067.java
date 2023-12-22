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
        BBalance solver = new BBalance();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBalance {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                sum += arr[i];
            }
            int cur = 0;
            int prev = 0;
            for (int i = 0; i < n; i++) {
                prev = cur;
                cur += arr[i];
                if (2 * cur >= sum) {
                    out.println(Math.min((2 * cur - sum), (sum - 2 * prev)));
                    break;
                }
            }

        }

    }
}

