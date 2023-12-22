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
        public static int div(int n) {
            int res = 0;
            while (n % 2 == 0) {
                res++;
                n = n / 2;
            }
            return res;

        }

        public void solve(int testNumber, Scanner sn, PrintWriter out) {
            int n = sn.nextInt();
            int res = 0;
            int m = 1;
            int i = 2;
            for (; i <= n; i++) {
                if (res < div(i)) {
                    res = div(i);
                    m = i;
                }
            }
            out.println(m);
        }

    }
}

