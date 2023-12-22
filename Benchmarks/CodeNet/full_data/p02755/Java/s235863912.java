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
        CTaxIncrease solver = new CTaxIncrease();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTaxIncrease {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());

            int r = -1;
            for (double i = 1; i <= 1000; i++) {
                boolean result = (int) (i * 0.08) == a && (int) (i * 0.1) == b;
                if (result) {
                    r = (int) i;
                    break;
                } else if ((int) (i * 0.08) > a || (int) (i * 0.1) > b) {
                    break;
                }
            }
            out.append(String.valueOf(r));
        }

    }
}

