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
        ABC117_1 solver = new ABC117_1();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC117_1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            //float T = in.nextInt();
            //float X = in.nextInt();
            out.println(
                    (float) in.nextInt() / (float) in.nextInt()
            );

        }

    }
}

