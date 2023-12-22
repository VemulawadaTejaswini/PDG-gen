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
            int n = in.nextInt();
            int[] ar = new int[n];
            int x = 0;
            int p = 1;
            for (int i = 0; i < n; i++) {
                ar[i] = in.nextInt();
            }

            int cnt = 0;
            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] == i + 1) {
                    cnt++;
                    if (i + 1 < n && ar[i + 1] == i + 2) {
                        i++;
                    }
                }
            }
            out.println(cnt);
        }

    }
}

