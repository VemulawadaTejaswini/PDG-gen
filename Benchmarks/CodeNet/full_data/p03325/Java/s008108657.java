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
        ABC100_C solver = new ABC100_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC100_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            long ans = 0;
            for (int i = 0; i < n; i++) {
                long a = in.nextLong();

                while (a % 2 == 0) {
                    ans++;
                    a /= 2;
                }
            }
            out.print(ans);
        }

    }
}

