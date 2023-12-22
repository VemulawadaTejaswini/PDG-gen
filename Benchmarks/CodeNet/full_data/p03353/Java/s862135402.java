import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

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
        ABC097_C solver = new ABC097_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC097_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int k = in.nextInt();

            ArrayList<String> sub = new ArrayList<>();

            for (int i = 0; i <= s.length(); i++) {
                for (int j = i; j <= i + k; j++) {
                    if (j <= s.length() && i != j) {
                        String subStr = s.substring(i, j);
                        if (!sub.contains(subStr)) {
                            sub.add(s.substring(i, j));
                        }
                    }
                }
            }

            Collections.sort(sub);

            out.print(sub.get(k - 1));
        }

    }
}

