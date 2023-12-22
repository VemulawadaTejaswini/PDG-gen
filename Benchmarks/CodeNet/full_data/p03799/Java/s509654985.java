import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSccPuzzle solver = new CSccPuzzle();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSccPuzzle {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long s = in.nextLong();
            long c = in.nextLong();

            // C二個でSを作れるので…
            // まずsを使いきれるか
            if (s * 2 <= c) {
                long ans = s;
                c -= s * 2;
                out.println(ans + c / 4);
            } else {
                out.println(c / 2);
            }

        }

    }
}

