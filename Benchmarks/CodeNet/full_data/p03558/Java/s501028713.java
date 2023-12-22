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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final long k = in.nextLong();
            long n = k;
            long max = 1000000 * k;
            long min = Long.MAX_VALUE;
            while (n < max) {
                String s = String.valueOf(n);
                long sum = 0;
                for (int i = 0; i < s.length(); i++) {
                    sum += Long.parseLong(s.substring(i, i + 1));
                }
                if (sum < min) min = sum;
                n += k;
            }
            out.println(min);
        }

    }
}

