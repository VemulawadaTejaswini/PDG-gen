import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Xinyi Tao
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AHarmonyABC135 solver = new AHarmonyABC135();
        solver.solve(1, in, out);
        out.close();
    }

    static class AHarmonyABC135 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a == b) out.println(0);
            else if ((a + b) % 2 == 1) out.println("IMPOSSIBLE");
            else out.println((a + b) / 2);
        }

    }
}

