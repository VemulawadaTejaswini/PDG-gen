import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        ABC105_2 solver = new ABC105_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC105_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int NN = in.nextInt();

            if ((NN % 4) == 0) {
                out.println("Yes");
                return;
            }

            if ((NN % 7) == 0) {
                out.println("Yes");
                return;
            }

            for (int i = 4; i < NN; i += 4) {
                if ((NN - i) % 7 == 0) {
                    out.println("Yes");
                    return;
                }
            }
            out.println("No");
        }

    }
}

