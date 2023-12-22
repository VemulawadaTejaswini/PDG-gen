import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CLower solver = new CLower();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLower {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int a[] = ReadInput.readIntArray(n, in);
            int ans = 0, start = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] <= a[i - 1]) {
                    ans = Math.max(ans, i - start);
                } else {
                    start = i;
                }
            }
            out.println(ans);
        }

    }

    static class ReadInput {
        public static int[] readIntArray(int size, Scanner in) {
            int a[] = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = in.nextInt();
            }
            return a;
        }

    }
}

