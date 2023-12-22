import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
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
        CTrainTicket solver = new CTrainTicket();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTrainTicket {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int[] a = in.next().chars().map(i -> i - '0').toArray();
            for (int i = 0; i < 8; i++) {
                StringBuilder exp = new StringBuilder(Integer.toString(a[0]));
                int val = a[0];
                for (int j = 0; j < 3; j++) {
                    exp.append((i & 1 << j) > 0 ? "+" : "-");
                    exp.append(a[j + 1]);
                    val += a[j + 1] * ((i & 1 << j) > 0 ? 1 : -1);
                }
                if (val == 7) {
                    out.println(exp.append("=7"));
                    return;
                }
            }
        }

    }
}

