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
        CRemainderMinimization2019 solver = new CRemainderMinimization2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class CRemainderMinimization2019 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long l = in.nextInt();
            long r = in.nextInt();
            long res = Long.MAX_VALUE;
            for (long i = l; i <= r && i <= l + 2019; i++) {
                for (long j = i + 1; j <= r && j <= i + 2020; j++) {
                    res = Math.min(res, (i * j) % 2019);
                }
            }
            out.println(res);
        }

    }
}

