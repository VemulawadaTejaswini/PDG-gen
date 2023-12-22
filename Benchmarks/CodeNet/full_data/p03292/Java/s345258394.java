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
 * @author hakamada
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AtCoder103_1 solver = new AtCoder103_1();
        solver.solve(1, in, out);
        out.close();
    }

    static class AtCoder103_1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int[] inp = new int[3];

            inp[0] = in.nextInt();
            inp[1] = in.nextInt();
            inp[2] = in.nextInt();

            int total[] = {0, 0, 0, 9999};

            total[0] = Math.abs(inp[0] - inp[1]);
            total[0] += Math.abs(inp[1] - inp[2]);

            total[1] = Math.abs(inp[0] - inp[2]);
            total[1] += Math.abs(inp[0] - inp[1]);

            total[2] = Math.abs(inp[1] - inp[2]);
            total[2] += Math.abs(inp[0] - inp[1]);

            total[3] = Math.abs(inp[1] - inp[2]);
            total[3] += Math.abs(inp[0] - inp[2]);

        /*
        total[2] = Math.abs(inp[1] - inp[2]);
        total[2] += Math.abs(inp[3] - inp[2]);
        */

            Arrays.sort(total);
            out.println(total[0]);
        }

    }
}

