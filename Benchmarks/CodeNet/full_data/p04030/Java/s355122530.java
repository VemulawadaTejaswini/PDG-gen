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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] s = in.next().toCharArray();
            int index = 0;
            char[] ans = new char[10];
            for (char c : s) {
                if (c == 'B') {
                    ans[index] = 0;
                    if (index > 0) {
                        index--;
                    }
                } else {
                    ans[index++] = c;
                }
            }
            out.println(new String(ans).trim());
        }

    }
}

