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
            char[] a = in.next().toCharArray();

            // see if doubles.
            int start = -1;
            int end = -1;

            for (int i = 1; i < a.length; i++) {
                if (a[i] == a[i - 1]) {
                    start = i;
                    end = i + 1;
                    break;
                }
            }

            if (start != -1) {
                out.println(start + " " + end);
                return;
            } else {
                for (int i = 2; i < a.length; i++) {
                    if (a[i] == a[i - 2]) {
                        start = i - 1;
                        end = i + 1;
                        out.println(start + " " + end);
                        return;
                    }
                }
            }
            out.println(start + " " + end);
        }
    }
}
