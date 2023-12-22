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
        static final int[] CHOICES = {1, 6, 9, 36, 81, 216, 729, 1296, 6561, 7776, 46656, 59049};

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] m = new int[n + 1];
            for (int i : CHOICES) {
                if (i <= n) {
                    m[i] = 1;
                }
            }
            for (int i = 2; i <= n; i++) {
                if (m[i] == 1) {
                    continue;
                }
                int min = Integer.MAX_VALUE;
                for (int j = 1; 2 * j <= i; j++) {
                    min = Math.min(m[j] + m[i - j], min);
                }
                m[i] = min;
            }

            out.println(m[n]);
        }

    }
}

