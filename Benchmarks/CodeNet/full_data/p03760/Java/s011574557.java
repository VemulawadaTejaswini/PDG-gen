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
        ABC058_B solver = new ABC058_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC058_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String O = in.next();
            String E = in.next();
            int len = O.length() + E.length();
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < len; ++i) {
                if ((i + 1) % 2 == 0) {
                    ans.append(E.charAt(i / 2));
                } else {
                    ans.append(O.charAt(i / 2));
                }
            }
            out.println(ans);
        }

    }
}

