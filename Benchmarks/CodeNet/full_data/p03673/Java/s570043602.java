import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author zhangyong
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

            int n;
            n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            if ((n & 1) == 0) {
                for (int i = n - 1; i > 0; i -= 2) {
                    out.print(arr[i] + " ");
                }
                for (int i = 0; i < n - 1; i += 2) {
                    if (i != n - 2) {
                        out.print(arr[i] + " ");
                    } else {
                        out.println(arr[i]);
                    }
                }
            } else {
                for (int i = n - 1; i >= 0; i -= 2) {
                    out.print(arr[i] + " ");
                }
                for (int i = 1; i < n - 1; i += 2) {
                    if (i != n - 2) {
                        out.print(arr[i] + " ");
                    } else {
                        out.println(arr[i]);
                    }
                }
            }
        }

    }
}

