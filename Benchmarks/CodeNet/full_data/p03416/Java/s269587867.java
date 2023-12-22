import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC090B solver = new ABC090B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC090B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();
            int ans = 0;
            for (int i = A; i <= B; i++) {
                String s = "" + i;
                if (s.charAt(0) == s.charAt(4)
                        && s.charAt(1) == s.charAt(3)) {
                    ans++;
                }
            }
            out.println(ans);
        }

    }
}

