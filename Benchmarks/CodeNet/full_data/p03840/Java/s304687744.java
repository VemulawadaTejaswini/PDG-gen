import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CTetrominoTiling solver = new CTetrominoTiling();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTetrominoTiling {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            long res = 0;
            long i = in.nextInt();
            int o = in.nextInt();
            int t = in.nextInt();
            long j = in.nextInt();
            long l = in.nextInt();
            int s = in.nextInt();
            int z = in.nextInt();
            res += (long) o * 2;
            long cmp = i / 2 * 4 + j / 2 * 4 + l / 2 * 4;
            if (i > 0 && j > 0 && l > 0) cmp = Math.max(cmp, (i - 1) / 2 * 4 + (j - 1) / 2 * 4 + (l - 1) / 2 * 4 + 6);

            out.println(res / 2 + cmp / 2);
        }

    }
}

