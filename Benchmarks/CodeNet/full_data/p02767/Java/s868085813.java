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
 *
 * @author ky112233
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CRally solver = new CRally();
        solver.solve(1, in, out);
        out.close();
    }

    static class CRally {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] x = new int[n];
            for (int i = 0; i < n; i++) x[i] = in.nextInt();
            int sum = Arrays.stream(x).sum();
            int avg1 = sum / n;
            int avg2 = sum / n + 1;
            int num1 = Arrays.stream(x).map(i -> (i - avg1) * (i - avg1)).sum();
            int num2 = Arrays.stream(x).map(i -> (i - avg2) * (i - avg2)).sum();
            out.println(Math.min(num1, num2));
        }

    }
}

