import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CFlipFlipandFlip solver = new CFlipFlipandFlip();
        solver.solve(1, in, out);
        out.close();
    }

    static class CFlipFlipandFlip {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int res = 0;
            if (a == 1 && b == 1) {
                res = 1;
            } else if (a == 1) {
                res = b - 2;
            } else if (b == 1) {
                res = a - 2;
            } else {
                res = (a - 2) * (b - 2);
            }
            out.println(res);
        }

    }
}

