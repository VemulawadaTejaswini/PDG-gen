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
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            if (b - a < k * 2) {
                for (int i = a; i <= b; i++) {
                    out.println(i);
                }
            } else {
                for (int i = a; i < a + k; i++) {
                    out.println(i);
                }
                for (int i = b - k + 1; i <= b; i++) {
                    out.println(i);
                }
            }
        }

    }
}

