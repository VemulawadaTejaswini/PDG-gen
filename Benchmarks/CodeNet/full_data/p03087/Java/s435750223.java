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
        CGeTAC solver = new CGeTAC();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGeTAC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int q = Integer.parseInt(in.next());
            String S = in.next();

            // 出力
            int[] s = new int[n + 1];
            for (int i = 0; i < n; i++) {
                if (i + 1 < n && S.charAt(i) == 'A' && S.charAt(i + 1) == 'C') s[i + 1] = s[i] + 1;
                else s[i + 1] = s[i];
            }
            for (int i = 0; i < q; i++) {
                int l = Integer.parseInt(in.next());
                int r = Integer.parseInt(in.next());
                --l;
                --r;
                out.println(s[r] - s[l]);

            }

        }

    }
}

