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
        BStoneMonument solver = new BStoneMonument();
        solver.solve(1, in, out);
        out.close();
    }

    static class BStoneMonument {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt(), b = in.nextInt();
            long res = 0;
            for (int i = 1; i <= (b - a); i++) {
                res += i;
            }
            out.println(res - b);
        }

    }
}

