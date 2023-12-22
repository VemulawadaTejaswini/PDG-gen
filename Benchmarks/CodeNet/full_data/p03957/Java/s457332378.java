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
        TaskATCCFQCA solver = new TaskATCCFQCA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskATCCFQCA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] ar = in.next().toCharArray();

            int cpos = -1;
            int fpos = -1;

            for (int i = 0; i < ar.length; i++) {
                if (ar[i] == 'C' && cpos == -1) {
                    cpos = i;
                } else if (ar[i] == 'F') {
                    fpos = i;
                }
            }

            if (cpos != -1 && fpos != -1 && cpos < fpos) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }
    }
}
