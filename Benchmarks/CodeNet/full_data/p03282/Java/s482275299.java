import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AEoui
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskCATCoder solver = new TaskCATCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskCATCoder {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] arr = in.next().toCharArray();
            long k = in.nextLong();

            for (char c : arr) {
                if (k == 1) {
                    out.println(c);
                    return;
                }

                if (c == '1') {
                    --k;
                } else {
                    out.println(c);
                    return;
                }
            }

            out.println(arr[arr.length - 1]);
        }

    }
}

