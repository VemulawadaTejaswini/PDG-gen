import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC097B solver = new ABC097B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC097B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int X = in.nextInt();
            for (int i = X; i >= 0; i--) {
                if (isPower(i)) {
                    out.println(i);
                    return;
                }
            }
            return;
        }

        public static boolean isPower(int num) {
            if (num == 1) return true;
            for (int n = 2; Math.pow(num, 1.0 / n) >= 2.0; n++) {
                double nThRoot = Math.pow(num, 1.0 / n);
                if (nThRoot - Math.floor(nThRoot) == 0.0)
                    return true;
            }
            return false;
        }

    }
}

