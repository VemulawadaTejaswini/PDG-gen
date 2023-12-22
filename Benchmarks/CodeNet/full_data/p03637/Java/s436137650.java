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
        Fouradjacent solver = new Fouradjacent();
        solver.solve(1, in, out);
        out.close();
    }

    static class Fouradjacent {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int is_two = 0;
            int is_four = 0;
            int is_one = 0;
            for (int i = 0; i < n; i++) {
                long a = in.nextLong();
                if (a % 4 == 0) {
                    is_four++;
                } else if (a % 2 == 0) {
                    is_two++;
                } else {
                    is_one++;
                }
            }

            if (is_two > 0) {
                is_one++;
            }
            if (is_one > (is_four + 1)) {
                out.print("No");
            } else {
                out.print("Yes");
            }
        }

    }
}

