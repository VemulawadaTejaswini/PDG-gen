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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong(), y = in.nextLong();
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {
                    long res = 10000 * i + 5000 * j;
                    long last = (y - res) / 1000;
                    if (res <= y && (y - res) % 1000 == 0 && i + j + last == n) {
                        out.println(i + " " + j + " " + last);
                        return;
                    }
                }

            }

            out.println(-1 + " " + -1 + " " + -1);
        }

    }
}

