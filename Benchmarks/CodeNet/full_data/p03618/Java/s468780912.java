import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author CodeMonk
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            long n = s.length();
            long ans = n * (n - 1) / 2;
            long ex = 0;
            int[] freq = new int[26];
            for (int i = 0; i < n; i++) {
                int c = s.charAt(i) - 'a';
                freq[c]++;
            }
            for (int i = 0; i < 26; i++) {
                long x = freq[i];

                ex += (x * (x - 1) / 2);
            }
            out.println(1 + ans - ex);
        }

    }
}

