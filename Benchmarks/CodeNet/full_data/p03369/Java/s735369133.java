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
        ABC095_A solver = new ABC095_A();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC095_A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String str = in.next();
            int cnt = 0;
            for (char c : str.toCharArray()) {
                if (c == 'o') {
                    cnt++;
                }
            }

            out.print(700 + cnt * 100);
        }

    }
}

