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
        Nikkei_1 solver = new Nikkei_1();
        solver.solve(1, in, out);
        out.close();
    }

    static class Nikkei_1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int X = in.nextInt();
            int Y = in.nextInt();

            int Max = Math.max(X, Y);

            int a = (X + Y);

            out.print(a - Max);
            out.print(" ");
            if ((a - N) < 0) {
                out.println(0);
            } else {
                out.println(a - N);
            }
        }

    }
}

