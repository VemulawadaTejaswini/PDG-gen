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
            int a = in.nextInt(), b = in.nextInt();
            String s = in.next();

            for (int i = 0; i < a; i++) {
                char ch = s.charAt(i);
                if (!(ch >= '0' && ch <= '9')) {
                    out.println("No");
                    return;
                }
            }

            if (s.charAt(a) != '-') {
                out.println("No");
                return;
            }

            for (int i = a + 1; i < a + b + 1; i++) {
                char ch = s.charAt(i);
                if (!(ch >= '0' && ch <= '9')) {
                    out.println("No");
                    return;
                }
            }

            out.println("Yes");

        }

    }
}

