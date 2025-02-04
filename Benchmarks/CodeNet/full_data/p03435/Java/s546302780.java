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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int[][] c = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    c[i][j] = in.nextInt();
                }
            }
            int[] a = new int[3];
            int[] b = new int[3];
            for (a[0] = 0; a[0] < 101; a[0]++) {
                b[0] = c[0][0] - a[0];
                for (a[1] = 0; a[1] < 101; a[1]++) {
                    b[1] = c[1][1] - a[1];
                    for (a[2] = 0; a[2] < 101; a[2]++) {
                        b[2] = c[2][2] - a[2];
                        boolean ok = true;
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                if (c[i][j] != a[i] + b[j]) {
                                    ok = false;
                                }
                            }
                        }
                        if (ok) {
                            out.println("Yes");
                            return;
                        }
                    }
                }
            }
            out.println("No");
        }

    }
}

