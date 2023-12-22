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
        static long[] lucas;

        static void createLucasNumber(long max) {
            for (int i = 2; i < max; i++) {
                lucas[i] = lucas[i - 1] + lucas[i - 2];
            }
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int max = 87;
            lucas = new long[max];
            lucas[0] = 2;
            lucas[1] = 1;
            createLucasNumber(max);
            out.println(lucas[in.nextInt()]);
        }

    }
}

