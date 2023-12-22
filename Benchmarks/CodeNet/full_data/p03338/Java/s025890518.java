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
        ABC098_B solver = new ABC098_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC098_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            String str = in.next();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                String x = str.substring(0, i);
                String y = str.substring(i);

                int cnt = 0;
                for (char c = 'a'; c != 'z'; c++) {
                    if (x.indexOf(c) != -1 && y.indexOf(c) != -1) {
                        cnt++;
                    }
                }
                ans = Math.max(ans, cnt);
            }

            out.print(ans);
        }

    }
}

