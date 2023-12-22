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
        ABC106_B solver = new ABC106_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC106_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    int cnt = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            cnt++;
                        }
                    }

                    if (cnt == 8) {
                        ans++;
                    }
                }
            }

            out.print(ans);
        }

    }
}

