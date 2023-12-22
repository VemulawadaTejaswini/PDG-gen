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
        ABC095_B solver = new ABC095_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC095_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] m = new int[n];
            for (int i = 0; i < n; i++) {
                m[i] = in.nextInt();
            }

            int sum = Arrays.stream(m).sum();
            Arrays.sort(m);
            int min = m[0];

            out.print(n + (k - sum) / min);
        }

    }
}

