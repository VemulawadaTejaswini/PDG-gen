import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AHarmony solver = new AHarmony();
        solver.solve(1, in, out);
        out.close();
    }

    static class AHarmony {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long a = in.nextLong();
            long b = in.nextLong();
            if ((a + b) % 2 == 0) {
                out.println((a + b) / 2);
            } else {
                out.println("IMPOSSIBLE");
            }
        }

    }
}

