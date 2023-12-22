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
        Partition solver = new Partition();
        solver.solve(1, in, out);
        out.close();
    }

    static class Partition {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long m = in.nextLong();
            long result = 1;
            for (int i = n; 1 < i; i--) {
                long base = (long) i * (n - 1);
                long diff = m - base;
                if (diff < i) {
                    continue;
                }
                if (diff % i == 0) {
                    result = Math.max(result, i);
                }
            }
            out.println(result);
        }

    }
}

