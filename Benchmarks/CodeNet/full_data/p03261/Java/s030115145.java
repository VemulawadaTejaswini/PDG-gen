import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hakamada
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC109_2 solver = new ABC109_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC109_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            String[] W = new String[N];

            for (int i = 0; i < N; i++) {
                W[i] = in.next();
            }
            boolean dup = false;

            for (int i = 0; i < W.length; i++) {
                String val = W[i];
                W[i] = "_" + W[i];
                if (Arrays.asList(W).contains(val)) {
                    out.println("No");
                    return;
                }
                if (i > 0) {
                    if (W[i - 1].substring(W[i - 1].length() - 1).compareTo(val.substring(0, 1)) != 0) {
                        out.println("No");
                        return;
                    }
                }
            }
            out.println("Yes");

        }

    }
}

