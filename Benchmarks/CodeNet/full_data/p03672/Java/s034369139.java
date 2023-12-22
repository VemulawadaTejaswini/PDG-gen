import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author G. Guarnieri
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
            String s = in.next();

            while (s.length() > 1) {
                do {
                    s = s.substring(0, s.length() - 1);
                } while (s.length() % 2 == 1);

                if (isEven(s)) {
                    out.println(s.length());
                    break;
                }
            }
        }

        private boolean isEven(String s) {
            int mid = s.length() / 2;
            return s.substring(0, mid).equals(s.substring(mid, s.length()));
        }

    }
}

