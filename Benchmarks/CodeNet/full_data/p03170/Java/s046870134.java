import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vdewansa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        KStones solver = new KStones();
        solver.solve(1, in, out);
        out.close();
    }

    static class KStones {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] a = new int[K + 1];
            for (int i = 1; i <= N; i++) {
                a[i] = in.nextInt();
            }
            int[] s = new int[K + 1];
            for (int k = 0; k <= K; k++) {
                s[k] = -1;
                for (int x = 1; x <= N && a[x] <= k; x++) {
                    s[k] = Math.max(s[k], -s[k - a[x]]);
                }
            }
            if (s[K] > 0) {
                out.println("First");
            } else {
                out.println("Second");
            }
        }

    }
}

