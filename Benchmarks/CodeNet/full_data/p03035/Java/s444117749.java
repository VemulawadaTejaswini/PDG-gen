import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Abhijeetkns
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AFerrisWheel solver = new AFerrisWheel();
        solver.solve(1, in, out);
        out.close();
    }

    static class AFerrisWheel {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a >= 13) out.println(b);
            else if (a >= 6 && a <= 12) out.println(b / 2);
            else {
                out.println(0);
            }
        }

    }
}

