import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BUnevenNumbers solver = new BUnevenNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class BUnevenNumbers {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (digits(i) % 2 == 1)
                    count++;
            }
            out.println(count);
        }

        int digits(int n) {
            if (n <= 0) {
                return 0;
            }
            return 1 + digits(n / 10);
        }

    }
}

