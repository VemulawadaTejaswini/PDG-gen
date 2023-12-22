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
        SevenFiveFive solver = new SevenFiveFive();
        solver.solve(1, in, out);
        out.close();
    }

    static class SevenFiveFive {
        long n;
        long result = 0;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextLong();
            dfs("7", "");
            dfs("5", "");
            dfs("3", "");

            out.print(result);

        }

        public void dfs(String digit, String str) {

            String s = str.concat(digit);
            long v = Long.parseLong(s);
            if (n < v) {
                return;
            }
            if (s.contains("7") && s.contains("5") && s.contains("3")) {
                result++;
            }
            dfs("7", Long.toString(v));
            dfs("5", Long.toString(v));
            dfs("3", Long.toString(v));
        }

    }
}

