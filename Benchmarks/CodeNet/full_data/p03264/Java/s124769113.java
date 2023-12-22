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
        ABC108A solver = new ABC108A();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC108A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int K = in.nextInt();
            int ans = 0;
            for (int i = 1; i <= K - 1; i++) {
                for (int j = i + 1; j <= K; j++) {
                    if ((i + j) % 2 == 1) {
                        ans++;
                    }
                }
            }
            out.println(ans);
        }

    }
}

