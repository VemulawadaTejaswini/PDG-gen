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
        ABC144_b solver = new ABC144_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC144_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();

            if ((N >= 1) && (N <= 81)) {
                for (int i = 1; i <= 9; i++) {
                    for (int j = 1; j <= 9; j++) {
                        if ((i * j) == N) {
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

