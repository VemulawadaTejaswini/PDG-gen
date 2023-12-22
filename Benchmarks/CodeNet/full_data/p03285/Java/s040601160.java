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
        ABC105_B solver = new ABC105_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC105_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            String ans = "No";
            for (int i = 0; i <= 100; i++) {
                for (int j = 0; j <= 100; j++) {
                    if (4 * i + 7 * j == n) {
                        ans = "Yes";
                    }
                }
            }

            out.print(ans);

        }

    }
}

