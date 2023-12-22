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
        BPopularVote solver = new BPopularVote();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPopularVote {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());

            int[] a = new int[n];
            double total = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
                total += a[i];
            }
            double ashikiri = total / (4 * m);
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > ashikiri) {
                    count++;
                }
            }
            if (count >= m) {
                out.println("Yes");
            } else {
                out.println("No");
            }

        }

    }
}

