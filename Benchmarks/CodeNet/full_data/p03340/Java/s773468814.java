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
        XorSum2 solver = new XorSum2();
        solver.solve(1, in, out);
        out.close();
    }

    static class XorSum2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }

            long result = 0;
            long sum = 0;
            int right = 0;
            for (int left = 0; left < n; left++) {

                while (right < n && ((sum + a[right]) == (sum ^ a[right]))) {
                    sum = sum + a[right];
                    right++;
                }

                result += right - left;
                if (left == right) {
                    right++;
                } else {
                    sum -= a[left];
                }
            }

            out.print(result);
        }

    }
}

