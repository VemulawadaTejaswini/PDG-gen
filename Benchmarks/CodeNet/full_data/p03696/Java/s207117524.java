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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();

            int opened = 0;
            int closed = 0;
            StringBuilder outcome = new StringBuilder();
            for (int i = 0; i < n; i++) {
                char current = s[i];
                switch (current) {
                    case '(':
                        outcome.append(current);
                        ++opened;
                        break;
                    case ')':
                        outcome.append(current);
                        if (opened > 0) {
                            --opened;
                        }
                        else {
                            ++closed;
                        }
                        break;
                }
            }
            for (int j = 0; j < closed; j++) {
                outcome.insert(0, '(');
            }

            for (int j = 0; j < opened; j++) {
                outcome.append(')');
            }
            out.println(outcome.toString());
        }

    }
}

