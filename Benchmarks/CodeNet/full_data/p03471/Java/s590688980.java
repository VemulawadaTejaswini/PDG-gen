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
        Otoshidama solver = new Otoshidama();
        solver.solve(1, in, out);
        out.close();
    }

    static class Otoshidama {
        int n;
        long y;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextInt();
            y = in.nextLong();
            for (int i = 0; i <= n; i++) {
                // 10,000
                for (int j = 0; i + j <= n; j++) {
                    // 5,000
                    for (int k = 0; i + j + k <= n; k++) {
                        // 1,000
                        long calc = i * 10000 + j * 5000 + k * 1000;
                        if (calc == y) {
                            out.println(String.format("%d %d %d", i, j, k));
                            return;
                        }
                        if (calc > y) {
                            break;
                        }
                    }
                    long calc = i * 10000 + j * 5000;
                    if (calc == y) {
                        out.println(String.format("%d %d %d", i, j, 0));
                        return;
                    }
                    if (calc > y) {
                        break;
                    }
                }
                long calc = i * 10000;
                if (calc == y) {
                    out.println(String.format("%d %d %d", i, 0, 0));
                    return;
                }
                if (calc > y) {
                    break;
                }
            }
            out.println(String.format("%d %d %d", -1, -1, -1));
        }

    }
}

