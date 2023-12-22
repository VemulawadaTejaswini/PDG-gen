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
        BOneClue solver = new BOneClue();
        solver.solve(1, in, out);
        out.close();
    }

    static class BOneClue {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int k = in.nextInt();
            int x = in.nextInt();
            for (int i = x - k + 1; i < x + k; i++) {
                out.print(i);
                out.print(' ');
            }
        }

    }
}

