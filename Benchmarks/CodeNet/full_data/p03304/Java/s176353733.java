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
        COrdinaryBeauty solver = new COrdinaryBeauty();
        solver.solve(1, in, out);
        out.close();
    }

    static class COrdinaryBeauty {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt(), d = in.nextInt();
            int max = Math.max(m - 2 * d, 0);
            int min = Math.min(m, 2 * d);
            long sum = (n - 1) * (max * 2 + min);
            long div = 1;
            for (int i = 0; i < m; i++) {
                div *= n;
            }
            out.println(sum / ((double) div));
        }

    }
}

