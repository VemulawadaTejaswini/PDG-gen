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
        ABC085_C solver = new ABC085_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC085_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int y = in.nextInt();

            int ichi = 0;
            int gosen = 0;
            int sen = 0;

            boolean flag = false;

            for (int i = 0; i <= n; ++i) {
                for (int j = 0; j <= n; ++j) {
                    int sum = 10000 * i + 5000 * j + 1000 * (n - i - j);
                    if (sum == y && (n - i - j) >= 0) {
                        ichi = i;
                        gosen = j;
                        sen = n - i - j;
                        flag = true;
                        break;
                    } else flag = false;
                }
                if (flag) break;
                else continue;
            }

            if (flag) {
                out.printf("%d", ichi);
                out.printf(" ");
                out.printf("%d", gosen);
                out.printf(" ");
                out.printf("%d", sen);
            } else out.println("-1 -1 -1 ");
        }

    }
}

