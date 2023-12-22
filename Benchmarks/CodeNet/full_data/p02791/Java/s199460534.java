import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author varunvats32
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CLowElements solver = new CLowElements();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLowElements {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            int min = arr[0];
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] > min) {
                    count++;
                }
                min = Math.min(min, arr[i]);
            }

            out.println(n - count);
        }

    }
}

