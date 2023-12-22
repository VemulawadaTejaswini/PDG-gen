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
        ABC127_b solver = new ABC127_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC127_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int r = in.nextInt();
            int D = in.nextInt();
            int x2000 = in.nextInt();
            int bef = x2000;

            for (int i = 0; i < 10; i++) {
                bef = r * bef - D;
                out.println(bef);
            }
        }

    }
}

