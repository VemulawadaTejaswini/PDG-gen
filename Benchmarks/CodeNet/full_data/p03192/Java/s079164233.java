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
        CADDi_A solver = new CADDi_A();
        solver.solve(1, in, out);
        out.close();
    }

    static class CADDi_A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] n = Integer.toString(in.nextInt()).toCharArray();

            int ans = 0;
            for (char c : n) {
                if (c == '2') {
                    ans++;
                }
            }

            out.print(ans);

        }

    }
}

