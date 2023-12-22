import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CStrangeBank solver = new CStrangeBank();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStrangeBank {
        static final int[] C6 = {6, 36, 216, 1296, 7776, 46656};
        static final int[] C9 = {9, 81, 729, 6561, 59049};
        int[] m;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            m = new int[n + 1];
            out.println(min(n));
        /*for (int i : CHOICES) {
            if (i <= n) {
                m[i] = 1;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (m[i] > 0) {
                continue;
            }
            int min = Integer.MAX_VALUE;
            for (int j = 1; 2 * j <= i; j++) {
                min = Math.min(m[j] + m[i - j], min);
            }
            m[i] = min;
        }

        out.println(m[n]);*/
        }

        int min(int n) {
            if (n == 0) {
                return 0;
            }
            int min = Integer.MAX_VALUE;
            for (int i = C6.length - 1; i >= 0; i--) {
                if (n > C6[i]) {
                    min = min(n - C6[i]) + 1;
                    break;
                }
            }
            for (int i = C9.length - 1; i >= 0; i--) {
                if (n > C9[i]) {
                    min = Math.min(min, min(n - C9[i]) + 1);
                    break;
                }
            }
            if (min == Integer.MAX_VALUE) {
                return min(n - 1) + 1;
            } else {
                return min;
            }
        }

    }
}

