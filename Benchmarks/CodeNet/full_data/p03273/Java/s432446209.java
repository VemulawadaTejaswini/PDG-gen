import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        BGridCompression solver = new BGridCompression();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGridCompression {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt();
            String[] s = new String[h];
            boolean[] x = new boolean[w];
            Arrays.fill(x, true);
            for (int i = 0; i < h; i++) {
                s[i] = in.next();
                for (int j = 0; j < w; j++) {
                    if (s[i].charAt(j) == '#') {
                        x[j] = false;
                    }
                }
            }
            for (int i = 0; i < h; i++) {
                if (s[i].indexOf('#') < 0) {
                    continue;
                }
                for (int j = 0; j < w; j++) {
                    if (!x[j]) {
                        out.print(s[i].charAt(j));
                    }
                }
                out.println();
            }
        }

    }
}

