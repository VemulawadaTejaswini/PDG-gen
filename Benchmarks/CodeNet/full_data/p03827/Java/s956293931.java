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
        AtCoder solver = new AtCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class AtCoder {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            String str = in.next();
            int max = 0; // min is 0
            int current = 0;

            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == 'I') {
                    current++;
                } else {
                    current--;
                }
                if (max < current)
                    max = current;
            }
            out.println(max);
        }

    }
}

