import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
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
        BShiftOnly solver = new BShiftOnly();
        solver.solve(1, in, out);
        out.close();
    }

    static class BShiftOnly {
        int count = 0;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = Integer.parseInt(in.next());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            divide(a);
            out.println(count);
        }

        private void divide(int[] arr) {
            if (Arrays.stream(arr).allMatch(i -> i % 2 == 0)) {
                count++;
                divide(Arrays.stream(arr).map(i -> i / 2).toArray());
            }
        }

    }
}
