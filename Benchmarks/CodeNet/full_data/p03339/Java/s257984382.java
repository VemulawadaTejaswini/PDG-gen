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
        Attention solver = new Attention();
        solver.solve(1, in, out);
        out.close();
    }

    static class Attention {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();

            int cost = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int wcount = n - i;
                int ecount = i;
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (j < i) {
                        if (s[j] == 'W') {

                        } else if (s[j] == 'E') {
                            ecount--;
                        }
                    } else {
                        if (s[j] == 'W') {
                            wcount--;
                        } else if (s[j] == 'E') {

                        }
                    }
                }
                cost = Math.min(cost, wcount + ecount - 1);
            }
            out.println(cost);
        }

    }
}

