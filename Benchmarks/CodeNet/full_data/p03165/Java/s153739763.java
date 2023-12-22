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
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            String t = in.next();
            int n = s.length();
            int m = t.length();
            int[][] lcs = new int[n + 1][m + 1];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= m; j++) {
                    if (i == 0 || j == 0) {
                        lcs[i][j] = 0;
                    } else if (s.charAt(i - 1) == t.charAt(j - 1)) {
                        lcs[i][j] = 1 + lcs[i - 1][j - 1];
                    } else {
                        lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
                    }
                }
            }
            int i = n, j = m;
            while (i > 0 && j > 0) {
                if (lcs[i][j] == lcs[i - 1][j]) {
                    i -= 1;
                } else if (lcs[i][j] == lcs[i][j - 1]) {
                    j -= 1;
                } else if (lcs[i][j] == 1 + lcs[i - 1][j - 1]) {
                    i -= 1;
                    j -= 1;
                    sb.append(s.charAt(i));
                }
            }
            out.println(sb.reverse().toString());
        }

    }
}

