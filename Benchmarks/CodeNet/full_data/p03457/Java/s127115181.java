import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AEoui
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int curT = 0;
            int curX = 0;
            int curY = 0;

            for (int i = 0; i < n; ++i) {
                int t = in.nextInt();
                int x = in.nextInt();
                int y = in.nextInt();

                int minD = Math.abs(x - curX) + Math.abs(y - curY);
                if (minD > (t - curT)) {
                    out.println("No");
                    return;
                } else {
                    if (minD % 2 != (t - curT) % 2) {
                        out.println("No");
                        return;
                    }
                }

                curT = t;
                curX = x;
                curY = y;
            }

            out.println("Yes");
        }

    }
}

